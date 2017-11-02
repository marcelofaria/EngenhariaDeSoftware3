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
            instance = new PedidoDAO();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(List<ItemPedido> itens) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO pedido (contaID, valor) VALUES (?, ?, ?)");
            for(ItemPedido i : itens){
                //stmt.setInt(1, i.get);
                //stmt.setInt(2, i.getIdItemPedido());
                this.executeUpdate(stmt);
            }
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Pedido buildObject(ResultSet rs) {
        Pedido p = null;
        List<ItemPedido> itens;
        Array idsArray;
        int[] ids;
        try {
            idsArray = rs.getArray("idPedido");
            ids = (int[]) idsArray.getArray();
            itens = new ArrayList<>();
            for(int x : ids){
                itens.add(ItemPedidoDAO.getInstance().retrieveById(x));
            }
            p = new Pedido(itens);
        } catch (SQLException e) {
        }
        return p;
    }
    
    public int getLastId(){
        int lastId = 0;
        try {
            ResultSet rs = this.getResultSet(myCONN.prepareStatement("SELECT COUNT(*) AS id FROM pedido"));
            lastId = rs.getInt("pedidoID");
            return lastId;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastId;
    }
    
    public List<Pedido> retrieveAll() {
        
        return this.retrieveGeneric("SELECT * FROM produto ORDER BY qtd");
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
    
}
