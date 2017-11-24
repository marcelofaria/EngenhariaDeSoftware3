/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.mesas.PainelMesas;
import control.CardapioController;
import view.funcionarios.PainelFuncionario;
import view.itens.PainelItens;
import control.CodeCookerController;
import control.EstoqueController;
import control.FuncionarioController;
import control.ItensController;
import control.MesasController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import view.cardapio.PainelCardapio;
import view.estoque.PainelEstoque;

/**
 *
 * @author Marcelo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    CodeCookerController baseController;
    
    /**
     *
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        //setLookAndFeel();
        baseController = new CodeCookerController();
        setLookAndFeel();
        initComponents();
        
        CenteredFrame(this);
        lblBemVindo.setVisible(false);
        lblImagemCozinheiro.add(lblTitulo);
        
        PainelCardapio pc = new PainelCardapio();
        CardapioController cardapioControl = new CardapioController(pc);
        tabPane.addTab("", new ImageIcon(getClass().getResource("/image/menu.png")), pc);
        
        PainelMesas pm = new PainelMesas();
        MesasController mesasControl = new MesasController(pm);
        tabPane.addTab("", new ImageIcon(getClass().getResource("/image/pixel_round_table_by_shi_ju-d7gxbbg.png")), pm);
        
        PainelEstoque pe = new PainelEstoque();
        EstoqueController estoqueControl = new EstoqueController(pe);
        tabPane.addTab("", new ImageIcon(getClass().getResource("/image/Cardboard_Box_Closed.png")), pe);
        
        PainelItens pi = new PainelItens();
        ItensController itensControl = new ItensController(pi);
        tabPane.addTab("", new ImageIcon(getClass().getResource("/image/sandwich.png")), pi);
        
        PainelFuncionario pf = new PainelFuncionario();
        FuncionarioController funcControl = new FuncionarioController(pf);
        tabPane.addTab("",new ImageIcon(getClass().getResource("/image/waiter.png")), pf);
        
        
        tabPane.setEnabledAt(1, false);
        tabPane.setEnabledAt(2, false);
        tabPane.setEnabledAt(3, false);
        tabPane.setEnabledAt(4, false);
        tabPane.setEnabledAt(5, false);
        tabPane.setEnabledAt(6, false);
        tabPane.setEnabledAt(7, false);
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblImagemCozinheiro = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlContas = new javax.swing.JPanel();
        lblTituloContas = new javax.swing.JLabel();
        cmbContaMesas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidosConta = new javax.swing.JTable();
        lblTotalConta = new javax.swing.JLabel();
        ftxtTotalConta = new javax.swing.JFormattedTextField();
        btnFecharConta = new javax.swing.JButton();
        btnAdicionarPedido = new javax.swing.JButton();
        btnAlterarConta = new javax.swing.JButton();
        pnlEstoque = new javax.swing.JPanel();
        lblTituloEstoque = new javax.swing.JLabel();
        btnAdicionarProduto = new javax.swing.JButton();
        btnBuscarProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        pnlFinancas = new javax.swing.JPanel();
        lblTituloFinanceiro = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        lblReceita = new javax.swing.JLabel();
        lblTxtNClientes = new javax.swing.JLabel();
        lblTxtNPedidos = new javax.swing.JLabel();
        lblTxtPratoDoDia = new javax.swing.JLabel();
        lblValorReceita = new javax.swing.JLabel();
        lblNClientes = new javax.swing.JLabel();
        lblNPedidos = new javax.swing.JLabel();
        lblPratoDoDia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeCookers");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        tabPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabPane.setToolTipText("");
        tabPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabPane.setMinimumSize(new java.awt.Dimension(110, 50));
        tabPane.setPreferredSize(new java.awt.Dimension(433, 230));
        tabPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneStateChanged(evt);
            }
        });

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlHome.setMaximumSize(new java.awt.Dimension(25, 25));

        btnLogin.setText("Conectar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        lblTitulo.setText("CodeCookers");

        txtUsuario.setToolTipText("");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuario");

        lblSenha.setText("Senha");

        lblImagemCozinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cozinheiro.jpg"))); // NOI18N

        lblBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBemVindo.setText("Bem Vindo!");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLogin)
                                    .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSenha)
                                        .addComponent(lblUsuario))))
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblBemVindo)))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagemCozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBemVindo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSenha)
                        .addGap(3, 3, 3)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addComponent(lblImagemCozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/casa.png")), pnlHome, ""); // NOI18N

        lblTituloContas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloContas.setText("Contas");

        cmbContaMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6" }));

        tblPedidosConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedidos", "Qtd", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidosConta.setColumnSelectionAllowed(true);
        tblPedidosConta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPedidosConta);
        tblPedidosConta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblPedidosConta.getColumnModel().getColumnCount() > 0) {
            tblPedidosConta.getColumnModel().getColumn(0).setResizable(false);
            tblPedidosConta.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblPedidosConta.getColumnModel().getColumn(1).setResizable(false);
            tblPedidosConta.getColumnModel().getColumn(2).setResizable(false);
        }

        lblTotalConta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalConta.setText("Total");

        ftxtTotalConta.setEditable(false);
        ftxtTotalConta.setBackground(new java.awt.Color(102, 255, 102));
        ftxtTotalConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        btnFecharConta.setText("Fechar conta");

        btnAdicionarPedido.setText("Adicionar pedido");

        btnAlterarConta.setText("Alterar conta");

        javax.swing.GroupLayout pnlContasLayout = new javax.swing.GroupLayout(pnlContas);
        pnlContas.setLayout(pnlContasLayout);
        pnlContasLayout.setHorizontalGroup(
            pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContasLayout.createSequentialGroup()
                .addGroup(pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftxtTotalConta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlContasLayout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(lblTituloContas))
                        .addGroup(pnlContasLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                .addComponent(cmbContaMesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFecharConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        pnlContasLayout.setVerticalGroup(
            pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContasLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTituloContas)
                .addGap(34, 34, 34)
                .addComponent(cmbContaMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContasLayout.createSequentialGroup()
                        .addComponent(btnFecharConta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtTotalConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalConta))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/conta.png")), pnlContas); // NOI18N

        lblTituloEstoque.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloEstoque.setText("Controle de Estoque");

        btnAdicionarProduto.setBackground(new java.awt.Color(102, 255, 102));
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnBuscarProduto.setText("Buscar");

        btnAlterarProduto.setText("Alterar");

        btnExcluirProduto.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluirProduto.setText("Excluir");

        javax.swing.GroupLayout pnlEstoqueLayout = new javax.swing.GroupLayout(pnlEstoque);
        pnlEstoque.setLayout(pnlEstoqueLayout);
        pnlEstoqueLayout.setHorizontalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstoqueLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstoqueLayout.createSequentialGroup()
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloEstoque)
                .addGap(141, 141, 141))
        );
        pnlEstoqueLayout.setVerticalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstoqueLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTituloEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEstoqueLayout.createSequentialGroup()
                        .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );

        tabPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/Cardboard_Box_Closed.png")), pnlEstoque); // NOI18N

        lblTituloFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloFinanceiro.setText("Financeiro");

        btnRelatorio.setText("Gerar relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        lblReceita.setText("Receita do dia");

        lblTxtNClientes.setText("Nº de clientes");

        lblTxtNPedidos.setText("Nº Pedidos");

        lblTxtPratoDoDia.setText("Prato do dia");

        lblValorReceita.setForeground(new java.awt.Color(0, 204, 0));
        lblValorReceita.setText("R$ 90,00");

        lblNClientes.setText("12");

        lblNPedidos.setText("22");

        lblPratoDoDia.setText("Stuffed Peppers");

        javax.swing.GroupLayout pnlFinancasLayout = new javax.swing.GroupLayout(pnlFinancas);
        pnlFinancas.setLayout(pnlFinancasLayout);
        pnlFinancasLayout.setHorizontalGroup(
            pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFinancasLayout.createSequentialGroup()
                .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFinancasLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblTituloFinanceiro))
                    .addGroup(pnlFinancasLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTxtNPedidos)
                            .addComponent(lblTxtNClientes)
                            .addComponent(lblTxtPratoDoDia)
                            .addComponent(lblReceita))
                        .addGap(41, 41, 41)
                        .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorReceita)
                            .addComponent(lblNClientes)
                            .addComponent(lblNPedidos)
                            .addComponent(lblPratoDoDia))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFinancasLayout.setVerticalGroup(
            pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFinancasLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTituloFinanceiro)
                .addGap(62, 62, 62)
                .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFinancasLayout.createSequentialGroup()
                        .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReceita)
                            .addComponent(lblValorReceita))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxtNClientes)
                            .addComponent(lblNClientes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxtNPedidos)
                            .addComponent(lblNPedidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxtPratoDoDia)
                            .addComponent(lblPratoDoDia)))
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        tabPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/money.png")), pnlFinancas); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tabPaneStateChanged

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String u;
        String senha;

        u = txtUsuario.getText();
        senha = String.valueOf(txtSenha.getPassword());

        int res = baseController.autUsuario(u, senha);
        if(res != 0){

            if(res == 1){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Caixa");
                PrepararTela(1);

            }
            else if(res == 2){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Metre");
                PrepararTela(2);

            }
            else if(res == 3){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Gerente");
                PrepararTela(3);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Voce nao foi identificado");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    public void PrepararTela(int tipo){
        
        lblUsuario.setVisible(false);
        txtUsuario.setVisible(false);
        lblSenha.setVisible(false);
        txtSenha.setVisible(false);
        btnLogin.setVisible(false);
        lblBemVindo.setVisible(true);
        
        if(tipo == 1){
            tabPane.setEnabledAt(4, true);
        }
        else if(tipo == 2){
            tabPane.setEnabledAt(1, true);
        }
        else if(tipo == 3){
            tabPane.setEnabledAt(1, true);
            tabPane.setEnabledAt(2, true);
            tabPane.setEnabledAt(3, true);
            tabPane.setEnabledAt(4, true);
            tabPane.setEnabledAt(5, true);
            tabPane.setEnabledAt(6, true);
            tabPane.setEnabledAt(7, true);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarPedido;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAlterarConta;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnFecharConta;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JComboBox<String> cmbContaMesas;
    private javax.swing.JFormattedTextField ftxtTotalConta;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblImagemCozinheiro;
    private javax.swing.JLabel lblNClientes;
    private javax.swing.JLabel lblNPedidos;
    private javax.swing.JLabel lblPratoDoDia;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloContas;
    private javax.swing.JLabel lblTituloEstoque;
    private javax.swing.JLabel lblTituloFinanceiro;
    private javax.swing.JLabel lblTotalConta;
    private javax.swing.JLabel lblTxtNClientes;
    private javax.swing.JLabel lblTxtNPedidos;
    private javax.swing.JLabel lblTxtPratoDoDia;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblValorReceita;
    private javax.swing.JPanel pnlContas;
    private javax.swing.JPanel pnlEstoque;
    private javax.swing.JPanel pnlFinancas;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tblPedidosConta;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
