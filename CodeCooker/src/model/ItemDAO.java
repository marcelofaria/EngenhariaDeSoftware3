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
public class ItemDAO extends DAO{
    
    private static ItemDAO instance;
    private static Connection myCONN;
    
    public static ItemDAO getInstance(){
        if(ItemDAO.instance == null){
            ItemDAO.instance = new ItemDAO();
            ItemDAO.myCONN = ItemDAO.instance.getConnection();
            return ItemDAO.instance;
        }
        else{
            return ItemDAO.instance;
        }
    }
    
    public void create(String nome, String tipo, float preco, String ingredientes, boolean disp){
        PreparedStatement createItem = null;
        String query = "INSERT INTO item (nome, tipo, preco, ingredientes, disponibilidade) VALUES (?, ?, ?, ?, ?)";
        try {
            createItem = ItemDAO.myCONN.prepareStatement(query);
            createItem.setString(1, nome);
            createItem.setString(2, tipo);
            createItem.setFloat(3, preco);
            createItem.setString(4, ingredientes);
            createItem.setBoolean(5, disp);
            this.executeUpdate(createItem);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(MesaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Item BuildObject(ResultSet rs){
        Item i = null;
        try {
            i = new Item(rs.getInt("itemID"), rs.getString("nome"), rs.getString("tipo"), rs.getFloat("preco"), rs.getString("ingredientes"), rs.getBoolean("disponibilidade"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return i;
    }
    
    public List<Item> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Item> mesas = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                mesas.add(this.BuildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mesas;
    }
    
    public List<Item> RetrieveAll(){
        return this.retrieveGeneric("SELECT * FROM item ORDER BY itemID");
    }
    
    public Item retrieveById(int idItem) {
        Item i = null;
        List<Item> itens = this.retrieveGeneric("SELECT * FROM item WHERE itemID = " + idItem);
        if(!itens.isEmpty()){
            i = itens.get(0);
        }
        return i;
    }
    
    public List<Item> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM item WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public boolean update(Item i) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE item SET nome=?, preco=?, ingredientes=?, disponibilidade=? WHERE itemID = ?");
            stmt.setString(1, i.getNome());
            stmt.setFloat(2, i.getPreco());
            stmt.setString(3, i.getIngredientes());
            stmt.setBoolean(4, i.getDisponibilidade());
            stmt.setInt(5, i.getId());
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
    
    public void delete(Item i) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM item WHERE itemID = ?");
            stmt.setInt(1, i.getId());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(int itemID) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM item WHERE itemID = ?");
            stmt.setInt(1, itemID);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
