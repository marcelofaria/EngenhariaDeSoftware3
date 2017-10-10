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
            instance = new ItemDAO();
            return instance;
        }
        else{
            return instance;
        }
    }
    
    public void create(String nome, float preco, String ingredientes, boolean disp){
        Item i = new Item(nome, preco, ingredientes, disp);
        PreparedStatement createItem = null;
        String query = "INSERT INTO Item (Nome, Preco, Ingredientes, Disponibilidade) VALUES (?, ?, ?, ?)";
        try {
            createItem = ItemDAO.myCONN.prepareStatement(query);
            createItem.setString(1, nome);
            createItem.setFloat(2, preco);
            createItem.setString(3, ingredientes);
            createItem.setBoolean(4, disp);
            this.executeUpdate(createItem);
        } catch (SQLException ex) {
            Logger.getLogger(MesaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Item BuildObject(ResultSet rs){
        Item i = null;
        try {
            i = new Item(rs.getString("Nome"), rs.getFloat("Preco"), rs.getString("Ingredientes"), rs.getBoolean("Disponibilidade"));
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
        return this.retrieveGeneric("SELECT * FROM Item ORDER BY idItem");
    }
    
    public Item retrieveById(int idItem) {
        Item i = null;
        List<Item> itens = this.retrieveGeneric("SELECT * FROM Item WHERE id = " + idItem);
        if(!itens.isEmpty()){
            i = itens.get(0);
        }
        return i;
    }
    
    public List<Item> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM Item WHERE Nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public boolean update(Item i) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE Item SET Nome=?, Preco=?, Ingredientes=?, Disponibilidade=? WHERE idItem = ?");
            stmt.setString(1, i.getNome());
            stmt.setFloat(2, i.getPreco());
            stmt.setString(3, i.getIngredientes());
            stmt.setBoolean(4, i.getDisponibilidade());
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
            stmt = myCONN.prepareStatement("DELETE FROM Item WHERE idItem = ?");
            stmt.setInt(1, i.getIdItem());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
