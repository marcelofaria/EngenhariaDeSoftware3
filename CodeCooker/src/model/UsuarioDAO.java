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
 * @author Rafael, Marcelo
 */
public class UsuarioDAO extends DAO {
    
    private static UsuarioDAO instance;
    private static Connection myCONN;

    public static UsuarioDAO getInstance() {
        if (UsuarioDAO.instance == null) {
            instance = new UsuarioDAO();
            myCONN = instance.getConnection();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(String username, String pass, int tipo, String nome, String cpf) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO usuario (username, senha, tipoUsuario, nome, cpf) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, username);
            stmt.setString(2, pass);
            stmt.setInt(3, tipo);
            stmt.setString(4, nome);
            stmt.setString(5, cpf);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    public void create(String username, String pass, int tipo, String nome, String cpf, String cnpj) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO usuario (username, senha, tipoUsuario, nome, cpf, cnpj) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, username);
            stmt.setString(2, pass);
            stmt.setInt(3, tipo);
            stmt.setString(4, nome);
            stmt.setString(5, cpf);
            stmt.setString(6, cnpj);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Usuario buildObject(ResultSet rs) {
        Usuario usuario = null;
        try {
            usuario = new Usuario(rs.getString("nome"), rs.getString("cpf"), rs.getInt("tipoUsuario"), rs.getString("cnpj"));
        } catch (SQLException e) {
        }
        return usuario;
    }
    
    public List<Usuario> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Usuario> usuarios = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                usuarios.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return usuarios;
    }
    
    public List<Usuario> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM usuario ORDER BY nome");
    }
    
    public List<Usuario> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM usuario WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public Usuario retrieveById(int id) {
        Usuario usuario = null;
        List<Usuario> usuarios = this.retrieveGeneric("SELECT * FROM usuario WHERE id="+id);
        if(!usuarios.isEmpty()){
            usuario = usuarios.get(0);
        }
        return usuario;
    }
    
    public Usuario retrieveByPass(String pass) {
        Usuario usu = null;
        List<Usuario> usus = this.retrieveGeneric("SELECT * FROM usuario WHERE senha Like '"+pass+"'");
        if(!usus.isEmpty()){
            usu = usus.get(0);
        }
        return usu;
    }
    
        public Usuario retrieveByUsername(String username) {
        Usuario usu = null;
        List<Usuario> usus = this.retrieveGeneric("SELECT * FROM usuario WHERE username Like '"+username+"'");
        if(!usus.isEmpty()){
            usu = usus.get(0);
        }
        return usu;
    }
    
    public boolean update(Usuario u, String username, String password) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE usuario SET username=?, senha=?, tipoUsuario=?, nome=?, cpf=?, cnpj=?, WHERE id = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setInt(3, u.getTipoUsuario());
            stmt.setString(4, u.getNome());
            stmt.setString(5, u.getCpf());
            stmt.setString(6, u.getCnpj());
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
    
    public void delete(Usuario u) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM usuario WHERE id = ?");
            stmt.setInt(1, u.getUsuarioID());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
}
