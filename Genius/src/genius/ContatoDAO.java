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
public class ContatoDAO {

    private Connection connection;

    public ContatoDAO() {
        this.connection = new ConnectionFactory().getConnection();

    }

    public void adiciona(Contato contato) throws SQLException {
        String sql = "insert into contatos" + "(primeiroNome,ultimoNome, email, endereco, dataNascimento,cargo, localDeTrabalho)" + "values(?,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, contato.getPrimeiroNome());
        stmt.setString(2, contato.getUltimoNome());
        stmt.setString(3, contato.getEmail());
        stmt.setString(4, contato.getEndereco());
        stmt.setDate(5, new Date(contato.getDataNascimento().getTimeInMillis()));
        stmt.setString(6, contato.getCargo());
        stmt.setInt(7, contato.getEmpresa().getId());
    }

//    public List<Contato> getListaContato() throws SQLException {
//        List<Contato> contatos;
//        try (PreparedStatement stmt = this.connection.prepareStatement(" select * from contatos")) {
//            ResultSet rs = stmt.executeQuery();
//            contatos = new ArrayList<Contato>();
//            while (rs.next()) {
//                // criando o objeto Contato
//                Contato contato = new Contato();
//                contato.setPrimeiroNome(rs.getString("primeiroNome"));
//                contato.setUltimoNome(rs.getString("ultimoNome"));
//                contato.setEmail(rs.getString("email"));
//                contato.setEndereco(rs.getString("endereco"));
//                // montando a data através do Calendar
//                Calendar data = Calendar.getInstance();
//                data.setTime(rs.getDate("dataNascimento"));
//                contato.setDataNascimento(data);
//                contato.setLocalDeTrabalho(rs.getString("localDeTrabalho"));
//                contato.setCargo(rs.getString("cargo"));
//                // adicionando o objeto à lista
//                contatos.add(contato);
//            }
//            rs.close();
//            connection.close();
//        }
//        return contatos;
//    }
//
//    public void alteraContato(Contato contato) throws SQLException {
//        PreparedStatement stmt = this.connection.prepareStatement("update contato primeiroNome=?, ultimoNome=?, email=?, endereco=?, dataNascimento=?,localDeTrabalho=?, cargo=? where id=?");
//        stmt.setString(1, contato.getPrimeiroNome());
//        stmt.setString(2, contato.getUltimoNome());
//        stmt.setString(3, contato.getEmail());
//        stmt.setString(4, contato.getEndereco());
//        stmt.setDate(5, new Date(contato.getDataNascimento().getTimeInMillis()));
//        stmt.setString(6, contato.getLocalDeTrabalho());
//        stmt.setString(7, contato.getCargo());
//        stmt.setInt(8, contato.getId());
//    }
//
//    public static ArrayList<Contato> localizaContatoPrimeiroNome(String nome) throws SQLException {
//        ArrayList<Contato> listaContatosNome = new ArrayList<Contato>();
//        PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement("select * from contato where primeiroNome=?");
//        stmt.setString(1, nome);
//        ResultSet rs = stmt.executeQuery();
//        while (rs.next()) {
//            Contato temp = new Contato();
//            temp.setPrimeiroNome(rs.getNString("nome"));
//            temp.setUltimoNome(rs.getString("ultimoNome"));
//            temp.setEmail(rs.getString("email"));
//            temp.setEndereco("endereco");
//            Calendar data = Calendar.getInstance();
//            data.setTime(rs.getDate("dataNascimento"));
//            temp.setDataNascimento(data);
//            temp.setLocalDeTrabalho(rs.getString("localDeTrabalho"));
//            temp.setCargo(rs.getString("cargo"));
//            temp.setId(rs.getInt("id"));
//            listaContatosNome.add(temp);
//        }
//        rs.close();
//        stmt.close();
//        return listaContatosNome;
//    }
//
//    public void removeContato(Contato contato) throws SQLException {
//        PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement("reomve from contato where id=?");
//        stmt.setInt(1, contato.getId());
//        int regAlterados = stmt.executeUpdate();
//        stmt.close();
//    }
//
//    public static ArrayList<Contato> localizaContatoUltimoNome(String nome) throws SQLException {
//        ArrayList<Contato> listaContatosUltimoNome = new ArrayList<Contato>();
//        PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement("select * from contato where ultimoNome=?");
//        stmt.setString(1, nome);
//        ResultSet rs = stmt.executeQuery();
//        while (rs.next()) {
//            Contato temp = new Contato();
//            temp.setPrimeiroNome(rs.getNString("nome"));
//            temp.setUltimoNome(rs.getString("ultimoNome"));
//            temp.setEmail(rs.getString("email"));
//            temp.setEndereco("endereco");
//            Calendar data = Calendar.getInstance();
//            data.setTime(rs.getDate("dataNascimento"));
//            temp.setDataNascimento(data);
//            temp.setLocalDeTrabalho(rs.getString("localDeTrabalho"));
//            temp.setCargo(rs.getString("cargo"));
//            temp.setId(rs.getInt("id"));
//            listaContatosUltimoNome.add(temp);
//        }
//        rs.close();
//        stmt.close();
//        return listaContatosUltimoNome;
//    }

}
