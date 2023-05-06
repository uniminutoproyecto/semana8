package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

   private static String base;

   Connection con = null;

   public static final String BASE = "tienda"; //Nombre de la base de datos
   public static final String URL = "jdbc:mysql://localhost:3306" + BASE; //Direccion, puerto y nombre de la Base de Datos
   public static final String USER = "root"; //Usuario de Acceso a MySQL
   public static final String PASSWORD = ""; //Password del usuario

    public Connection getConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
}
