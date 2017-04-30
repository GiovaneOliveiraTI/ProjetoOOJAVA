package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.livraria.Autor;

public class Ebook extends Livro implements Promocional {

	public Ebook(Autor autor) {
		super(autor);
	}

	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;

	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;

		// Pode ser assim também!
		/*
		 * double desconto = this.getValor() * porcentagem;
		 * this.setValor(this.getValor() - desconto );
		 */

	}

	@Override
	public int compareTo(Produto outro) {
		if (this.getValor() < outro.getValor()) {

			return -1;
		}
		if (this.getValor() > outro.getValor()) {
			return 1;
		}

		return 0;
	}

}
