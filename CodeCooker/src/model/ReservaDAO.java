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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael, marcelo
 */
public class ReservaDAO extends DAO{
    
    private static ReservaDAO instance;
    private static Connection myCONN;

    public ReservaDAO getInstance() {
        if (this.instance == null) {
            instance = new ReservaDAO();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(short numMesa, String nome, Time horario, short numPessoas, String telefone) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO Reserva (numMesa, Nome, Horario, numPessoas, telefone) "
                    + "VALUES (?, ?, ?, ?, ?)");
            stmt.setShort(1, numMesa);
            stmt.setString(2, nome);
            stmt.setTime(3, horario);
            stmt.setShort(4, numPessoas);
            stmt.setString(5, telefone);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private Reserva buildObject(ResultSet rs) {
        Reserva r = null;
        try {
            r = new Reserva(rs.getShort("numMesa"), rs.getString("Nome"), rs.getTime("horario"), rs.getShort("numPessoas"), rs.getString("Telefone"));
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
        return this.retrieveGeneric("SELECT * FROM Reserva ORDER BY idReserva");
    }
    
    public List<Reserva> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM Reserva WHERE Nome LIKE '%"+nome+"%' ORDER BY Nome");
    }
    
    public Reserva retrieveById(int id) {
        Reserva reserva = null;
        List<Reserva> reservas = this.retrieveGeneric("SELECT * FROM Reserva WHERE id="+id);
        if(!reservas.isEmpty()){
            reserva = reservas.get(0);
        }
        return reserva;
    }
    
    public boolean update(Reserva r) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE Reserva SET numMesa=?, Nome=?, Horario=?, numPessoas=?, Telefone=? WHERE id = ?");
            stmt.setShort(1, r.getNumPessoas());
            stmt.setString(2, r.getNome());
            stmt.setTime(3, r.getHorario());
            stmt.setShort(4, r.getNumPessoas());
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
            stmt = myCONN.prepareStatement("DELETE FROM Reserva WHERE idReserva = ?");
            stmt.setInt(1, r.getIdReserva());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
}