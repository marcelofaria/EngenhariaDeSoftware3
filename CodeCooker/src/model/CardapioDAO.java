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
            stmt = myCONN.prepareStatement("INSERT INTO cardapio (dia, itens) VALUES (?,?)");
            stmt.setString(1, dia.toString());
            stmt.setString(2, itens.toString());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
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
    }
    */
}
