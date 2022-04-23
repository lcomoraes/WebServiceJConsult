package br.com.jconsult.model;
import java.util.ArrayList;
import br.com.jconsult.dao.ProcessoJudicialDAO;

/**
 * Classe que trata os erros entre a classe de persistencia e a classe de requisições do aplicativo cliente.
 * @author luan
 */
public class ProcessoJudicialBusiness {
	
	/**
	 * Método que busca todos os processos (método de teste)
	 * @return
	 */
	public ArrayList<ProcessoJudicial> buscarTodos() {
	     ProcessoJudicialDAO processoDAO = new ProcessoJudicialDAO();
	     return processoDAO.buscarTodos();
	}
	   
	/**
	 * Método que busca o processo pelo Número de Processo.
	 * @param numeroProcesso
	 * @return
	 */
    public ProcessoJudicial buscar(String numeroProcesso) {
	     ProcessoJudicialDAO processoDAO = new ProcessoJudicialDAO();
	     return processoDAO.buscar(numeroProcesso);
    }
   
	

}
