/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genius;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lorena
 */
public class Tabelas {

    private static final String TB_CONTATOS = "create table if not exists contatos(id int(5) not null auto_increment, primeiroNome varchar(255) not null, ultimoNome varchar(255) not null, email varchar(255) not  null, endereco varchar(255) not null, dataNascimento date not null, localDeTrabalho_id int(5) not null, cargo varchar(255) not null, primary key(id), FOREIGN KEY(localDeTrabalho_id) REFERENCES localDeTrabalho(id))";
    private static final String TB_LOCALDETRABALHO = "create table if not exists localDeTrabalho(id int(5) not null auto_increment, nome varchar(150) not null, endereco varchar(255) not null, primary key(id))";

    public static void criaTabelas() {
        Connection connection = ConnectionFactory.getConnection();
        Statement st = null;
        try {
            st = connection.createStatement();
            st.clearBatch();
            st.addBatch(TB_LOCALDETRABALHO);
            st.addBatch(TB_CONTATOS);
            st.executeBatch();
            st.close();
        } catch (SQLException e) {
        } finally {
            try {
                st.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void limpaTabelas() {
        Connection connection = ConnectionFactory.getConnection();
        Statement st = null;
        try {
            st = connection.createStatement();
            st.clearBatch();
            st.addBatch("drop table if exists contatos");
            st.addBatch("drop table if exists localDeTrabalho");
            st.executeBatch();
            st.close();
        } catch (SQLException e) {
        } finally {
            try {
                st.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
}
