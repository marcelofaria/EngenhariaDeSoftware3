/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cardapio;
import model.CardapioDAO;
import model.Item;
import model.ItemDAO;
import view.cardapio.CriarCardapio;
import view.cardapio.EditarCardapio;
import view.cardapio.ExcluirCardapio;
import view.cardapio.MostrarCardapio;
import view.cardapio.PainelCardapio;

/**
 *
 * @author rafael
 */
public class CardapioController {

    private PainelCardapio tela;
    private CriarCardapio telaCriar;
    private MostrarCardapio telaMostrar;
    private ExcluirCardapio telaExcluir;
    private EditarCardapio telaEditar;

    public CardapioController(PainelCardapio tela) {

        this.tela = tela;
        tela.addBtnCriarListener(new BtnCriarListener());
        tela.addBtnMostrarListener(new BtnMostrarListener());
        tela.addBtnEditarListener(new BtnEditarListener());
        tela.addBtnExcluirListener(new BtnExcluirListener());

        this.telaCriar = new CriarCardapio();
        telaCriar.addBtnBuscarListener(new BtnBuscarItensListener());
        telaCriar.addBtnCriarCardapioListener(new BtnCriarCardapioListener());
        telaCriar.addBtnLimparTudoListener(new BtnLimparTudoListener());
        telaCriar.addBtnCancelarListener(new BtnCancelarListener());

        this.telaMostrar = new MostrarCardapio();
        telaMostrar.addCmbDiaListener(new CmbDiaListener());

        this.telaExcluir = new ExcluirCardapio();
        telaExcluir.addBtnExcluirListener(new BtnExcluirCardapioListener());

        this.telaEditar = new EditarCardapio();
        this.telaEditar.addBtnBuscarListener(new BtnBuscarEditarListener());
        this.telaEditar.addBtnLimparTudoListener(new BtnLimparTudoEditarListener());
        this.telaEditar.addBtnSalvarListener(new BtnSalvarEditarListener());
        this.telaEditar.addBtnCancelarListener(new BtnCancelarEditarListener());

    }

