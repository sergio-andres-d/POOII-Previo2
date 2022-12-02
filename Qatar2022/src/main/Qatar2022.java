/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import control.Control;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicios.Conexion;
import vista.vista;

/**
 *
 * @author Estudiante
 */
public class Qatar2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Control c = new Control(new vista(), Conexion.getConexion());
        } catch (SQLException ex) {
            ex.printStackTrace();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
