/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import model.ItemDAO;
import view.itens.AdicionarItem;
import view.itens.MenuAdicionarItens;
import view.itens.MenuAlterarItens;
import view.itens.MenuBuscarItens;
import view.itens.MenuExcluirItens;
import view.itens.PainelItens;

/**
 *
 * @author Rafael
 */
public class ItensController {

    private PainelItens tela;
    private MenuAdicionarItens menuAdicionar;
    private MenuBuscarItens menuBuscar;
    private MenuAlterarItens menuAlterar;
    private MenuExcluirItens menuExcluir;

    public ItensController(PainelItens tela) {

        this.tela = tela;
        tela.addBtnAdicionarListener(new BtnAdicionarListener());
        tela.addBtnBuscarListener(new BtnBuscarListener());
        tela.addBtnAlterarListener(new BtnAlterarListener());
        tela.addBtnExcluirListener(new BtnExcluirListener());
        this.menuAdicionar = tela.getMenuAdicionar();
        this.menuAdicionar.addPratoListener(new BtnAdicionarPratoListener());
        this.menuAdicionar.addPorcaoListener(new BtnAdicionarPorcaoListener());
        this.menuAdicionar.addBebidaListener(new BtnAdicionarBebidaListener());
        this.menuAdicionar.addSobremesaListener(new BtnAdicionarSobremesaListener());
        this.menuBuscar = tela.getMenuBuscar();
        this.menuBuscar.addPratoListener(new BtnBuscarPratoListener());
        this.menuBuscar.addPorcaoListener(new BtnBuscarPorcaoListener());
        this.menuBuscar.addBebidaListener(new BtnBuscarBebidaListener());
        this.menuBuscar.addSobremesaListener(new BtnBuscarSobremesaListener());
        this.menuAlterar = tela.getMenuAlterar();
        this.menuAlterar.addPratoListener(new BtnAlterarPratoListener());
        this.menuAlterar.addPorcaoListener(new BtnAlterarPorcaoListener());
        this.menuAlterar.addBebidaListener(new BtnAlterarBebidaListener());
        this.menuAlterar.addSobremesaListener(new BtnAlterarSobremesaListener());
        this.menuExcluir = tela.getMenuExcluir();
        this.menuExcluir.addPratoListener(new BtnExcluirPratoListener());
        this.menuExcluir.addPorcaoListener(new BtnExcluirPorcaoListener());
        this.menuExcluir.addBebidaListener(new BtnExcluirBebidaListener());
        this.menuExcluir.addSobremesaListener(new BtnExcluirSobremesaListener());

    }

    class BtnAdicionarPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AdicionarItem ai = new AdicionarItem();
            ai.setVisible(true);
            ai.addWindowListener(new WindowAdapter() {
                @Override
                public void windowIconified(WindowEvent e) {
                    ai.setVisible(false);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.create(ai.getNome(), "Prato", ai.getPreco(), ai.getIngredientes(), ai.getDisponibilidade());
                    JOptionPane.showMessageDialog(null, "Prato criado com sucesso.");
                }

            });
        }
    }

    class BtnBuscarPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAlterarPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnExcluirPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAdicionarPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AdicionarItem ai = new AdicionarItem();
            ai.setVisible(true);
            ai.addWindowListener(new WindowAdapter() {
                @Override
                public void windowIconified(WindowEvent e) {
                    ai.setVisible(false);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.create(ai.getNome(), "Porcao", ai.getPreco(), ai.getIngredientes(), ai.getDisponibilidade());
                    JOptionPane.showMessageDialog(null, "Porção criada com sucesso.");
                }

            });
        }
    }

    class BtnBuscarPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAlterarPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnExcluirPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAdicionarBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AdicionarItem ai = new AdicionarItem();
            ai.setVisible(true);
            ai.addWindowListener(new WindowAdapter() {
                @Override
                public void windowIconified(WindowEvent e) {
                    ai.setVisible(false);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.create(ai.getNome(), "Bebida", ai.getPreco(), ai.getIngredientes(), ai.getDisponibilidade());
                    JOptionPane.showMessageDialog(null, "Bebida criada com sucesso.");
                }

            });
        }
    }

    class BtnBuscarBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAlterarBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnExcluirBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAdicionarSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AdicionarItem ai = new AdicionarItem();
            ai.setVisible(true);
            ai.addWindowListener(new WindowAdapter() {
                @Override
                public void windowIconified(WindowEvent e) {
                    ai.setVisible(false);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.create(ai.getNome(), "Sobremesa", ai.getPreco(), ai.getIngredientes(), ai.getDisponibilidade());
                    JOptionPane.showMessageDialog(null, "Sobremesa criada com sucesso.");
                }

            });
        }
    }

    class BtnBuscarSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAlterarSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnExcluirSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class BtnAdicionarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            menuAdicionar.setVisible(true);
        }

    }

    class BtnBuscarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            menuBuscar.setVisible(true);
        }
    }

    class BtnAlterarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            menuAlterar.setVisible(true);
        }
    }

    class BtnExcluirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            menuExcluir.setVisible(true);
        }
    }

}
