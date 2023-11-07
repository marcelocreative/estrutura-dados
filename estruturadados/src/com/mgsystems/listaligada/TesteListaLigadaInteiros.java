package com.mgsystems.listaligada;

public class TesteListaLigadaInteiros {

	public static void main(String[] args) {
		
		ListaLigada<Integer> lista= new ListaLigada<Integer>();
		
	
		
		lista.adicionarNoFinal(3);
		lista.adicionarNoFinal(2);
		lista.adicionarNoFinal(1);
		lista.adicionarPorPosicao(0, 1);
		lista.adicionarPorPosicao(1, 2);
		lista.adicionarNoComeco(0);
		
		if(lista.getTamanho()>0) {
			System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
			System.out.println("�ltimo: "+lista.getUltimo().getValor());
			System.out.println("Tamanho: "+lista.getTamanho());
			
			IteratorListaLigada<Integer> iterator = lista.getIteraor();
			
			System.out.println(lista.imprimeLista(iterator));
		}
		else {
			System.out.println("N�o h� itens a serem exibidos");
		}
		
	}

}
