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
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Conta;
import model.ContaDAO;
import model.Item;
import model.ItemDAO;
import model.ItemPedido;
import model.ItemPedidoDAO;
import model.Pedido;
import model.PedidoDAO;
import view.contas.AdicionarPedido;
import view.contas.AlterarConta;
import view.contas.MenuAdicionarPedido;
import view.contas.PainelContas;
import view.itens.BuscarItem;
import view.itens.EditarItem;

/**
 *
 * @author Rafael
 */
public class ContasController {

    private PainelContas tela;
    private MenuAdicionarPedido telaMenu;
    private AlterarConta telaAlterar;

    public ContasController(PainelContas tela) {

        this.tela = tela;
        this.carregarContaMesa(1);
        tela.addBtnAdicionarPedidoListener(new BtnAdicionarPedidoListener());
        tela.addBtnFecharContaListener(new BtnFecharContaListener());
        tela.addBtnAlterarContaListener(new BtnAlterarContaListener());
        tela.addCmbMesasListener(new CmbMesasListener());

        this.telaMenu = new MenuAdicionarPedido();
        this.telaMenu.addPratoListener(new BtnPratoListener());
        this.telaMenu.addPorcaoListener(new BtnPorcaoListener());
        this.telaMenu.addBebidaListener(new BtnBebidaListener());
        this.telaMenu.addSobremesaListener(new BtnSobremesaListener());

        this.telaAlterar = new AlterarConta();
        this.telaAlterar.addBtnSalvarListener(new BtnSalvarAlteracaoListener());

    }

    public void carregarContaMesa(int numMesa) {
        DefaultTableModel model = tela.getModeloTabela();
        ContaDAO cdao = ContaDAO.getInstance();
        float precoTotal = 0.00f;
        if (cdao.existeConta(numMesa)) {
            List<ItemPedido> pedidos;
            pedidos = this.getPedidos(numMesa);
            if (pedidos != null) {
                ItemDAO idao = ItemDAO.getInstance();
                for (ItemPedido i : pedidos) {
                    model.addRow(new Object[]{i.getItem().getId(), i.getPedidoID(), i.getItem().getNome(), i.getQtd(), i.getValor()});
                    precoTotal += i.getValor();
                }
            }
        } else {
            model.setRowCount(0);
        }
        DecimalFormat df = new DecimalFormat("0.00");
        tela.setTotal(String.valueOf(df.format(precoTotal)));
    }

    public List<ItemPedido> getPedidos(int numMesa) {
        List<ItemPedido> itemPedidos;
        ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
        itemPedidos = ipdao.retrieveGeneric("SELECT item_pedido.itemID, item_pedido.pedidoID, item_pedido.Quantidade, item_pedido.Valor FROM item_pedido\n"
                + "INNER JOIN pedido ON pedido.pedidoID = item_pedido.pedidoID\n"
                + "INNER JOIN conta ON conta.contaID = pedido.contaID\n"
                + "WHERE conta.numMesa = " + numMesa + " AND conta.status = 1;");

        return itemPedidos;
    }

