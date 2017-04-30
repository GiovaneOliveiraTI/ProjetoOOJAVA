package br.com.casadocodigo.livraria.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

	private double total;
	// Utilizando Array
	// private Produto[] Produto;
	// Usando o List ao inves de Usar o ArrayList para deixa o codigo mais
	// flexivel a mudanças!
	private List<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();

	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);

	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);

	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

}
