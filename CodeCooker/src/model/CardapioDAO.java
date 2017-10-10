/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.util.Collection;

/**
 *
 * @author r176066
 */
public class CardapioDAO extends DAO {
    
    private static CardapioDAO instance;
    private static Connection myCONN;
    
    public CardapioDAO getInstance(){
        if(this.instance == null){
            instance = new CardapioDAO();
            return instance;
        }
        else{
            return instance;
        }
    }
    
    public void create(Collection<Item> itens, DiaDaSemana dia){
        
    }
    

    
}
