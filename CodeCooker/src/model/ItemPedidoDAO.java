/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author rafael
 */
public class ItemPedidoDAO extends DAO{
    
    private static ItemPedidoDAO instance;
    private static Connection myCONN;

    public ItemPedidoDAO getInstance() {
        if (this.instance == null) {
            instance = new ItemPedidoDAO();
            return instance;
        } else {
            return instance;
        }
    }
    
}
