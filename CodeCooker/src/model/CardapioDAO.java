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
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author r176066
 */
public class CardapioDAO extends DAO {

    private static CardapioDAO instance;
    private static Connection myCONN;

    public static CardapioDAO getInstance() {
        if (CardapioDAO.instance == null) {
            CardapioDAO.instance = new CardapioDAO();
            CardapioDAO.myCONN = CardapioDAO.instance.getConnection();
            return CardapioDAO.instance;
        } else {
            return CardapioDAO.instance;
        }
    }

    public void create(String dia, Collection<Integer> itens) throws SQLException {
        PreparedStatement stmt;
        stmt = myCONN.prepareStatement("INSERT INTO item_cardapio (itemID, diaDaSemana) VALUES (?, ?)");
        stmt.setString(2, dia);
        for (Integer i : itens) {
            stmt.setInt(1, i);
            this.executeUpdate(stmt);
        }
        stmt.close();
    }

    /*public Cardapio BuildObject(ResultSet rs){
        Cardapio i = null;
        try {
            //item_cardapioID
            //itemID
            //diaDaSemana
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return i;
    }*/
 /*public List<Cardapio> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Cardapio> cardapio = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                cardapio.add(this.BuildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return cardapio;
    }*/
    public int getLastId() {
        int lastId = 0;
        try {
            ResultSet rs = this.getResultSet(myCONN.prepareStatement("SELECT COUNT(*) AS id FROM item_cardapio"));
            if (rs.next()) {
                lastId = rs.getInt("id");
                return lastId;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastId;
    }

    public boolean existeCardapio(String diaDaSemana) {
        String query = "SELECT * FROM item_cardapio WHERE diaDaSemana LIKE '" + diaDaSemana + "';";
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement(query);
            ResultSet rs = this.getResultSet(stmt);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public void excluirCardapio(String diaDaSemana) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM item_cardapio WHERE diaDaSemana LIKE ?");
            stmt.setString(1, diaDaSemana);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CardapioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
