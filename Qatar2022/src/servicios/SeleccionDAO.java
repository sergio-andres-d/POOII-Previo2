/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Continente;
import modelo.Seleccion;

/**
 *
 * @author Estudiante
 */
public class SeleccionDAO {

    public static void agregar(Seleccion s, Connection conexion) throws SQLException {
        try {
            PreparedStatement insert;
            insert = conexion.prepareStatement("INSERT INTO `seleccion` VALUES(?,?,?,?,?,?,?,?,?)");
            insert.setInt(1, s.getId());
            insert.setString(2, s.getNombre());
            insert.setInt(3, s.getContinente().getId());
            insert.setString(4, s.getTecnico());
            insert.setInt(5, s.getGolesFavor());
            insert.setInt(6, s.getGolesContra());
            insert.setInt(7, s.getPartidosGanados());
            insert.setInt(8, s.getPartidosPerdidos());
            insert.setInt(9, s.getPartidosJugados());
            insert.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new SQLException(ex.getMessage());
        }
    }

    public static ArrayList<Seleccion> listar(Continente[] continente, Connection conexion) throws SQLException {
        ArrayList<Seleccion> lista = new ArrayList<>();
        try {
            PreparedStatement select;
            select = conexion.prepareStatement("SELECT * FROM `seleccion`");
            ResultSet rs = select.executeQuery();
            while (rs.next()) {
                Seleccion s = new Seleccion();
                s.setId(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setContinente(continente[rs.getInt(2)]);
                s.setTecnico(rs.getString(4));
                s.setGolesFavor(rs.getInt(5));
                s.setGolesContra(rs.getInt(6));
                s.setPartidosGanados(rs.getInt(7));
                s.setPartidosPerdidos(rs.getInt(8));
                s.setPartidosJugados(rs.getInt(9));
                lista.add(s);
            }
            return lista;

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new SQLException(ex.getMessage());
        }

    }
public static void actualizar(int id,Seleccion s, Connection conexion) throws SQLException {

        try {
            PreparedStatement insert;
            insert = conexion.prepareStatement("UPDATE `seleccion` SET `nombre` = ?, `coninente_id` = ?, `tecnico` = ?, `goles_favor` = ?, `goles_contra` = ?, `partidos_ganados` = ?, `partidos_perdidos` = ?, `partidos_jugados` = ? WHERE `seleccion`.`id` = ?;");
            insert.setInt(9, id);
            insert.setString(1, s.getNombre());
            insert.setInt(2, s.getContinente().getId());
            insert.setString(3, s.getTecnico());
            insert.setInt(4, s.getGolesFavor());
            insert.setInt(5, s.getGolesContra());
            insert.setInt(6, s.getPartidosGanados());
            insert.setInt(7, s.getPartidosPerdidos());
            insert.setInt(8, s.getPartidosJugados());
            insert.executeUpdate();
            insert.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new SQLException(ex.getMessage());
        }

    }
}
