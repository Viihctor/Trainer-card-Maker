/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemontrainercard;

/**
 *
 * @author victo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private static final String URL = "jdbc:sqlite:trainercards.db";
    
     private static String LoginId;

    public static String getLoginId() {
        return LoginId;
    }

    public static void setLoginId(String value) {
        LoginId = value;
    }

    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(URL);
            createTable();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS trainers (" +
                     "tid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "trainerName TEXT NOT NULL, " +
                     "trainerPass TEXT NOT NULL, " +
                     "trainerClass TEXT, " +
                     "cardColor TEXT, " +
                     "pokemon1 TEXT, " +
                     "pokemon2 TEXT, " +
                     "pokemon3 TEXT, " +
                     "pokemon4 TEXT, " +
                     "pokemon5 TEXT, " +
                     "pokemon6 TEXT)";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar tabela trainers", e);
        }
    }
}
