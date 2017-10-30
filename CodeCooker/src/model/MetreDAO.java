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

/**
 *
 * @author rafael, marcelo
 */
public class MetreDAO extends DAO {
    
    private static MetreDAO instance;
    private static Connection myCONN;

    public MetreDAO() {
    }

    public static MetreDAO getInstance() {
        if (MetreDAO.instance == null) {
            instance = new MetreDAO();
            myCONN = instance.getConnection();
        }
        return instance;
    }
    
    public void create(String nome, String cpf) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO Metre (nome,cpf) VALUES (?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Metre buildObject(ResultSet rs) {
        Metre m = null;
        try {
            m = new Metre(rs.getString("senha"), rs.getString("nome"), rs.getString("cpf"));
        } catch (SQLException e) {
        }
        return m;
    }
    
    public List<Metre> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Metre> metres = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                metres.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return metres;
    }
    
    public List<Metre> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM Metre ORDER BY nome");
    }
    
    public List<Metre> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM Metre WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public Metre retrieveById(int id) {
        Metre m = null;
        List<Metre> metres = this.retrieveGeneric("SELECT * FROM Metre WHERE id="+id);
        if(!metres.isEmpty()){
            m = metres.get(0);
        }
        return m;
    }
    
    public boolean update(Metre metre) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE Metre SET nome=?, cpf=? WHERE id = ?");
            stmt.setString(1, metre.getNome());
            stmt.setString(2, metre.getCpf());
            stmt.setInt(3, metre.getIdMetre());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        return false;
    }
    
}
