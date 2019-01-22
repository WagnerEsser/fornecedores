package br.com.neomind;

//{"id": 1, "name": "fornec lorimospm", "email": "fornec@loripsom", "comment": "loreipsum", "cnpj": "00.000/0000-00"}

public class Fornecedor {
	private int id;
	private String name;
	private String email;
	private String comment;
	private String cnpj;
	
	// ---------- getters and setters ---------- //

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	// ---------- equals e hasCode ---------- //

	@Override
	public int hashCode() {
		return this.id;
	}


	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj instanceof Fornecedor) {
			Fornecedor fornecedor = (Fornecedor) obj;
			result = fornecedor.getId() == this.getId();
		}

		return result;
	}

}
