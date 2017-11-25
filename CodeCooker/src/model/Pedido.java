package model;    
import java.util.*;

public class Pedido {

    /**
     * Default constructor
     */
    public Pedido(int pedidoID, int contaID) {
        this.pedidoID = pedidoID;
    }

    private int pedidoID;
    private int contaID;

    public int getId() {
        return pedidoID;
    }
    
    public int getContaId(){
        return contaID;
    }

}