package br.com.jconsult.resources;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import br.com.jconsult.exception.NoContentException;
import br.com.jconsult.model.ProcessoJudicial;
import br.com.jconsult.model.ProcessoJudicialBusiness;
import com.google.gson.Gson;

/**
 * WebResource responsável por receber e responder as requisições do aplicativo cliente.
 * @author luan
 *
 */
@Path("/processo")
public class ProcessoJudicialResource {
   
    @GET
    @Path("/{numeroProcesso}")
    @Produces("application/json")
    public ProcessoJudicial getProcesso(@PathParam("numeroProcesso") String numeroProcesso){
	     ProcessoJudicial processo = new ProcessoJudicialBusiness().buscar(numeroProcesso);
	    
	     if(processo == null)
	         throw new NoContentException("Processo não encontrado!");
	    
	     return processo;
    }
    
    @GET
    @Path("/testeConexao")
    @Produces("text/plain")
    public String testeConexao() {
		return "Conexão bem sucedida\n WEBService: JBConsult\n versão:0.7.1";   
    }
    
    @GET
    @Path("/buscarTodos")
    @Produces("application/json")
    public ArrayList<ProcessoJudicial> selTodos(){
    	return new ProcessoJudicialBusiness().buscarTodos();
    }

    
    @GET
    @Path("/buscarTodosGSON")
    @Produces("application/json")
    public String selTodosGSON(){
    	return new Gson().toJson(new ProcessoJudicialBusiness().buscarTodos());
    }
   
    

}
