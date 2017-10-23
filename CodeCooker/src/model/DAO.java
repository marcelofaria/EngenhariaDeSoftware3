/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author r176066
 */
public abstract class DAO {
    private static Connection con;
    //private static final String DBURL = "jdbc:mysql:///CodeCookers";
    private static final String DBURL = "jdbc:mysql://localhost/test";
    private static final String username = "";
    private static final String password = "";

    protected Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(DBURL, username, password);
            } catch (SQLException e) {
                System.out.println(e.getMessage() + "\n\n\n\n\n");
                System.out.println(e.getCause()+ "\n\n\n\n\n\n\n\n");
                throw new IllegalStateException("Cannot connect to the database!");
            }
        }
        return con;
    }

    protected ResultSet getResultSet(PreparedStatement queryStatement) throws SQLException {
        ResultSet rs;
        rs = queryStatement.executeQuery();
        return rs;
    }

    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        int update;
        update = queryStatement.executeUpdate();
        return update;
    }

    protected void terminar() {
        try {
            (this.getConnection()).close();
        } catch (SQLException e) {
        }
    }
}