package br.com.casadocodigo.livraria.teste;

import java.util.HashSet;

public class TesteHashSet {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("N�o h� repeti��es em conjunto");
		set.add("N�o h� repeti��es em conjunto");
		set.add("N�o h� repeti��es em conjunto");
		set.add("N�o h� repeti��es em conjunto");
		set.add("N�o h� repeti��es em conjunto");
		System.out.println(set.size());
		
	}
	
	
	

}
