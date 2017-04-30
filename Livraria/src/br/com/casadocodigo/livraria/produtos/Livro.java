package br.com.casadocodigo.livraria.produtos;

import exception.AutorNuloException;
import br.com.casadocodigo.livraria.livraria.Autor;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;

	public boolean isImpresso() {
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public Livro(Autor autor) {
		if (autor == null) {
			throw new AutorNuloException(
					"O autor do Livro não pode ser nulo!");

		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	boolean TemAutor() {
		return this.autor != null;

	}

	public void MostrarDetalhes() {
		System.out.println("__");
		String mensagem = "Detalhes do livro";
		System.out.println(mensagem);
		System.out.println("livro: " + nome);
		System.out.println("valor: " + valor);
		System.out.println("Descriçao: " + descricao);
		System.out.println("ISBN: " + isbn);
		System.out.println("Impresso" + impresso);
		System.out.println("__");

		if (this.TemAutor()) {
			autor.MostrarDetalhesAutor();
		} else
			System.out.println("Informações de autor não cadastradas.");
	}

	public abstract boolean aplicaDescontoDe(double porcentagem);

	public void adicionaValor(double valor) {
		this.valor = valor;

	}

	public double retornavalor() {
		return this.valor;

	}

	public int compareTo(Produto outro) {
	return (int) (this.getValor() - outro.getValor());
	}

}
