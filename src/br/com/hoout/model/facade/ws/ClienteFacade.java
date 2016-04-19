package br.com.hoout.model.facade.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.hoout.model.domain.Cliente;

@Path("/cliente")
@Produces({MediaType.APPLICATION_JSON,
		  MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,
	  MediaType.APPLICATION_XML})
public class ClienteFacade {
	
	static List<Cliente> clientes = new ArrayList<Cliente>();
	
	@GET
	public List<Cliente> getClientes(){
		return clientes;
	}
	
	@POST
	public Cliente salvar(Cliente cliente){
		return cliente;
		
	}
	
	@PUT
	public void atualizar(Cliente cliente){}
	@DELETE
	@Path("/{codigoCliente}")
	public void excluir(@PathParam("codigoCliente") Integer codigoCliente){}

}
