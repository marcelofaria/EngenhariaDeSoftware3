/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael, marcelo
 */
public class ReservaDAO extends DAO{
    
    private static ReservaDAO instance;
    private static Connection myCONN;

    public static ReservaDAO getInstance() {
        if (ReservaDAO.instance == null) {
            instance = new ReservaDAO();
            myCONN = ReservaDAO.getInstance().getConnection();
            return ReservaDAO.instance;
        } else {
            return ReservaDAO.instance;
        }
    }
    
    public void create(int numMesa, int usuarioID, String nome, String horario, int numPessoas, String telefone) throws SQLException {
        PreparedStatement stmt;
        stmt = myCONN.prepareStatement("INSERT INTO reserva (numMesa, usuarioID, nome, dataEHorario, numPessoas, telefone) "
                + "VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, numMesa);
        stmt.setInt(2, usuarioID);
        stmt.setString(3, nome);
        stmt.setString(4, horario);
        stmt.setInt(5, numPessoas);
        stmt.setString(6, telefone);
        this.executeUpdate(stmt);
        stmt.close();
    }
    
    private Reserva buildObject(ResultSet rs) {
        Reserva r = null;
        try {
            r = new Reserva(rs.getInt("reservaID"), rs.getInt("numMesa"), rs.getString("nome"), rs.getTime("dataEHorario"), rs.getInt("numPessoas"), rs.getString("telefone"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return r;
    }
    
    public List<Reserva> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Reserva> reservas = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                reservas.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return reservas;
    }
    
    public List<Reserva> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM reserva ORDER BY reservaID");
    }
    
    public List<Reserva> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM reserva WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public Reserva retrieveById(int id) {
        Reserva reserva = null;
        List<Reserva> reservas = this.retrieveGeneric("SELECT * FROM reserva WHERE reservaID="+id);
        if(!reservas.isEmpty()){
            reserva = reservas.get(0);
        }
        return reserva;
    }
    
    public boolean update(Reserva r) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE reserva SET numMesa=?, nome=?, dataEHorario=?, numPessoas=?, telefone=? WHERE reservaID = ?");
            stmt.setInt(1, r.getNumPessoas());
            stmt.setString(2, r.getNome());
            stmt.setTime(3, r.getHorario());
            stmt.setInt(4, r.getNumPessoas());
            stmt.setString(4, r.getTelefone());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public void delete(Reserva r) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM reserva WHERE reservaID = ?");
            stmt.setInt(1, r.getIdReserva());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
