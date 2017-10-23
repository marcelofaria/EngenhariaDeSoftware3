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
 * @author rafael, marcelo
 */
public class GerenteDAO extends DAO {
    
    private static GerenteDAO instance;
    private static Connection myCONN;
    
    public static GerenteDAO getInstance() {
        if (GerenteDAO.instance == null) {
            instance = new GerenteDAO();
            myCONN = instance.getConnection();
            return instance;
        }
        else{
            return instance;
        }
    }
    
    public void create(String nome, String cpf, String cnpj) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO Gerente (nome,cpf, cnpj) VALUES (?,?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(2, cnpj);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Gerente buildObject(ResultSet rs) {
        Gerente g = null;
        try {
            g = new Gerente(rs.getString("nome"), rs.getString("cpf"), rs.getString("cnpj"));
        } catch (SQLException e) {
        }
        return g;
    }
    
    public List<Gerente> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Gerente> gerentes = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                System.out.println("vestigio");
                gerentes.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return gerentes;
    }
    
    public List<Gerente> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM Gerente ORDER BY nome");
    }
    
    public List<Gerente> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM Gerente WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public Gerente retrieveByPass(String pass) {
        Gerente gerente = null;
        List<Gerente> gerentes = this.retrieveGeneric("SELECT * FROM Gerente WHERE senha like "+"unicorniosemchifre");
        if(!gerentes.isEmpty()){
            gerente = gerentes.get(0);
        }
        return gerente;
    }
    
    public Gerente retrieveById(int id) {
        Gerente gerente = null;
        List<Gerente> gerentes = this.retrieveGeneric("SELECT * FROM Gerente WHERE id="+id);
        if(!gerentes.isEmpty()){
            gerente = gerentes.get(0);
        }
        return gerente;
    }
    
    public boolean update(Gerente gerente) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE Gerente SET nome=?, cpf=?, cnpj=? WHERE id = ?");
            stmt.setString(1, gerente.getNome());
            stmt.setString(2, gerente.getCpf());
            stmt.setString(3, gerente.getCnpj());
            stmt.setInt(4, gerente.getIdGerente());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        return false;
    }
    
}
