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
import model.Produto;
import model.ProdutoDAO;
import view.estoque.PainelAdicionarProduto;
import view.estoque.PainelAlterarProduto;
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
    private PainelAlterarProduto painelAltProd;
    private PainelEditarProduto painelEdProd;
    private PainelExcluirProduto painelExcProd;

    ProdutoDAO pdao = ProdutoDAO.getInstance();
    Produto p;

    public EstoqueController(PainelEstoque pe) {

        this.painelEst = pe;
        this.painelAddProd = pe.getPainelAdicionar();
        this.painelBusProd = pe.getPainelBuscar();
        this.painelEdProd = pe.getPainelEditar();
        this.painelAltProd = pe.getPainelAlterar();
        this.painelExcProd = pe.getPainelExcluir();

        pe.addBtnAdicionarProdutoListener(new BtnAdicionarListener());
        painelAddProd.addBtnAdicionarProdListener(new BtnAdicionarProdListener());
        painelAddProd.addBtnCancelarAddListener(new BtnCancelarProdListener());

        pe.addBtnBuscarProdutoListener(new BtnBuscarListener());
        painelBusProd.addBtnBuscarListener(new BtnBuscarBuscListener());
        painelBusProd.addBtnCancelarListener(new BtnCancelarBuscListener());

        pe.addBtnAlterarProdutoListener(new BtnAlterarListener());
        painelAltProd.addBtnBuscarListener(new BtnBuscarAltListener());
        painelAltProd.addBtnCancelarListener(new BtnCancelarAltListener());
        painelAltProd.addBtnEditarListener(new BtnEditarAltListener());

        pe.addBtnExcluirProdutoListener(new BtnExcluirListener());
        painelExcProd.addBtnBuscarListener(new BtnBuscarExcListener());
        painelExcProd.addBtnCancelarListener(new BtnCancelarExcListener());
        painelExcProd.addBtnExcluirListener(new BtnExcluirExcListener());

        painelEdProd.addBtnSalvarListener(new BtnSalvarEdListener());
        painelEdProd.addBtnCancelarListener(new BtnCancelarEdListener());
    }

    class BtnExcluirExcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelExcProd.excluirProduto();

            String nome;
            Object[] o = new Object[4];
            nome = painelAltProd.getNomeProd();

            List<Produto> produto = pdao.retrieveLike(nome);

            painelExcProd.instanciarTabela();
            painelExcProd.limparTabela();

            for (int i = 0; i < produto.size(); i++) {
                try {
                    o[0] = produto.get(i).getNome();
                    o[1] = produto.get(i).getMarca();
                    o[2] = produto.get(i).getFornecedor();
                    o[3] = produto.get(i).getQtd();
                    painelExcProd.preencherTabela(o);
                    //o[i+3] = produto.get(i).getQtd();    
                } catch (ArrayIndexOutOfBoundsException a) {
                }
            }
        }

    }

    class BtnCancelarExcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                painelExcProd.dispose();
                painelExcProd.limparTabela();
            } catch (NullPointerException e) {
            }
        }

    }

    class BtnBuscarExcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nome;
            Object[] o = new Object[4];
            nome = painelAltProd.getNomeProd();

            List<Produto> produto = pdao.retrieveLike(nome);

            painelExcProd.instanciarTabela();
            painelExcProd.limparTabela();

            for (int i = 0; i < produto.size(); i++) {
                try {
                    o[0] = produto.get(i).getNome();
                    o[1] = produto.get(i).getMarca();
                    o[2] = produto.get(i).getFornecedor();
                    o[3] = produto.get(i).getQtd();
                    painelExcProd.preencherTabela(o);
                    //o[i+3] = produto.get(i).getQtd();    
                } catch (ArrayIndexOutOfBoundsException a) {
                }
            }
        }

    }

    class BtnEditarAltListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (painelAltProd.editarProduto() instanceof String) {
                painelEdProd.setVisible(true);
                String nome;

                nome = painelAltProd.editarProduto();
                ProdutoDAO pdao = ProdutoDAO.getInstance();
                List<Produto> prod;

                prod = pdao.retrieveLike(nome);

                painelEdProd.setNomeProduto(prod.get(0).getNome());
                painelEdProd.setMarcaProduto(prod.get(0).getMarca());
                painelEdProd.setFornecedorProduto(prod.get(0).getFornecedor());
                painelEdProd.setQuantidadeProduto(prod.get(0).getQtd());
            } else {
                JOptionPane.showMessageDialog(null, "Produto não foi encontrado, tente novamente");
            }

        }

    }

    class BtnCancelarAltListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                painelAltProd.dispose();
                painelAltProd.limparTabela();
            } catch (NullPointerException e) {
            }
        }
    }

    class BtnBuscarAltListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nome;
            Object[] o = new Object[4];
            nome = painelAltProd.getNomeProd();

            List<Produto> produto = pdao.retrieveLike(nome);

            painelAltProd.instanciarTabela();
            painelAltProd.limparTabela();

            for (int i = 0; i < produto.size(); i++) {
                try {
                    o[0] = produto.get(i).getNome();
                    o[1] = produto.get(i).getMarca();
                    o[2] = produto.get(i).getFornecedor();
                    o[3] = produto.get(i).getQtd();
                    painelAltProd.preencherTabela(o);
                    //o[i+3] = produto.get(i).getQtd();    
                } catch (ArrayIndexOutOfBoundsException a) {
                }
            }
        }

    }

    class BtnSalvarEdListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String Nome = painelAltProd.editarProduto();
            String nome;
            String marca;
            String fornecedor;
            int quantidade;

            List<Produto> prod, prod1;
            prod = pdao.retrieveLike(Nome);
            prod1 = pdao.retrieveLike(Nome);

            nome = painelEdProd.getNomeProduto();
            marca = painelEdProd.getMarcaProduto();
            fornecedor = painelEdProd.getFornecedorProduto();
            quantidade = painelEdProd.getQuantidadeProduto();

            prod.get(0).setNome(nome);
            prod.get(0).setMarca(marca);
            prod.get(0).setFornecedor(fornecedor);
            prod.get(0).setQtd(quantidade);
            //System.out.println(prod.get(0).getId());
            //p = new Produto(quantidade, nome, marca, fornecedor);

            pdao.update(prod.get(0), prod1.get(0));
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
            painelEdProd.dispose();

            String nnome;
            Object[] o = new Object[4];
            nnome = painelAltProd.getNomeProd();

            List<Produto> produto = pdao.retrieveLike(nnome);

            painelAltProd.instanciarTabela();
            painelAltProd.limparTabela();

            for (int i = 0; i < produto.size(); i++) {
                try {
                    o[0] = produto.get(i).getNome();
                    o[1] = produto.get(i).getMarca();
                    o[2] = produto.get(i).getFornecedor();
                    o[3] = produto.get(i).getQtd();
                    painelAltProd.preencherTabela(o);
                    //o[i+3] = produto.get(i).getQtd();    
                } catch (ArrayIndexOutOfBoundsException a) {
                }
            }

        }
    }

    class BtnCancelarEdListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                painelEdProd.dispose();
            } catch (NullPointerException e) {
            }

        }

    }

    class BtnBuscarBuscListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String nome;
            Object[] o = new Object[4];
            nome = painelBusProd.getNomeProd();

            List<Produto> produto = pdao.retrieveLike(nome);

            painelBusProd.instanciarTabela();
            painelBusProd.limparTabela();
            for (int i = 0; i < produto.size(); i++) {
                try {
                    o[0] = produto.get(i).getNome();
                    o[1] = produto.get(i).getMarca();
                    o[2] = produto.get(i).getFornecedor();
                    o[3] = produto.get(i).getQtd();
                    painelBusProd.preencherTabela(o);
                    //o[i+3] = produto.get(i).getQtd();    
                } catch (ArrayIndexOutOfBoundsException a) {
                }
            }

        }

    }

    class BtnCancelarBuscListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                painelBusProd.dispose();
                painelBusProd.limparTabela();
            } catch (NullPointerException e) {
            }
            
        }

    }

    class BtnEditarBuscListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelEdProd.setVisible(true);
        }

    }

    class BtnCancelarProdListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                painelAddProd.dispose();
            } catch (NullPointerException e) {
            }
            
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
            painelAddProd.dispose();

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
            painelAltProd.setVisible(true);
        }
    }

    class BtnExcluirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            painelExcProd.setVisible(true);
        }
    }

}
