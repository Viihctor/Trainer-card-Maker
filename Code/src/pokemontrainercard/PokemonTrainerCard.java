/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemontrainercard;
import java.sql.Connection;
import java.sql.Statement;
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
        // Teste de conexão com SQLite
        try {
            Connection conn = DatabaseConnection.getInstance().getConnection();
            System.out.println("Connected to SQLite database!");
        } catch (Exception e) {
            System.err.println("Error connecting to SQLite database: " + e.getMessage());
        }

        // Iniciar a interface gráfica
        new Menu().setVisible(true);
    }
}
