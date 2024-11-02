package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static DatabaseConnection instancia;
    private Connection connection;

    private String url = "jdbc:postgresql://localhost:5432/Proyecto";

    private String user = "postgres";

    private String contraseña = "123456";

    private DatabaseConnection() {
        try{
            connection = DriverManager.getConnection(url,user,contraseña);
            System.out.println("Conexion Exitosa");
        }catch(Exception e){
            System.out.println("error de conexion de base de datos " + e);
        }
    }

    public static DatabaseConnection getInstance(){
        if(instancia == null){
            instancia = new DatabaseConnection();
        }
        return instancia;
    }

    public Connection getConnection() {
        return connection;
    }
}
