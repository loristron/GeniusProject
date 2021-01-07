/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genius;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lorena
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/genius", "root", "");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
}
