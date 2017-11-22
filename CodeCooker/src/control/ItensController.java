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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.ItemDAO;
import view.itens.AdicionarItem;
import view.itens.BuscarItem;
import view.itens.EditarItem;
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
            BuscarItem bi = new BuscarItem("Busca de pratos");
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Prato' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Prato", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Prato editado com sucesso.");
                        }
                    });

                }
            });
            bi.setVisible(true);
        }
    }

    class BtnAlterarPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de pratos");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Prato' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Prato", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Prato editado com sucesso.");
                        }
                    });

                }
            });
        }
    }

    class BtnExcluirPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de pratos");
            bi.getBtnEditar().setText("Excluir");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Prato' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.delete(itemID);
                    bi.dispose();
                    JOptionPane.showMessageDialog(null, "Prato excluído com sucesso.");
                }
            });
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
            BuscarItem bi = new BuscarItem("Busca de porções");
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Porcao' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Porcao", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Porcao editada com sucesso.");
                        }
                    });

                }
            });
            bi.setVisible(true);
        }
    }

    class BtnAlterarPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de porções");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Porcao' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Porcao", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Porcao editada com sucesso.");
                        }
                    });

                }
            });
        }
    }

    class BtnExcluirPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de porções");
            bi.getBtnEditar().setText("Excluir");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Porcao' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.delete(itemID);
                    bi.dispose();
                    JOptionPane.showMessageDialog(null, "Porção excluída com sucesso.");
                }
            });
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
            BuscarItem bi = new BuscarItem("Busca de bebidas");
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Bebida' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Bebida", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Bebida editada com sucesso.");
                        }
                    });

                }
            });
            bi.setVisible(true);
        }
    }

    class BtnAlterarBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de bebidas");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Bebida' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Bebida", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Bebida editada com sucesso.");
                        }
                    });

                }
            });
        }
    }

    class BtnExcluirBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de bebidas");
            bi.getBtnEditar().setText("Excluir");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Bebida' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.delete(itemID);
                    bi.dispose();
                    JOptionPane.showMessageDialog(null, "Bebida excluída com sucesso.");
                }
            });
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
            BuscarItem bi = new BuscarItem("Busca de sobremesas");
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Sobremesa' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Sobremesa", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Sobremesa editada com sucesso.");
                        }
                    });

                }
            });
            bi.setVisible(true);
        }
    }

    class BtnAlterarSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de sobremesas");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Sobremesa' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    EditarItem ei = new EditarItem();
                    ei.setVisible(true);
                    ei.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowIconified(WindowEvent e) {
                            ei.setVisible(false);
                            ItemDAO idao = ItemDAO.getInstance();
                            idao.update(new Item(itemID, ei.getNome(), "Sobremesa", ei.getPreco(), ei.getIngredientes(), ei.getDisponibilidade()));
                            JOptionPane.showMessageDialog(null, "Sobremesa editada com sucesso.");
                        }
                    });

                }
            });
        }
    }

    class BtnExcluirSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BuscarItem bi = new BuscarItem("Busca de sobremesas");
            bi.getBtnEditar().setText("Excluir");
            bi.setVisible(true);
            bi.getBtnBuscar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ItemDAO idao = ItemDAO.getInstance();
                    String busca = bi.getBusca();
                    List<Item> itens = idao.retrieveGeneric("SELECT * FROM item WHERE tipo LIKE 'Sobremesa' AND (nome LIKE '%" + busca + "%' OR ingredientes LIKE '%"
                            + busca + "%' OR preco LIKE '%" + busca + "%')");
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    modeloTabela.setRowCount(0);
                    for (Item i : itens) {
                        modeloTabela.addRow(new Object[]{i.getId(), i.getNome(), i.getIngredientes(), i.getDisponibilidade(), i.getPreco()});
                    }
                }
            });
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel modeloTabela = bi.getModeloTabela();
                    Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                    ItemDAO idao = ItemDAO.getInstance();
                    idao.delete(itemID);
                    bi.dispose();
                    JOptionPane.showMessageDialog(null, "Sobremesa excluída com sucesso.");
                }
            });
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
