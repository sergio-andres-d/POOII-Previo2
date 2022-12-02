/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.Year;
import modelo.Continente;
import vista.vista;

/**
 *
 * @author Estudiante
 */
public class Control implements ActionListener {

    private vista v;
    private Continente[] lista;
    Connection conexion;

    public Control(vista vista, Connection conexion) throws SQLException {
        this.conexion = conexion;
        this.v = vista;
        vista.jTextField3.setText(new Date(System.currentTimeMillis()).toString());
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        setActionListener(this);
    }

    public void setActionListener(ActionListener control) {
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Agregar")) {
            }
    }

}
