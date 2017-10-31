/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steps;
import java.sql.ResultSet;
import model.Caixa;
import model.CaixaDAO;
import model.Calculadora;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 *
 * @author Marcelo
 */
public class CadastroSteps {
    
    Calculadora calc = new Calculadora();
    int resultado;
    
    @Given("Temos uma base de dados")
    public void baseDeDados(){
        
        Assert.assertTrue(Calculadora.class.isInstance(calc));
        
    }
    
    @When("Cadastrar uma pessoa")
    public void cadastroUsuario(){
       
       resultado = calc.calcular(1, 2);
        
    }
    
    @Then("cadastro feito com sucesso")
    public void cadastrado(){
        
        Assert.assertEquals(3, resultado);
    
    }
    
    
}
