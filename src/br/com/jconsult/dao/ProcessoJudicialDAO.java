package br.com.jconsult.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.jconsult.factory.ConnectionFactory;
import br.com.jconsult.model.ProcessoJudicial;
/**
 * Classe responsável pelas consultas ao banco de dados.
 * @author luan
 *
 */
public class ProcessoJudicialDAO extends ConnectionFactory{
	
	/**
	 * Busca o processo enviando o parâmetro Número do processo
	 * @param numeroProcesso
	 * @return
	 */
	public ProcessoJudicial buscar(String numeroProcesso) {

	     Connection conn = null;
	     ResultSet resultSet = null;
	     PreparedStatement stmt = null;
	     conn = getConnection();
	     ProcessoJudicial processo = null;
	     try {
	    	 
	         stmt = conn.prepareStatement("SELECT * FROM tblprocesso WHERE numeroProcesso = ?");
	         stmt.setString(1, numeroProcesso);
	         resultSet = stmt.executeQuery();
	         	while (resultSet.next()) {
		        	 processo = new ProcessoJudicial();
		        	 processo.setNumeroUnico(resultSet.getString("numeroUnico"));
		        	 processo.setNumeroProcesso(resultSet.getString("numeroProcesso"));
		        	 processo.setDataAbertura(resultSet.getString("dataAbertura"));
		        	 processo.setNatureza(resultSet.getString("natureza"));
		        	 processo.setClasse(resultSet.getString("classe"));
	         	}
	     	} catch (SQLException e) {
	     			e.printStackTrace();
	     	} finally {
	     			closeConnection(conn, stmt, resultSet);
	     	}
	     	return processo;
	    }
	
	/**
	 * Método de Teste que busca todos os processo do banco de dados ordenando pelo número único de cada processo.
	 * @return
	 */
	 public ArrayList<ProcessoJudicial> buscarTodos() {

	     Connection conn = null;
	     ResultSet resultSet = null;
	     PreparedStatement stmt = null;
	     conn = getConnection();
	     ArrayList<ProcessoJudicial> listaProcessos = null;

	     try {

	         stmt = conn.prepareStatement("SELECT * FROM tblprocesso ORDER BY numeroUnico");
	         resultSet = stmt.executeQuery();
	         listaProcessos = new ArrayList<ProcessoJudicial>();

	         while (resultSet.next()) {
	             ProcessoJudicial processo = new ProcessoJudicial();
	             
	             
	             processo = new ProcessoJudicial();
	        	 processo.setNumeroUnico(resultSet.getString("numeroUnico"));
	        	 processo.setNumeroProcesso(resultSet.getString("numeroProcesso"));
	        	 processo.setDataAbertura(resultSet.getString("dataAbertura"));
	        	 processo.setNatureza(resultSet.getString("natureza"));
	        	 processo.setClasse(resultSet.getString("classe"));
	             
	             
	             listaProcessos.add(processo);
	         }

	     } catch (SQLException e) {
	         e.printStackTrace();
	         listaProcessos = null;
	     } finally {
	         closeConnection(conn, stmt, resultSet);
	     }
	     return listaProcessos;
	    }
	    
	    
	

}
