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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael, marcelo
 */
public class MesaDAO extends DAO{
    
    private static MesaDAO instance;
    private static Connection myCONN;
    
    public static MesaDAO getInstance(){
        if(MesaDAO.instance == null){
            MesaDAO.instance = new MesaDAO();
            MesaDAO.myCONN = MesaDAO.instance.getConnection();
            return MesaDAO.instance;
        }
        else{
            return MesaDAO.instance;
        }
    }
    
    public void create(int numMesa, int status){
        PreparedStatement createMesa = null;
        String query = "INSERT INTO mesa (numMesa, status) VALUES (?, ?)";
        try {
            createMesa = MesaDAO.myCONN.prepareStatement(query);
            createMesa.setInt(1, numMesa);
            createMesa.setInt(2, status);
            this.executeUpdate(createMesa);
        } catch (SQLException ex) {
            Logger.getLogger(MesaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Mesa BuildObject(ResultSet rs){
        Mesa m = null;
        try {
            m = new Mesa(rs.getShort("numMesa"), rs.getInt("status"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }
    
    public List<Mesa> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Mesa> contatos = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                contatos.add(this.BuildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return contatos;
    }
    
    public List<Mesa> RetrieveAll(){
        return this.retrieveGeneric("SELECT * FROM mesa ORDER BY numMesa");
    }
    
    public Mesa retrieveById(short numMesa) {
        Mesa m = null;
        List<Mesa> mesas = this.retrieveGeneric("SELECT * FROM contatos WHERE id="+ numMesa);
        if(!mesas.isEmpty()){
            m = mesas.get(0);
        }
        return m;
    }
    
    public boolean update(Mesa m) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE mesa SET status=? WHERE numMesa = ?");
            stmt.setInt(1, m.getStatus());
            stmt.setInt(2, m.getNumMesa());
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
    
    public void delete(Mesa m) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM mesa WHERE numMesa = ?");
            stmt.setInt(1, m.getNumMesa());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
