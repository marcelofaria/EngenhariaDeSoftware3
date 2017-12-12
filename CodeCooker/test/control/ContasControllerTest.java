/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Conta;
import model.ContaDAO;
import model.Item;
import model.ItemDAO;
import model.ItemPedido;
import model.ItemPedidoDAO;
import model.PedidoDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.contas.PainelContas;

/**
 *
 * @author Rafael
 */
public class ContasControllerTest {
    
    public ContasControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of carregarContaMesa method, of class ContasController.
     */
    @Test
    public void testCarregarContaMesa() {
        
        PainelContas pc = new PainelContas();
        ContasController cc = new ContasController(pc);
        
        DefaultTableModel modelo = pc.getModeloTabela();
        
        ContaDAO cdao = ContaDAO.getInstance();
        
        if(cdao.existeConta(1)){
            List<Conta> contas = cdao.retrieveGeneric("SELECT contaID FROM conta WHERE numMesa = 1 AND status = 1");
            int contaID = contas.get(0).getId();
            cdao.updateStatus(contaID, false);
            
        }
        
        Calendar cal = Calendar.getInstance();
        cdao.create(0, 1, new java.sql.Date(cal.getTimeInMillis()), true);
        
        PedidoDAO pdao = PedidoDAO.getInstance();
        List<Conta> contas = cdao.retrieveGeneric("SELECT contaID FROM conta WHERE numMesa = 1 AND status = 1");
        int contaID = contas.get(0).getId();
        pdao.create(contaID);
        int pedidoID = pdao.getLastId();
        ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
        ItemDAO idao = ItemDAO.getInstance();
        Item i = idao.retrieveById(9);
        ipdao.create(i, pedidoID, 23);
        
        cc.carregarContaMesa(1);
        assertEquals(modelo.getRowCount(), 1);
        
    }

    
}
