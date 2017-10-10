package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m173574
 */
public class CaixaDAO extends DAO{
    
    private static CaixaDAO instance;
    private static Connection myCONN;

    private CaixaDAO() {
    }

    public static CaixaDAO getInstance() {
        if (instance == null) {
            instance = new CaixaDAO();
            myCONN = instance.getConnection();
        }
        return instance;
    }
    
    public void create(String nome, String cpf) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO caixa (nome,cpf) VALUES (?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Caixa buildObject(ResultSet rs) {
        Caixa caixa = null;
        try {
            caixa = new Caixa(rs.getString("nome"), rs.getString("cpf"));
        } catch (SQLException e) {
        }
        return caixa;
    }
    
    public List<Caixa> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Caixa> caixa = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                caixa.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return caixa;
    }
    
    public List<Caixa> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM caixa ORDER BY nome");
    }
    
    public List<Caixa> retrieveLike(String nome) {
        return this.retrieveGeneric("SELECT * FROM caixa WHERE nome LIKE '%"+nome+"%' ORDER BY nome");
    }
    
    public Caixa retrieveById(int id) {
        Caixa caixa = null;
        List<Caixa> caixas = this.retrieveGeneric("SELECT * FROM caixa WHERE id="+id);
        if(!caixas.isEmpty()){
            caixa = caixas.get(0);
        }
        return caixa;
    }

    public boolean update(Caixa caixa) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE caixa SET nome=?, cpf=? WHERE id = ?");
            stmt.setString(1, caixa.getNome());
            stmt.setString(2, caixa.getCpf());
            stmt.setInt(3, caixa.getID());
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
