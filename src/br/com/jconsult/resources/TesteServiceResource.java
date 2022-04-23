package br.com.jconsult.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
/**
 * Classe responsável pelo teste do Web Service. (Verificar a resposta do serviço).
 * @author luan
 *
 */
@Path("/teste")
public class TesteServiceResource {
	
	@GET
    @Produces("text/plain")
    public String showHelloWorld() {
		return "Teste WEBService JBConsult 0.7.1";   
    }

}
