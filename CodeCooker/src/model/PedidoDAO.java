/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Array;
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
 * @author m173574
 */
public class PedidoDAO extends DAO{
    
    private static PedidoDAO instance;
    private static Connection myCONN;

    public static PedidoDAO getInstance() {
        if (PedidoDAO.instance == null) {
            PedidoDAO.instance = new PedidoDAO();
            PedidoDAO.myCONN = PedidoDAO.instance.getConnection();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(int contaID) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO pedido (contaID) VALUES (?)");
            stmt.setInt(1, contaID);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private Pedido buildObject(ResultSet rs) {
        Pedido p = null;
        try {
            p = new Pedido(rs.getInt("pedidoID"), rs.getInt("contaID"));
        } catch (SQLException e) {
        }
        return p;
    }
    
    public int getLastId(){
        int lastId = 0;
        try {
            ResultSet rs = this.getResultSet(myCONN.prepareStatement("SELECT pedidoID AS id FROM pedido ORDER BY pedidoID DESC"));
            if(rs.next())
                lastId = rs.getInt("id");
            
            return lastId;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastId;
    }
    
    public Pedido getLastPedido(){
        Pedido p = null;
        
        try{
            int lastId = this.getLastId();
            ResultSet rs = this.getResultSet(myCONN.prepareStatement("SELECT * FROM pedido WHERE pedidoID = " + lastId));
            if(rs.next())
                p = new Pedido(rs.getInt("pedidoID"), rs.getInt("contaID"));
            else
                return null;
        } catch(SQLException ex){
            
        }
        
        return p;
    }
    
    public List<Pedido> retrieveAll() {
        
        return this.retrieveGeneric("SELECT * FROM pedido ORDER BY qtd");
    }
    
    public Pedido retrieveById(int id) {
        Pedido p = null;
        List<Pedido> ps = this.retrieveGeneric("SELECT * FROM pedido WHERE pedidoID="+id);
        if(!ps.isEmpty()){
            p = ps.get(0);
        }
        return p;
    }
    
    public List<Pedido> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Pedido> pedidos = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                pedidos.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return pedidos;
    }
    
    public void delete(int pedidoID){
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM pedido WHERE pedidoID = ?");
            stmt.setInt(1, pedidoID);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
}
