package br.com.hoout.model.facade.rs;

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

import br.com.hoout.model.domain.Locacao;

@Path("/locacao")
@Produces({MediaType.APPLICATION_JSON,
		  MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,
	  MediaType.APPLICATION_XML})
public class LocacaoFacade {
	
	static List<Locacao> locacaos = new ArrayList<Locacao>();
	
	@GET
	public List<Locacao> getLocacaos(){
		return locacaos;
	}
	
	@POST
	public Locacao salvar(Locacao locacao){
		return locacao;
		
	}
	
	@PUT
	public void atualizar(Locacao locacao){}
	@DELETE
	@Path("/{codigoLocacao}")
	public void excluir(@PathParam("codigoLocacao") Integer codigoLocacao){}

}
