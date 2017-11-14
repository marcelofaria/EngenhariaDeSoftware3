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
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author r176066
 */
public class CardapioDAO extends DAO {

    private static CardapioDAO instance;
    private static Connection myCONN;

    public CardapioDAO getInstance() {
        if (this.instance == null) {
            instance = new CardapioDAO();
            return instance;
        } else {
            return instance;
        }
    }

    public void create(DiaDaSemana dia, Collection<Item> itens) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO item_cardapio (itemID, diaDaSemana) VALUES (?, ?)");
            stmt.setString(1, dia.toString());
            int lastId = this.getLastId();
            for(Item i : itens){
                lastId++;
                stmt.setInt(1, lastId);
                stmt.setInt(2, i.getId());
                this.executeUpdate(stmt);
            }
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    public int getLastId(){
        int lastId = 0;
        try {
            ResultSet rs = this.getResultSet(myCONN.prepareStatement("SELECT COUNT(*) AS id FROM item_cardapio"));
            lastId = rs.getInt("item_cardapioID");
            return lastId;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastId;
    }

    /*
    public Cardapio buildObject(ResultSet rs) {
        Cardapio cardapio = null;
        try {
            cardapio = new Cardapio(rs.getString("dia"), rs.getString("itens"));
        } catch (SQLException e) {
        }
        return cardapio;
    }*/
}