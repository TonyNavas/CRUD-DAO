package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection conexion;
    private Statement st;

    public Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("rjdbc:postgresql://localhost:5432/PEDIDOS","postgres", "123");
            st = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet CONSULTAR(String sql) throws SQLException {
        return st.executeQuery(sql);
    }
    public int GUARDAR(String sql) throws  SQLException{
        return st.executeUpdate(sql);
    }
    public void CERRAR(String sql){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
