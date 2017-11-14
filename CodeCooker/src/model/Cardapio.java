package model;

import java.util.*;

enum DiaDaSemana{
    Segunda, Terca, Quarta, Quinta, Sexta, Sabado, Domingo
}

/**
 * 
 */
public class Cardapio {

    private DiaDaSemana dia;
    private ArrayList<Item> itens;
    /**
     * Default constructor
     */
    public Cardapio(ArrayList<Item> itens, DiaDaSemana dia) {
        this.setDia(dia);
        this.setItens(itens);
    }

    public DiaDaSemana getDia(){
        return this.dia;
    }
    
    public void setDia(DiaDaSemana dia){
        this.dia = dia;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}