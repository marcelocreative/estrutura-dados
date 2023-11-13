package com.mgsystems.pilha;

import com.mgsystems.listaligada.Elemento;
import com.mgsystems.listaligada.IteratorListaLigada;
import com.mgsystems.listaligada.ListaLigada;

public class Pilha<T> {

	ListaLigada<T> lista;
	
	public Pilha() {
		lista= new ListaLigada<T>();
	}
	
	public Elemento<T> getElemento(){
		
		return lista.getPrimeiro();
		
	}
	
	public void adicionar(T valor) {
		
		lista.adicionarNoComeco(valor);
		
	}
	
	public Elemento<T> remover(){
		
		if(lista.getTamanho()>0) {
			return lista.removerPorValor(getElemento().getValor());
		}
		else {
			throw new RuntimeException("Pilha está vazia");
		}
		
	}
	
	public int getTamanho() {
		return lista.getTamanho();
	}
	
	public Boolean filaVazia() {
		
		if(lista.getTamanho() < 1) {
			return true;
		}
		
		return false;
	}
	
	public IteratorListaLigada<T> getIteraor(){
		
		return lista.getIteraor();
		
	}
	
	public String imprimirPilha(IteratorListaLigada<T> iterator) {
		
		return lista.imprimeLista(iterator);
		
	}
	
}
