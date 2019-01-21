package br.com.neomind;

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

import br.com.neomind.Fornecedor;

// {"id": 1, "name": "fornec lorimospm", "email": "fornec@loripsom", "comment": "loreipsum", "cnpj": "00.000/0000-00"}

@Path("/")
public class FornecedoresService {
	private static List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public FornecedoresService() {
		if (fornecedores.isEmpty()) {
			// popular a lista de fornecedores para fins de testes
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fornecedor> list() {
		// retorna a lista de fornecedores
		return fornecedores;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{fornecedorId}")
	public Fornecedor getFornecedor(@PathParam("fornecedorId") int id) {
		// retorna um fornecedor pelo ID
		Fornecedor result = null;
		// ...
		return result;
	}

	@GET
	@Path("/search/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fornecedor> searchByName(@PathParam("name") String name) {
		// retorna uma lista de fornecedores filtrados pelo nome
		List<Fornecedor> result = new ArrayList<Fornecedor>();
		// ...
		return result;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Fornecedor add(Fornecedor fornecedor) {
		// cria um novo fornecedor
		Fornecedor result = null;
		// ...
		return result;
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(@PathParam("id") int id, Fornecedor fornecedor) {
		// atualiza um fornecedor
		// ...
	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") int id) {
		// remove um fornecedor
		// ...
	}

}