package br.com.jconsult.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Cria conexão com o servidor de banco de dados
 * @author luan
 *
 */
public abstract class ConnectionFactory {
	
	// database URL
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/jconsultBD";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    /**
     * Obtém a conexão com o SGBD, enviando parâmetros de nome do banco, usuário e senha.
     * @return
     */
    public Connection getConnection() {
	     Connection con = null;
	     try {
	         Class.forName("org.gjt.mm.mysql.Driver");
	         con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	         System.out.println("conexão realizada com sucesso!");
	     } catch (Exception e) {
	         System.out.println("Erro ao criar conexao.");
	         e.printStackTrace();
	     }
	     return con;
    }
    /**
     * Fecha conexão com o SGBD
     * @param conn
     * @param stmt
     * @param rs
     */
    public void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
	     try {
	         close(conn, stmt, rs);
	         System.out.println("conexão fechada com sucesso!");
	     } catch (Exception e) {
	         System.out.println("Erro ao fechar conexao.");
	         e.printStackTrace();
	     }
    }
    /**
     * Fecha conexão com o SGBD
     * @param conn
     * @param stmt
     */
    public void closeConnection(Connection conn, Statement stmt) {
	     try {
	         close(conn, stmt, null);
	         System.out.println("conexão fechada com sucesso!");
	     } catch (Exception e) {
	         System.out.println("Erro ao fechar conexao.");
	         e.printStackTrace();
	     }
    }
    /**
     * Fecha conexão com o SGBD
     * @param conn
     */
    public void closeConnection(Connection conn) {
	     try {
	         close(conn, null, null);
	         System.out.println("conexão fechada com sucesso!");
	     } catch (Exception e) {
	         System.out.println("Erro ao fechar conexao.");
	         e.printStackTrace();
	     }
    }
    /**
     * Fecha conexão com o SGBD
     * @param conn
     * @param stmt
     * @param rs
     */
    private void close(Connection conn, Statement stmt, ResultSet rs) {

	     try {
	         if (rs != null) {
	             rs.close();
	             System.out.println("conexão fechada com sucesso!");
	         }
	         if (stmt != null) {
	             stmt.close();
	             System.out.println("conexão fechada com sucesso!");
	         }
	         if (conn != null) {
	             conn.close();
	             System.out.println("conexão fechada com sucesso!");
	         }
	     } catch (Exception e) {
	         System.out.println("Erro ao fechar conexao.");
	         e.printStackTrace();
	     }
    }

	
	
}
