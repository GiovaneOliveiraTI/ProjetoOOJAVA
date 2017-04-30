package br.com.casadocodigo.livraria.teste;

import java.util.HashSet;

public class TesteHashSet {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Não há repetições em conjunto");
		set.add("Não há repetições em conjunto");
		set.add("Não há repetições em conjunto");
		set.add("Não há repetições em conjunto");
		set.add("Não há repetições em conjunto");
		System.out.println(set.size());
		
	}
	
	
	

}
