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
            ItemPedidoDAO.instance = new ItemPedidoDAO();
            ItemPedidoDAO.myCONN = ItemPedidoDAO.instance.getConnection();
            return ItemPedidoDAO.instance;
        } else {
            return ItemPedidoDAO.instance;
        }
    }
    
    public void create(Item item, int pedidoID, int qtd){
        ItemPedido i = new ItemPedido(item, pedidoID, qtd);
        PreparedStatement createItem = null;
        String query = "INSERT INTO item_pedido (itemID, pedidoID, quantidade, valor) VALUES (?, ?, ?, ?)";
        try {
            createItem = ItemPedidoDAO.myCONN.prepareStatement(query);
            createItem.setInt(1, item.getId());
            createItem.setInt(2, pedidoID);
            createItem.setInt(3, qtd);
            createItem.setFloat(4, i.getValor());
            this.executeUpdate(createItem);
        } catch (SQLException ex) {
            Logger.getLogger(MesaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private ItemPedido buildObject(ResultSet rs) {
        ItemPedido ip = null;
        try {
            Item item = ItemDAO.getInstance().retrieveById(rs.getInt("itemID"));
            Pedido pedido = PedidoDAO.getInstance().retrieveById(rs.getInt("pedidoID"));
            ip = new ItemPedido(item, pedido.getId(), rs.getShort("quantidade"));
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
        return this.retrieveGeneric("SELECT * FROM item_pedido ORDER BY pedidoID");
    }
    
    public ItemPedido retrieveById(int id) {
        ItemPedido ip = null;
        List<ItemPedido> ips = this.retrieveGeneric("SELECT * FROM item_pedido WHERE id="+id);
        if(!ips.isEmpty()){
            ip = ips.get(0);
        }
        return ip;
    }
    
    public boolean update(ItemPedido ip) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE item_pedido SET quantidade=?, valor=? WHERE itemID = ? AND pedidoID = ?");
            stmt.setInt(1, ip.getQtd());
            stmt.setFloat(2, ip.getValor());
            stmt.setInt(3, ip.getItem().getId());
            stmt.setInt(4, ip.getPedido().getId());
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
            stmt = myCONN.prepareStatement("DELETE FROM item_pedido WHERE itemID = ? AND pedidoID = ?");
            stmt.setInt(1, ip.getItem().getId());
            stmt.setInt(2, ip.getPedido().getId());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
}
