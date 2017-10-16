package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m173574
 */
public class ContaDAO extends DAO{
    
    private static ContaDAO instance;
    private static Connection myCONN;

    public static ContaDAO getInstance() {
        if (ContaDAO.instance == null) {
            instance = new ContaDAO();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(float valorTotal, Date data) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO conta (valortotal, data) VALUES (?,?)");
            stmt.setFloat(1, valorTotal);
            stmt.setDate(2, data);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Conta buildObject(ResultSet rs) {
        Conta conta = null;
        try {
            conta = new Conta(rs.getFloat("valortotal"), rs.getDate("data"));
        } catch (SQLException e) {
        }
        return conta;
    }
    
    public List<Conta> retrieveGeneric(String query) {
        PreparedStatement stmt;
        List<Conta> conta = new ArrayList<>();
        ResultSet rs;
        try {
            stmt = myCONN.prepareStatement(query);
            rs = this.getResultSet(stmt);
            while (rs.next()) {
                conta.add(buildObject(rs));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
        }
        return conta;
    }
    
    public List<Conta> retrieveAll() {
        return this.retrieveGeneric("SELECT * FROM conta ORDER BY valortotal");
    }
    
    public boolean update(Conta conta) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE conta SET valortotal=? WHERE id = ?");
            //PedidoDAO.update(...)
            stmt.setFloat(1, conta.getValorTotal());
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        return false;
    }
    
    public void delete(Conta conta) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM conta WHERE id = ?");
            stmt.setInt(1, conta.getID());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
}