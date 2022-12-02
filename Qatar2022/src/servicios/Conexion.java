/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class Conexion {
    public static Connection conexion;
    
    public static Connection getConexion () throws ClassNotFoundException, SQLException{
        if(conexion==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion= DriverManager.getConnection("jdbc:mysql://localhost/qatar2022","root","");
            } catch (ClassNotFoundException ex) {
                throw new ClassNotFoundException(ex.getMessage());
            } catch (SQLException ex) {
                throw new SQLException(ex.getMessage());
            }
            return conexion;
        }else return conexion;
    }
    public static void close() throws SQLException{
        if(conexion!=null) try {
            conexion.close();
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }
}
