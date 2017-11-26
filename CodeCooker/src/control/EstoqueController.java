/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import model.ProdutoDAO;
import view.estoque.PainelAdicionarProduto;
import view.estoque.PainelBuscarProduto;
import view.estoque.PainelEditarProduto;
import view.estoque.PainelEstoque;
import view.estoque.PainelExcluirProduto;

/**
 *
 * @author Talita-csl
 */
public class EstoqueController {

    private PainelEstoque painelEst;
    private PainelAdicionarProduto painelAddProd;
    private PainelBuscarProduto painelBusProd;
    private PainelEditarProduto painelEdProd;
    private PainelExcluirProduto painelExcProd;
    
    ProdutoDAO pdao = ProdutoDAO.getInstance();
    Produto p;

    public EstoqueController(PainelEstoque pe) {
        
        this.painelEst = pe;
        this.painelAddProd = pe.getPainelAdicionar();
        this.painelBusProd = pe.getPainelBuscar();
        this.painelEdProd = pe.getPainelEditar();
        this.painelExcProd = pe.getPainelExcluirProduto();
        
        pe.addBtnAdicionarProdutoListener(new BtnAdicionarListener());
        painelAddProd.addBtnAdicionarProdListener(new BtnAdicionarProdListener());
        painelAddProd.addBtnCancelarAddListener(new BtnCancelarProdListener());
        
        pe.addBtnBuscarProdutoListener(new BtnBuscarListener());
        painelBusProd.addBtnBuscarListener(new BtnBuscarBuscListener());
        painelBusProd.addBtnCancelarListener(new BtnCancelarBuscListener());
        painelBusProd.addBtnEditarListener(new BtnEditarBuscListener());
        
        pe.addBtnAlterarProdutoListener(new BtnAlterarListener());
        pe.addBtnExcluirProdutoListener(new BtnExcluirListener());

    }
    
    class BtnBuscarBuscListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String nome;
            String [] o = new String[4];
            nome = painelBusProd.getNomeProd();
            
            List<Produto> produto = pdao.retrieveLike(nome);
            
            painelBusProd.instanciarTabela();
            painelBusProd.limparTabela();
            
            for(int i = 0; i < produto.size(); i++){
                try{
                o[0] = produto.get(i).getNome();
                o[1] = produto.get(i).getMarca();
                o[2] = produto.get(i).getFornecedor();
                int qtd = produto.get(i).getQtd();
                String Qtd = "" + qtd;
                o[3] = Qtd;
                painelBusProd.preencherTabela(o);
                //o[i+3] = produto.get(i).getQtd();    
                } catch(ArrayIndexOutOfBoundsException a){
                }       
            } 
            
        }

    }
    
    class BtnCancelarBuscListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelBusProd.dispose();
        }

    }
    
    class BtnEditarBuscListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }

    }
    

    class BtnCancelarProdListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelAddProd.dispose();
        }
    }
 
    class BtnAdicionarProdListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String nome;
            String marca;
            String fornecedor;
            int quantidade;
            
            nome = painelAddProd.getNomeProduto();
            marca = painelAddProd.getMarcaProduto();
            fornecedor = painelAddProd.getFornecedorProduto();
            quantidade = painelAddProd.getQuantidadeProduto();
            
            pdao.create(quantidade, nome, marca, fornecedor);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
        }
    }

    class BtnAdicionarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelAddProd.setVisible(true);
        }
    }

    class BtnBuscarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           painelBusProd.setVisible(true);
        }
    }

    class BtnAlterarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelEdProd.setVisible(true);
        }
    }

    class BtnExcluirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelExcProd.setVisible(true);
        }
    }
    
}
