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
public class ItemPedidoDAO extends DAO{
    
    private static ItemPedidoDAO instance;
    private static Connection myCONN;

    public static ItemPedidoDAO getInstance() {
        if (ItemPedidoDAO.instance == null) {
            instance = new ItemPedidoDAO();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(int idPedido, Item item, short qtd){
        ItemPedido i = new ItemPedido(item, qtd);
        PreparedStatement createItem = null;
        String query = "INSERT INTO item_pedido (idItem, idPedido, quantidade, valor) VALUES (?, ?, ?, ?)";
        try {
            createItem = ItemPedidoDAO.myCONN.prepareStatement(query);
            createItem.setInt(1, i.getItem().getIdItem());
            createItem.setInt(2, idPedido);
            createItem.setShort(3, i.getQtd());
            createItem.setFloat(4, i.getValor());
            this.executeUpdate(createItem);
        } catch (SQLException ex) {
            Logger.getLogger(MesaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private ItemPedido buildObject(ResultSet rs) {
        ItemPedido ip = null;
        try {
            Item item = ItemDAO.getInstance().retrieveById(rs.getInt("idItem"));
            ip = new ItemPedido(item, rs.getShort("quantidade"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ip;
    }
    
    public List<ItemPedido> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<ItemPedido> ips = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                ips.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ips;
    }
    
    public List<ItemPedido> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM item_pedido ORDER BY idPedido");
    }
    
    public ItemPedido retrieveById(int id) {
        ItemPedido ip = null;
        List<ItemPedido> ips = this.retrieveGeneric("SELECT * FROM reserva WHERE id="+id);
        if(!ips.isEmpty()){
            ip = ips.get(0);
        }
        return ip;
    }
    
    public boolean update(ItemPedido ip, int idPedido) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE reserva SET idPedido=?, idItem=?, quantidade=?, valor=? WHERE id = ?");
            stmt.setInt(1, idPedido);
            stmt.setInt(2, ip.getItem().getIdItem());
            stmt.setShort(3, ip.getQtd());
            stmt.setFloat(4, ip.getValor());
            stmt.setInt(5, ip.getIdItemPedido());
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
    
    public void delete(ItemPedido ip) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM reserva WHERE idReserva = ?");
            stmt.setInt(1, ip.getIdItemPedido());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
}
