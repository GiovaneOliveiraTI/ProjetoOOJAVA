package br.com.casadocodigo.livraria.livraria;

import java.util.HashMap;
import java.util.Map;



public class GerenciadorDeCupons {
	
	private Map<String,Double> cupons;
	
	public GerenciadorDeCupons(){
		
		this.cupons = new HashMap<>();
		
		
		
		cupons.put("CUP74",10.00);
		cupons.put("CUP158",12.00);
		cupons.put("CUP14",13.16);
		cupons.put("CUP52",14.00);
	}
	
	public Double validaCupom(String cupom){
		return this.cupons.get(cupom);
		
	}

}
