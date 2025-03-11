/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemontrainercard;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 920415
 */








public class PokemonTrainerCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here:
        Connection conn = null;
        //Inicio do teste de conexão
        try {
            String url = "jdbc:mysql://localhost:3306/trainercards";
            String username = "root";
            String password = "Victor456";

            // Establish the connection
            conn = DriverManager.getConnection(url, username, password);

            // Perform database operations
            // ...

            System.out.println("Connected to MySQL database!");
        } catch (Exception e) {
            System.err.println("Error connecting to MySQL database: " + e.getMessage());
        } finally {
            // Close the connection
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    System.err.println("Error closing the connection: " + e.getMessage());
                }
            }
        }
        new Menu().setVisible(true);
    }
    
}
