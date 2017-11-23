package model;

import java.util.*;

/**
 * 
 */
public class Cardapio {

    private String dia;
    private ArrayList<Item> itens;
    /**
     * Default constructor
     */
    public Cardapio(ArrayList<Item> itens, String dia) {
        this.setDia(dia);
        this.setItens(itens);
    }

    public String getDia(){
        return this.dia;
    }
    
    public void setDia(String dia){
        this.dia = dia;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}