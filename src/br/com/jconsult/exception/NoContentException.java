package br.com.jconsult.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * Classe que retorna uma mensagem se ocorrer erro 404. Uma exceção customizada, para conseguir devolver um objeto mapeado em JSON
 * @author luan
 */
public class NoContentException extends WebApplicationException {
	
	private static final long serialVersionUID = 1L;

    public NoContentException(String mensagem) {
    	super(Response.status(Status.NOT_FOUND).entity(mensagem).build());
    }

}
