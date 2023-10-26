package com.mgsystems.listaligada;

public class TesteListaLigadaString {

	public static void main(String[] args) {
		
		ListaLigada<Integer> lista= new ListaLigada<Integer>();
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(5);
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Último: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo 5\n");
		lista.remover(5);
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Último: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo 1\n");
		lista.remover(1);
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Último: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo 3\n");
		lista.remover(3);
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Último: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nAdicionando 6\n");
		lista.adicionar(6);
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Último: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nRemovendo Todos\n");
		lista.remover(2);
		lista.remover(4);
		lista.remover(6);
		
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("\nAdicionando 7\n");
		lista.adicionar(7);
		
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Último: "+lista.getUltimo().getValor());
		System.out.println("Tamanho: "+lista.getTamanho());
		
		
		for(int i=0; i< lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		

	}

}
