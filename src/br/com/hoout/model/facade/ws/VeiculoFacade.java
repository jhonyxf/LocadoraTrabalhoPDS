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

import br.com.hoout.model.domain.Veiculo;

@Path("/veiculo")
@Produces({MediaType.APPLICATION_JSON,
		  MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,
	  MediaType.APPLICATION_XML})
public class VeiculoFacade {
	
	static List<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	@GET
	public List<Veiculo> getVeiculos(){
		return veiculos;
	}
	
	@POST
	public Veiculo salvar(Veiculo veiculo){
		return veiculo;
		
	}
	
	@PUT
	public void atualizar(Veiculo veiculo){}
	@DELETE
	@Path("/{codigoVeiculo}")
	public void excluir(@PathParam("codigoVeiculo") Integer codigoVeiculo){}

}