    class BtnAdicionarPedidoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ContaDAO cdao = ContaDAO.getInstance();
            if (!cdao.existeConta(tela.getNumMesa())) {
                Calendar cal = Calendar.getInstance();
                cdao.create(0, tela.getNumMesa(), new java.sql.Date(cal.getTimeInMillis()), true);
            }
            telaMenu.setVisible(true);
        }

    }

    class BtnFecharContaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int numMesa = tela.getNumMesa();
            DefaultTableModel model = tela.getModeloTabela();
            if (model.getRowCount() != 0) {
                int resposta = JOptionPane.showConfirmDialog(
                        null,
                        "Você realmente deseja fechar a conta da mesa " + numMesa + "?",
                        "Fechamento de conta",
                        JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_OPTION) {
                    ContaDAO cdao = ContaDAO.getInstance();
                    List<Conta> conta = cdao.retrieveGeneric("SELECT * FROM conta WHERE (numMesa = " + numMesa + " AND status = 1)");
                    if (!conta.isEmpty()) {
                        cdao.updateStatus(conta.get(0).getId(), false);
                        model.setRowCount(0);
                        carregarContaMesa(numMesa);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe uma conta para a mesa " + numMesa + ".");
            }
        }

    }

    class BtnAlterarContaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ContaDAO cdao = ContaDAO.getInstance();
            if (cdao.existeConta(tela.getNumMesa())) {
                DefaultTableModel model = telaAlterar.getModeloTabela();
                model.setRowCount(0);
                List<ItemPedido> pedidos;
                pedidos = getPedidos(tela.getNumMesa());
                if (pedidos != null) {
                    ItemDAO idao = ItemDAO.getInstance();
                    for (ItemPedido i : pedidos) {
                        model.addRow(new Object[]{i.getItem().getId(), i.getPedidoID(), i.getItem().getNome(), i.getQtd(), false});
                    }
                }
                telaAlterar.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Não existe uma conta para a mesa " + tela.getNumMesa() + ".");
            }
        }

    }

    class CmbMesasListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int numMesa = tela.getNumMesa();
            DefaultTableModel model = tela.getModeloTabela();
            model.setRowCount(0);
            carregarContaMesa(numMesa);
        }

    }

    class BtnPratoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaMenu.setVisible(false);
            BuscarItem bi = new BuscarItem("Busca de pratos");
            bi.setBtnEditarText("Adicionar");
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
            //    BtnAdicionar
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ContaDAO cdao = ContaDAO.getInstance();
                    Conta contaDaMesa;
                    List<Conta> conta = cdao.retrieveGeneric("SELECT * FROM conta WHERE (numMesa = " + tela.getNumMesa() + " AND status = 1)");
                    contaDaMesa = conta.get(0);
                    try {
                        DefaultTableModel modeloTabela = bi.getModeloTabela();
                        Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                        // MUDA AQUI PRA ADICIONAR PEDIDO
                        AdicionarPedido ap = new AdicionarPedido();
                        ap.setVisible(true);

                        ap.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowIconified(WindowEvent e) {
                                ap.setVisible(false);
                                PedidoDAO pdao = PedidoDAO.getInstance();
                                ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
                                pdao.create(contaDaMesa.getId());
                                Pedido ultimoPedido = pdao.getLastPedido();
                                ItemDAO idao = ItemDAO.getInstance();
                                Item i = idao.retrieveById(itemID);
                                if (i == null) {
                                    System.out.println("EH O ITEM");
                                }
                                if (ultimoPedido == null) {
                                    System.out.println("ULTIMOPEDIDO");
                                }
                                ipdao.create(i, ultimoPedido.getId(), ap.getQtd());
                                DefaultTableModel model = tela.getModeloTabela();
                                model.setRowCount(0);
                                carregarContaMesa(tela.getNumMesa());
                                JOptionPane.showMessageDialog(null, "Pedido criado com sucesso.");
                            }
                        });
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, selecione antes um item da tabela que deseja adicionar.");
                    }
                }

            });
            bi.setVisible(true);
        }

    }

    class BtnPorcaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaMenu.setVisible(false);
            BuscarItem bi = new BuscarItem("Busca de porções");
            bi.setBtnEditarText("Adicionar");
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
            //    BtnAdicionar
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ContaDAO cdao = ContaDAO.getInstance();
                    Conta contaDaMesa;
                    List<Conta> conta = cdao.retrieveGeneric("SELECT * FROM conta WHERE (numMesa = " + tela.getNumMesa() + " AND status = 1)");
                    contaDaMesa = conta.get(0);
                    try {
                        DefaultTableModel modeloTabela = bi.getModeloTabela();
                        Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                        // MUDA AQUI PRA ADICIONAR PEDIDO
                        AdicionarPedido ap = new AdicionarPedido();
                        ap.setVisible(true);

                        ap.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowIconified(WindowEvent e) {
                                ap.setVisible(false);
                                PedidoDAO pdao = PedidoDAO.getInstance();
                                ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
                                pdao.create(contaDaMesa.getId());
                                Pedido ultimoPedido = pdao.getLastPedido();
                                ItemDAO idao = ItemDAO.getInstance();
                                Item i = idao.retrieveById(itemID);
                                ipdao.create(i, ultimoPedido.getId(), ap.getQtd());
                                DefaultTableModel model = tela.getModeloTabela();
                                model.setRowCount(0);
                                carregarContaMesa(tela.getNumMesa());
                                JOptionPane.showMessageDialog(null, "Pedido criado com sucesso.");
                            }
                        });
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, selecione antes um item da tabela que deseja adicionar.");
                    }
                }

            });
            bi.setVisible(true);
        }

    }

    class BtnBebidaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaMenu.setVisible(false);
            BuscarItem bi = new BuscarItem("Busca de bebidas");
            bi.setBtnEditarText("Adicionar");
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
            //    BtnAdicionar
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ContaDAO cdao = ContaDAO.getInstance();
                    Conta contaDaMesa;
                    List<Conta> conta = cdao.retrieveGeneric("SELECT * FROM conta WHERE (numMesa = " + tela.getNumMesa() + " AND status = 1)");
                    contaDaMesa = conta.get(0);
                    try {
                        DefaultTableModel modeloTabela = bi.getModeloTabela();
                        Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                        // MUDA AQUI PRA ADICIONAR PEDIDO
                        AdicionarPedido ap = new AdicionarPedido();
                        ap.setVisible(true);

                        ap.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowIconified(WindowEvent e) {
                                ap.setVisible(false);
                                PedidoDAO pdao = PedidoDAO.getInstance();
                                ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
                                pdao.create(contaDaMesa.getId());
                                Pedido ultimoPedido = pdao.getLastPedido();
                                ItemDAO idao = ItemDAO.getInstance();
                                Item i = idao.retrieveById(itemID);
                                ipdao.create(i, ultimoPedido.getId(), ap.getQtd());
                                DefaultTableModel model = tela.getModeloTabela();
                                model.setRowCount(0);
                                carregarContaMesa(tela.getNumMesa());
                                JOptionPane.showMessageDialog(null, "Pedido criado com sucesso.");
                            }
                        });
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, selecione antes um item da tabela que deseja adicionar.");
                    }
                }

            });
            bi.setVisible(true);
        }

    }

    class BtnSobremesaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaMenu.setVisible(false);
            BuscarItem bi = new BuscarItem("Busca de sobremesas");
            bi.setBtnEditarText("Adicionar");
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
            //    BtnAdicionar
            bi.getBtnEditar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ContaDAO cdao = ContaDAO.getInstance();
                    Conta contaDaMesa;
                    List<Conta> conta = cdao.retrieveGeneric("SELECT * FROM conta WHERE (numMesa = " + tela.getNumMesa() + " AND status = 1)");
                    contaDaMesa = conta.get(0);
                    try {
                        DefaultTableModel modeloTabela = bi.getModeloTabela();
                        Integer itemID = Integer.parseInt(String.valueOf(modeloTabela.getDataVector().elementAt(bi.getTabela().getSelectedRow())).split("[\\[\\]]")[1].split(",")[0]);
                        // MUDA AQUI PRA ADICIONAR PEDIDO
                        AdicionarPedido ap = new AdicionarPedido();
                        ap.setVisible(true);

                        ap.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowIconified(WindowEvent e) {
                                ap.setVisible(false);
                                PedidoDAO pdao = PedidoDAO.getInstance();
                                ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
                                pdao.create(contaDaMesa.getId());
                                Pedido ultimoPedido = pdao.getLastPedido();
                                ItemDAO idao = ItemDAO.getInstance();
                                Item i = idao.retrieveById(itemID);
                                ipdao.create(i, ultimoPedido.getId(), ap.getQtd());
                                DefaultTableModel model = tela.getModeloTabela();
                                model.setRowCount(0);
                                carregarContaMesa(tela.getNumMesa());
                                JOptionPane.showMessageDialog(null, "Pedido criado com sucesso.");
                            }
                        });
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, selecione antes um item da tabela que deseja adicionar.");
                    }
                }

            });
            bi.setVisible(true);
        }

    }

    class BtnSalvarAlteracaoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            DefaultTableModel model = telaAlterar.getModeloTabela();
            DefaultTableModel modelTblItens = tela.getModeloTabela();
            PedidoDAO pdao = PedidoDAO.getInstance();
            ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
            
            for (int i = 0; i < model.getRowCount(); i++) {
                
                ipdao.update((Integer) model.getValueAt(i, 0), (Integer) model.getValueAt(i, 1), (Integer) model.getValueAt(i, 3));
                if ((Boolean) model.getValueAt(i, 4)) {
                    ipdao.delete((Integer) model.getValueAt(i, 0), (Integer) model.getValueAt(i, 1));
                }
                
            }
            
            telaAlterar.setVisible(false);
            DefaultTableModel modeloConta = tela.getModeloTabela();
            modeloConta.setRowCount(0);
            carregarContaMesa(tela.getNumMesa());
            
        }

    }

}
