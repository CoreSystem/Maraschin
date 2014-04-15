package br.com.core.relatorios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Daniel Alves
 */
public class Conexao {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/usuario";
	private String USER = "root";
    private String SENHA = "";
    private Connection conn;
 
    @SuppressWarnings({"CallToThreadDumpStack", "UseSpecificCatch"})
    public Conexao() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, USER, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public Connection getConn() {
        return conn;
    }
 
    @SuppressWarnings("CallToThreadDumpStack")
    public void fecharConexao() {
        try {
            conn.close();
        //PEGA E MOSTRA OS ERROS GERADOS NO METODO
        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }
}
