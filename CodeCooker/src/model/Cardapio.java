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
    private Collection<Item> itens;
    /**
     * Default constructor
     */
    public Cardapio(Collection<Item> itens, DiaDaSemana dia) {
        this.setDia(dia);
        this.setItens(itens);
    }

    public DiaDaSemana getDia(){
        return this.dia;
    }
    
    public void setDia(DiaDaSemana dia){
        this.dia = dia;
    }

    public Collection<Item> getItens() {
        return itens;
    }

    public void setItens(Collection<Item> itens) {
        this.itens = itens;
    }
    
    /**
     * 
     */


}