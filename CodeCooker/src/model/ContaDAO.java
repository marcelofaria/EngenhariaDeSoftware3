package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
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
            ContaDAO.instance = new ContaDAO();
            ContaDAO.myCONN = ContaDAO.instance.getConnection();
            return instance;
        } else {
            return instance;
        }
    }
    
    public void create(double valorTotal, int numMesa, Date data, boolean status) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("INSERT INTO conta (valorTotal, numMesa, dataConta, status) VALUES (?, ?, ?, ?)");
            stmt.setDouble(1, valorTotal);
            stmt.setInt(2, numMesa);
            stmt.setDate(3, data);
            stmt.setBoolean(4, status);
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
    
    private Conta buildObject(ResultSet rs) {
        Conta conta = null;
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(rs.getDate("dataConta"));
            conta = new Conta(rs.getInt("contaID"), rs.getInt("numMesa"), rs.getDouble("valorTotal"), cal, rs.getBoolean("status"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
        return this.retrieveGeneric("SELECT * FROM conta ORDER BY dataConta");
    }
    
    public boolean update(Conta conta) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("UPDATE conta SET numMesa=? dataConta=? status=? WHERE contaID = ?");
            //PedidoDAO.update(...)
            stmt.setInt(1, conta.getId());
            stmt.setDate(2, (Date) conta.getData().getTime());
            stmt.setBoolean(3, conta.getStatus());
            int update = this.executeUpdate(stmt);
            stmt.close();
            if (update == 1) {
                return true;
            }
        } catch (SQLException ex) {
        }
        return false;
    }
    
    public boolean updateStatus(int contaID, boolean status){
        PreparedStatement stmt;
        try{
            stmt = myCONN.prepareStatement("UPDATE conta SET status = ? WHERE contaID = ?");
            stmt.setBoolean(1, status);
            stmt.setInt(2, contaID);
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());     
        }
        return false;
    }
    
    public boolean updateValorTotal(int contaID, double valor){
        PreparedStatement stmt;
        try{
            stmt = myCONN.prepareStatement("UPDATE conta SET valorTotal = ? WHERE contaID = ?");
            stmt.setDouble(1, valor);
            stmt.setInt(2, contaID);
            int update = this.executeUpdate(stmt);
            if (update == 1) {
                return true;
            }
            stmt.close();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());     
        }
        return false;
    }
    
    public boolean existeConta(int numMesa){
        PreparedStatement stmt;
        ResultSet rs;
        try{
            stmt = myCONN.prepareStatement("SELECT * FROM conta WHERE numMesa = ? AND status = 1"); // TRUE = conta aberta
            stmt.setInt(1, numMesa);
            rs = this.getResultSet(stmt);
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public void delete(Conta conta) {
        PreparedStatement stmt;
        try {
            stmt = myCONN.prepareStatement("DELETE FROM conta WHERE contaID = ?");
            stmt.setInt(1, conta.getId());
            this.executeUpdate(stmt);
            stmt.close();
        } catch (SQLException ex) {
        }
    }
}
