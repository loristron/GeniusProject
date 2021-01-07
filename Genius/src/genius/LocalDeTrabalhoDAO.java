/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genius;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author alunos
 */
public class LocalDeTrabalhoDAO {

    private Connection connection;

    public void adiciona(LocalDeTrabalho localDeTarabalho) throws SQLException {
        String sql = "insert into contatos" + "(nome,endereco)" + "values(?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, localDeTarabalho.getNome());
        stmt.setString(2, localDeTarabalho.getEndereco());

    }

    public List<LocalDeTrabalho> getListaLocalDeTrabalho() throws SQLException {
        List<LocalDeTrabalho> locaisDeTrabalho;
        PreparedStatement stmt = this.connection.prepareStatement(" select * from contatos");
        ResultSet rs = stmt.executeQuery();
        locaisDeTrabalho = new ArrayList<LocalDeTrabalho>();
        while (rs.next()) {
            // criando o objeto Contato
            LocalDeTrabalho localDeTrabalho = new LocalDeTrabalho();
            localDeTrabalho.setNome(rs.getString("nome"));
            localDeTrabalho.setEndereco(rs.getString("endereco"));
            locaisDeTrabalho.add(localDeTrabalho);
        }
        rs.close();
        connection.close();
        return locaisDeTrabalho;
    }

    public static LocalDeTrabalho getLocalDeTrabalhoByNome(String nome) throws SQLException {
        LocalDeTrabalho localDeTrabalho = null;
        PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement("select * from localDeTrabalho where nome=?");
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
          localDeTrabalho = new LocalDeTrabalho();
          localDeTrabalho.setNome(rs.getString("nome"));
          localDeTrabalho.setEndereco(rs.getString("endereco"));
          localDeTrabalho.setId(rs.getInt("id"));
        }
        rs.close();
        stmt.close();
        return localDeTrabalho;
               
    }
    
}
