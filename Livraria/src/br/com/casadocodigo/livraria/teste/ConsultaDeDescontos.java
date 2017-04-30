package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {

		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

		Double desconto = gerenciador.validaCupom("CUP75");

		if (desconto != null) {
			System.out.println("Cupom de desconto v�lido!");
			System.out.println("Valor" + desconto);
		} else {
			System.out.println("Cupom inv�lido! ");
		}

	}

}
