package com.mgsystems.listaligada;

public class Programa {

	public static void main(String[] args) {
		
		ListaLigada lista= new ListaLigada();
		lista.adicionar("RJ");
		lista.adicionar("PE");
		lista.adicionar("SE");
		lista.adicionar("AL");
		lista.adicionar("DF");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());

	}

}