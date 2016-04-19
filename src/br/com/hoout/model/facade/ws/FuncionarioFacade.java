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

import br.com.hoout.model.domain.Funcionario;

@Path("/funcionario")
@Produces({MediaType.APPLICATION_JSON,
		  MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,
	  MediaType.APPLICATION_XML})
public class FuncionarioFacade {
	
	static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	@GET
	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	
	@POST
	public Funcionario salvar(Funcionario funcionario){
		return funcionario;
		
	}
	
	@PUT
	public void atualizar(Funcionario funcionario){}
	@DELETE
	@Path("/{codigoFuncionario}")
	public void excluir(@PathParam("codigoFuncionario") Integer codigoFuncionario){}

}
