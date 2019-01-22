package br.com.neomind;

import java.util.HashSet;
import java.util.Set;

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
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import br.com.neomind.Fornecedor;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// {"id": 1, "name": "fornec lorimospm", "email": "fornec@loripsom", "comment": "loreipsum", "cnpj": "00.000/0000-00"}

// localhost:8080/fornecedores/app

@Path("app")
public class FornecedoresService {
	private static List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public FornecedoresService() {
		// popula a lista de fornecedores para fins de testes
		System.out.println("Criado FornecedoresService");
		System.out.println("Iniciando o serviço de população...");

		if (fornecedores.isEmpty()) {
			Fornecedor fornecedor1 = new Fornecedor();
			fornecedor1.setName("nome fornecedor 1");
			fornecedor1.setEmail("email_fornecedor1@email.com");
			fornecedor1.setComment("lorem ipsum");
			fornecedor1.setCnpj("00.000/0000-00");
			add(fornecedor1);
			System.out.println(fornecedor1);
			System.out.println("Fornecedor 1 adicionado com sucesso");

			Fornecedor fornecedor2 = new Fornecedor();
			fornecedor2.setName("nome fornecedor 2");
			fornecedor2.setEmail("email_fornecedor2@email.com");
			fornecedor2.setComment("lorem ipsum lorem ipsum");
			fornecedor2.setCnpj("99.999/9999-99");
			add(fornecedor2);
			System.out.println("Fornecedor 2 adicionado com sucesso");
		}

		System.out.println("População finalizada.");
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fornecedor> list() {
		// retorna a lista de fornecedores
		System.out.print("Retorna a lista de fornecedores");

		return fornecedores;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Fornecedor add(Fornecedor fornecedor) {
		// cria um novo fornecedor
		System.out.println("Cria um novo fornecedor");

		Fornecedor result = null;

		if (fornecedor.getName() == null || fornecedor.getName().trim().equals("")) {
			throw new WebApplicationException(
					Response.status(Response.Status.BAD_REQUEST).entity("O nome do fornecedor é obrigatório").build());
		}

		fornecedores.add(fornecedor);
		fornecedor.setId(fornecedores.indexOf(fornecedor) + 1);

		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{fornecedorId}")
	public Fornecedor getFornecedor(@PathParam("fornecedorId") int id) {
		// retorna um fornecedor pelo ID
		System.out.println("Retorna um fornecedor pelo ID");

		Fornecedor result = null;
		// ...
		return result;
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(@PathParam("id") int id, Fornecedor fornecedor) {
		// atualiza um fornecedor
		System.out.println("Atualiza um fornecedor");

		// ...
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		// remove um fornecedor
		System.out.println("Remove um fornecedor");

		// ...
	}
	
	@GET
	@Path("/search/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fornecedor> searchByName(@PathParam("name") String name) {
		// retorna uma lista de fornecedores filtrados pelo nome
		System.out.println("Retorna uma lista de fornecedores filtrados pelo nome");

		List<Fornecedor> result = new ArrayList<Fornecedor>();
		// ...
		return result;
	}

	@GET
	@Path("teste")
	public void teste() {
		System.out.println("entrei no método teste");
	}
}