    class BtnCriarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaCriar.setVisible(true);
        }
    }

    class BtnMostrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaMostrar.setVisible(true);
            CardapioDAO cdao = CardapioDAO.getInstance();
            if (cdao.existeCardapio(telaMostrar.getDia())) {
                Cardapio c = cdao.retrieveByDia(telaMostrar.getDia());
                ArrayList<Item> itensCardapio = c.getItens();
                DefaultTableModel modelo = telaMostrar.getModeloTabela();
                modelo.setNumRows(0);
                for (Item i : itensCardapio) {
                    modelo.addRow(new Object[]{i.getId(), i.getNome(), i.getTipo(), i.getPreco()});
                }
            }
        }
    }

    class BtnEditarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaEditar.setVisible(true);
            DefaultTableModel modelExcluir = telaEditar.getModeloTblExcluir();
            modelExcluir.setRowCount(0);
            DefaultTableModel modelIncluir = telaEditar.getModeloTblIncluir();
            modelIncluir.setRowCount(0);
            EditarCardapio.getSelectedItems().clear();
            CardapioDAO cdao = CardapioDAO.getInstance();
            String dia = cdao.existeCardapio();
            if(dia != null){
                telaEditar.setDia(dia);
                Cardapio c = cdao.retrieveByDia(telaEditar.getDia());
                List<Item> itensCardapio = c.getItens();
                for (Item i : itensCardapio) {
                    modelExcluir.addRow(new Object[]{i.getId(), true, i.getNome(), i.getTipo()});
                    EditarCardapio.getSelectedItems().add(i.getId());
                }
                ItemDAO idao = ItemDAO.getInstance();
                List<Item> everyItem = idao.retrieveGeneric("SELECT * FROM item");
                List<Integer> id = new ArrayList<>();
                for (Item i : everyItem) {
                    id.add(i.getId());
                }
                for (Item i : itensCardapio) {
                    if (id.contains(i.getId())) {
                        id.remove((Integer) i.getId());
                    }
                }
                for (Item i : everyItem) {
                    if (id.contains(i.getId())) {
                        modelIncluir.addRow(new Object[]{i.getId(), false, i.getNome(), i.getTipo()});
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não há cardápios para serem editados.");
                telaEditar.setVisible(false);
            }
        }
    }

    class BtnExcluirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaExcluir.setVisible(true);
        }
    }

    // *******************
    // Frame CriarCardapio
    // *******************
    class BtnCriarCardapioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardapioDAO cdao = CardapioDAO.getInstance();
            List<Integer> itens = new ArrayList<>();
            for (Integer itemID : CriarCardapio.getSelectedItems()) {
                itens.add(itemID);
            }
            try {
                if (!cdao.existeCardapio(telaCriar.getDia())) {
                    cdao.create(telaCriar.getDia(), itens);
                    //JOptionPane.showMessageDialog(null, "Cardápio criado com sucesso.");
                    telaCriar.dispose();
                } else {
                    int resposta = JOptionPane.showConfirmDialog(
                            null,
                            "Um cardápio para esse dia da semana já existe. Deseja substituí-lo?",
                            "Cardápio já existente",
                            JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        cdao.excluirCardapio(telaCriar.getDia());
                        cdao.create(telaCriar.getDia(), itens);
                        //JOptionPane.showMessageDialog(null, "Cardápio criado com sucesso.");
                        telaCriar.dispose();
                    } else {
                        telaCriar.dispose();
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Houve uma falha ao criar o cardápio.");
                System.out.println(ex.getMessage());
            }
        }
    }

    class BtnLimparTudoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel modelo = telaCriar.getModeloTabela();
            modelo.setRowCount(0);
        }
    }

    class BtnCancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaCriar.dispose();
        }
    }

    class BtnBuscarItensListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ItemDAO idao = ItemDAO.getInstance();
            List<Item> itens;
            DefaultTableModel modeloTabela = telaCriar.getModeloTabela();
            modeloTabela.setNumRows(0);
            itens = idao.retrieveGeneric("SELECT * FROM item WHERE nome LIKE '%" + telaCriar.getBusca() + "%' OR "
                    + "ingredientes LIKE '%" + telaCriar.getBusca() + "%'");
            for (Item i : itens) {
                if (CriarCardapio.getSelectedItems().contains(i.getId())) {
                    modeloTabela.addRow(new Object[]{i.getId(), true, i.getNome(), i.getTipo()});
                } else {
                    modeloTabela.addRow(new Object[]{i.getId(), false, i.getNome(), i.getTipo()});
                }
            }
        }
    }

    // *********************
    // Frame MostrarCardapio
    // *********************
    class CmbDiaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardapioDAO cdao = CardapioDAO.getInstance();
            if (cdao.existeCardapio(telaMostrar.getDia())) {
                Cardapio c = cdao.retrieveByDia(telaMostrar.getDia());
                ArrayList<Item> itensCardapio = c.getItens();
                DefaultTableModel modelo = telaMostrar.getModeloTabela();
                modelo.setNumRows(0);
                for (Item i : itensCardapio) {
                    modelo.addRow(new Object[]{i.getId(), i.getNome(), i.getTipo(), i.getPreco()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe um cardápio para " + telaMostrar.getDia());
            }
        }
    }

    // *********************
    // Frame ExcluirCardapio
    // *********************
    class BtnExcluirCardapioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardapioDAO cdao = CardapioDAO.getInstance();
            if (cdao.existeCardapio(telaExcluir.getDia())) {
                cdao.excluirCardapio(telaExcluir.getDia());
                //JOptionPane.showMessageDialog(null, "Cardápio excluído com sucesso.");
                telaExcluir.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Um cardápio para " + telaExcluir.getDia() + " não existe.");
            }
        }

    }

    // ********************
    // Frame EditarCardapio
    // ********************
    class BtnBuscarEditarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ItemDAO idao = ItemDAO.getInstance();
            List<Item> itens;
            DefaultTableModel modeloTabela = telaEditar.getModeloTblIncluir();
            modeloTabela.setNumRows(0);
            itens = idao.retrieveGeneric("SELECT * FROM item WHERE nome LIKE '%" + telaEditar.getBusca() + "%' OR "
                    + "ingredientes LIKE '%" + telaEditar.getBusca() + "%'");
            for (Item i : itens) {
                if (!EditarCardapio.getSelectedItems().contains(i.getId())) {
                    modeloTabela.addRow(new Object[]{i.getId(), false, i.getNome(), i.getTipo()});
                } else {

                }
            }
        }

    }

    public void atualizarTabelaIncluir() {
        ItemDAO idao = ItemDAO.getInstance();
        DefaultTableModel modelo = telaEditar.getModeloTblIncluir();
        List<Item> everyItem = idao.RetrieveAll();
        for (Item i : everyItem) {
            modelo.setRowCount(0);
            if (!EditarCardapio.getSelectedItems().contains(i)) {
                modelo.addRow(new Object[]{i.getId(), false, i.getNome(), i.getTipo()});
            }
        }
    }

    public void atualizarTabelaExcluir() {
        ItemDAO idao = ItemDAO.getInstance();
        DefaultTableModel modelo = telaEditar.getModeloTblExcluir();
        for (Integer id : EditarCardapio.getSelectedItems()) {
            Item i = idao.retrieveById(id);
            modelo.setRowCount(0);
            modelo.addRow(new Object[]{i.getId(), true, i.getNome(), i.getTipo()});
        }
    }

    class BtnLimparTudoEditarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel modeloExcluir = telaEditar.getModeloTblExcluir();
            DefaultTableModel modeloIncluir = telaEditar.getModeloTblIncluir();
            modeloExcluir.setRowCount(0);
            modeloIncluir.setRowCount(0);
            EditarCardapio.getSelectedItems().clear();
            ItemDAO idao = ItemDAO.getInstance();
            List<Item> everyItem = idao.RetrieveAll();
            for (Item i : everyItem) {
                modeloIncluir.addRow(new Object[]{i.getId(), false, i.getNome(), i.getTipo()});
            }
        }

    }

    class BtnSalvarEditarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardapioDAO cdao = CardapioDAO.getInstance();
            ItemDAO idao = ItemDAO.getInstance();
            List<Integer> itens = new ArrayList<>();
            for (Integer itemID : EditarCardapio.getSelectedItems()) {
                itens.add(itemID);
            }
            try {
                cdao.excluirCardapio(telaEditar.getDia());
                cdao.create(telaEditar.getDia(), itens);
                //JOptionPane.showMessageDialog(null, "Cadápio editado com sucesso.");
                telaEditar.setVisible(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao editar cardápio.");
            }
        }
    }

    class CmbDiaEditarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaEditar.setVisible(true);
            DefaultTableModel modelExcluir = telaEditar.getModeloTblExcluir();
            modelExcluir.setRowCount(0);
            DefaultTableModel modelIncluir = telaEditar.getModeloTblIncluir();
            modelIncluir.setRowCount(0);
            EditarCardapio.getSelectedItems().clear();
            CardapioDAO cdao = CardapioDAO.getInstance();
            if(cdao.existeCardapio(telaEditar.getDia())){
                Cardapio c = cdao.retrieveByDia(telaEditar.getDia());
                List<Item> itensCardapio = c.getItens();
                for (Item i : itensCardapio) {
                    modelExcluir.addRow(new Object[]{i.getId(), true, i.getNome(), i.getTipo()});
                    EditarCardapio.getSelectedItems().add(i.getId());
                }
                ItemDAO idao = ItemDAO.getInstance();
                List<Item> everyItem = idao.retrieveGeneric("SELECT * FROM item");
                List<Integer> id = new ArrayList<>();
                for (Item i : everyItem) {
                    id.add(i.getId());
                }
                for (Item i : itensCardapio) {
                    if (id.contains(i.getId())) {
                        id.remove((Integer) i.getId());
                    }
                }
                for (Item i : everyItem) {
                    if (id.contains(i.getId())) {
                        modelIncluir.addRow(new Object[]{i.getId(), false, i.getNome(), i.getTipo()});
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existe um cardápio para " + telaEditar.getDia());
            }
        }

    }

    class BtnCancelarEditarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaEditar.setVisible(false);
        }

    }
}
