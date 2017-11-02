package model;    
import java.util.*;

/**
 * 
 */
public class Pedido {

    /**
     * Default constructor
     */
    public Pedido(int pedidoID, Conta conta, List<ItemPedido> itens) {
        this.pedidoID = pedidoID;
        this.conta = conta;
        this.itens = itens;
        this.valor = 0;
        for(ItemPedido i : itens){
            this.valor += i.getValor();
        }
    }

    /**
     * 
     */
    private float valor;

    /**
     * 
     */
    private List<ItemPedido> itens;
    
    /**
     * 
     * @ID da conta que pertence o pedido
     */
    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    /**
     * 
     * @return 
     */
    private int pedidoID;

    public int getId() {
        return pedidoID;
    }


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

}