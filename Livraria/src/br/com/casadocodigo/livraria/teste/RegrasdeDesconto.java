package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasdeDesconto {

	public static void main(String[] args) {

		Autor autor = new Autor();

		autor.setNome("Giovane Oliveira");

		Livro livro = new LivroFisico(autor);

		livro.setValor(59.90);

		if (!livro.aplicaDescontoDe(0.3)) {
			System.out
					.println("Desculpe!(-_-) Desconto do Livros físicos não pode ser maior que 30%.");

		} else {
			System.out.println("O Valor do livro:" + livro.getValor());

		}
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);

		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out
					.println("Desculpe(-_-)!Desconto para ebooks não pode ser maior que 15%.");

		} else {
			System.out.println("Valor do ebook com desconto é:"
					+ ebook.getValor());

		}

	}

}
