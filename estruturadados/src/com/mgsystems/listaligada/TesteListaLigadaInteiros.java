package com.mgsystems.listaligada;

public class TesteListaLigadaInteiros {

	public static void main(String[] args) {
		
		ListaLigada<String> lista= new ListaLigada<String>();
		lista.adicionar("RJ");
		lista.adicionar("PE");
		lista.adicionar("SE");
		lista.adicionar("AL");
		lista.adicionar("DF");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo DF\n");
		lista.remover("DF");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo RJ\n");
		lista.remover("RJ");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo SE\n");
		lista.remover("SE");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nAdicionando PB\n");
		lista.adicionar("PB");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo Todos\n");
		lista.remover("PE");
		lista.remover("PB");
		lista.remover("AL");
		
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nAdicionando SP\n");
		lista.adicionar("SP");
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("�ltimo: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}

	}

}