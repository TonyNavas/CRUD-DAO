package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {
    private Connection conexion;
    private Statement st;

    public Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("rjdbc:postgresql://localhost:5432/PEDIDOS","postgres", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
