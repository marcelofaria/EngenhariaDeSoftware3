/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Mesa;
import model.MesaDAO;
import model.Usuario;
import model.UsuarioDAO;
import view.TelaPrincipal;
import view.cardapio.PainelCardapio;
import view.contas.PainelContas;
import view.estoque.PainelEstoque;
import view.financeiro.PainelFinanceiro;
import view.funcionarios.PainelFuncionario;
import view.itens.PainelItens;
import view.mesas.PainelMesas;

/**
 *
 * @author rafael
 */
public class CodeCookerController {
    
    private static int usuarioID;
    private TelaPrincipal tela;
    
    public CodeCookerController(){
        
    }
    
    public void start(){
        this.tela = new TelaPrincipal();
        this.tela.addBtnLoginListener(new BtnLoginListener());
        
        PainelCardapio pc = new PainelCardapio();
        CardapioController cardapioControl = new CardapioController(pc);
        tela.getTabbedPane().addTab("", new ImageIcon(getClass().getResource("/image/menu_minimalistic.png")), pc);
        
        PainelMesas pm = new PainelMesas();
        MesasController mesasControl = new MesasController(pm);
        tela.getTabbedPane().addTab("", new ImageIcon(getClass().getResource("/image/table_win.png")), pm);
        
        PainelItens pi = new PainelItens();
        ItensController itensControl = new ItensController(pi);
        tela.getTabbedPane().addTab("", new ImageIcon(getClass().getResource("/image/food_minimalistic.png")), pi);
        
        PainelContas pcontas = new PainelContas();
        ContasController cc = new ContasController(pcontas);
        tela.getTabbedPane().addTab("", new ImageIcon(getClass().getResource("/image/ic_book_black_24dp.png")), pcontas);
        
        PainelEstoque pe = new PainelEstoque();
        EstoqueController estoqueControl = new EstoqueController(pe);
        tela.getTabbedPane().addTab("", new ImageIcon(getClass().getResource("/image/box.png")), pe);
        
        
        PainelFuncionario pf = new PainelFuncionario();
        FuncionarioController funcControl = new FuncionarioController(pf);
        tela.getTabbedPane().addTab("",new ImageIcon(getClass().getResource("/image/ic_face_black_24dp.png")), pf);
        
        PainelFinanceiro pfin = new PainelFinanceiro();
        FinanceiroController fc = new FinanceiroController(pfin);
        tela.getTabbedPane().addTab("", new ImageIcon(getClass().getResource("/image/ic_attach_money_black_24dp.png")), pfin);
        
        tela.getTabbedPane().addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(tela.getTabbedPane().getSelectedIndex() == 7){
                    fc.carregarReceitaDoDia();
                    fc.carregarNumPedidosDoDia();
                    fc.carregarPratoDoDia();
                }
            }
        });
        
        tela.getTabbedPane().setEnabledAt(1, false);
        tela.getTabbedPane().setEnabledAt(2, false);
        tela.getTabbedPane().setEnabledAt(3, false);
        tela.getTabbedPane().setEnabledAt(4, false);
        tela.getTabbedPane().setEnabledAt(5, false);
        tela.getTabbedPane().setEnabledAt(6, false);
        tela.getTabbedPane().setEnabledAt(7, false);
        
        tela.setVisible(true);
    }
    
    public static int getUsuarioID(){
        return CodeCookerController.usuarioID;
    }
    
    public int autUsuario(String u, String senha){
        
        UsuarioDAO udao = UsuarioDAO.getInstance();
        
        Usuario usuario = udao.retrieveByUsername(u);
        Usuario usuarioSenha = udao.retrieveByPass(senha);
           
        if(usuario != null && usuarioSenha != null){
            CodeCookerController.usuarioID = usuario.getId();
            return usuario.getTipoUsuario();
          
        }else{
           return 0;
        }
        
    }
    
    public void cadUsuario(String username, String pass, int tipo, String nome, String cpf){
        
        UsuarioDAO udao = UsuarioDAO.getInstance();
        
        udao.create(username, pass, tipo, nome, cpf);
        
    }
    
    class BtnLoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        String u;
        String senha;

        u = tela.getUsuario();
        senha = tela.getSenha();

        int res = autUsuario(u, senha);
        if(res != 0){

            if(res == 1){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Caixa");
                tela.PrepararTela(1);

            }
            else if(res == 2){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Metre");
                tela.PrepararTela(2);

            }
            else if(res == 3){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Gerente");
                tela.PrepararTela(3);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Voce nao foi identificado");
        }
        }
        
    }
    
}
