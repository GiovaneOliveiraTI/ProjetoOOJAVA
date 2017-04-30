package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Giovane Soares de Oliveira");
		autor.setEmail("giovanesuporte@outlook.com");
		autor.setCpf("113.987.675-54");

		Livro livro = new LivroFisico(autor);
		livro.setNome("O livro de ELI");
		livro.setDescricao("Livro com base na história de um livro sagrado.");
		livro.setValor(59.90);
		livro.setIsbn("080-898-128-898");
		livro.setImpresso ( true );

		livro.MostrarDetalhes();
		
		System.out.println("__");
		Autor autor1 = new Autor();
		autor1.setNome("José Soares silqueira");
		autor1.setEmail("josesilqueira@hotmailcom");
		autor1.setCpf("198.987.133-11");

		Livro livro1 = new LivroFisico(autor1);
		
		livro1.setNome("The Heroes");
		livro1.setDescricao("Super herois salvando a terra do perigo.");
		livro1.setValor(89.09);
		livro1.setIsbn("098-765-222-111");
		livro1.setImpresso ( false );
		livro1.MostrarDetalhes();
		
		
		
		
		Autor autor2 = new Autor();
		
		Ebook ebook = new Ebook(autor2);
		
		ebook.setNome("Dois filhos de francisco");
		ebook.setDescricao("História de Zéze di camargo e luciano");
		ebook.setImpresso(true);
		ebook.setIsbn("00.000.0000.00000.1");
		ebook.setValor(22.98);
		ebook.setWaterMark("Giovane Soares de Oliveira");
		
		
		

	}

}
