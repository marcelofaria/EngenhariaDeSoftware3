package model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe para testes dos métodos da classe "Produto"
 * @author Inoue
 */
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getQtd method, of class Produto.
     */
    @Test
    public void testGetQtd() {
    Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
    assertEquals(10, produto.getQtd());
    }

    /**
     * Test of setQtd method, of class Produto.
     */
    @Test
    public void testSetQtd() {
        System.out.println("setQtd");
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setQtd(50);
        assertEquals(50,p1.getQtd());
    }

    /**
     * Test of setId method, of class Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Produto p1 = new Produto(10, "Farinha", "Dona Benta", "Fornecedor1");
        p1.setId(5);
        
        assertEquals(5, p1.getId());
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
        assertEquals("Churros", produto.getNome());
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setNome("Crepe");
        assertEquals("Crepe",p1.getNome());
    }

    /**
     * Test of getMarca method, of class Produto.
     */
    @Test
    public void testGetMarca() {
        Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
        assertEquals("Sadia", produto.getMarca());
    }

    /**
     * Test of setMarca method, of class Produto.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setMarca("Perdigao");
        assertEquals("Perdigao",p1.getMarca());
    }

    /**
     * Test of getFornecedor method, of class Produto.
     */
    @Test
    public void testGetFornecedor() {
     Produto produto = new Produto (10, "Churros", "Sadia", "Dona Florinda");
     
     assertEquals("Dona Florinda", produto.getFornecedor());
    }

    /**
     * Test of setFornecedor method, of class Produto.
     */
    @Test
    public void testSetFornecedor() {
        System.out.println("setFornecedor");
        Produto p1 = new Produto(10, "Churros", "Sadia", "Dona Florinda");
        p1.setFornecedor("Seu Madruga");
        assertEquals("Seu Madruga",p1.getFornecedor());
    }
   
}

 