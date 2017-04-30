package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class ResistroDeVendas {

	public static void main(String[] args) {

		Produto[] produtos = new Produto[10];

		Autor autor = new Autor();

		autor.setNome("Marcos Nunes");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("TDD test drive development ");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("TDD test drive development");
		ebook.setValor(29.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total: " + carrinho.getTotal());

		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é:" + fisico.getValor());

		}

	}

}
