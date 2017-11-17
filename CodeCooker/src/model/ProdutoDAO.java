/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class ProdutoDAO extends DAO{
    
    private static ProdutoDAO instance;
    private static Connection myCONN;

    public static ProdutoDAO getInstance() {
        if (ProdutoDAO.instance == null) {
            instance = new ProdutoDAO();
            myCONN = instance.getConnection();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(int qtd, String nome, String marca, String fornecedor) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO produto (qtd, nome, marca, fornecedor) VALUES (?,?,?,?)");
            stmt.setInt(1, qtd);
            stmt.setString(2, nome);
            stmt.setString(3, marca);
            stmt.setString(4, fornecedor);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Produto buildObject(ResultSet rs) {
        Produto produto = null;
        try {
            produto = new Produto(rs.getInt("qtd"), rs.getString("nome"), rs.getString("marca"), rs.getString("fornecedor"));
        } catch (SQLException e) {
        }
        return produto;
    }
    
    public List<Produto> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Produto> produtos = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                produtos.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return produtos;
    }
    
    public List<Produto> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM produto ORDER BY qtd");
    }
    
    public List<Produto> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM produto WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public Produto retrieveById(int id) {
        Produto produto = null;
        List<Produto> produtos = this.retrieveGeneric("SELECT * FROM produto WHERE id="+id);
        if(!produtos.isEmpty()){
            produto = produtos.get(0);
        }
        return produto;
    }
     
    public boolean update(Produto produto) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE produto SET qtd=?, nome=?, marca=?, fornecedor=? WHERE id = ?");
            stmt.setInt(1, produto.getQtd());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getMarca());
            stmt.setString(4, produto.getFornecedor());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public void delete(Produto produto) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, produto.getId());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
}
