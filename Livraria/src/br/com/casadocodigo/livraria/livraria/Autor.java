package br.com.casadocodigo.livraria.livraria;

public class Autor {

	private String nome;
	private String cpf;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void MostrarDetalhesAutor() {
		System.out.println("__");
        System.out.println("Mostrando Detalhes de Autor");
		System.out.println("Autor: " + nome);
		System.out.println("E-mail:" + email);
		System.out.println("CPF: " + cpf);
		System.out.println("__");
	}

}
