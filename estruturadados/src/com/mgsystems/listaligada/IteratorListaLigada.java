package com.mgsystems.listaligada;

public class IteratorListaLigada<T> {

	private Elemento<T> elemento; 
	
	public IteratorListaLigada(Elemento<T> elemento) {
		
		this.elemento = elemento;
		
	}
	
	public boolean temProximo() {
		
		if(elemento.getProximo() == null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public Elemento<T> getProximo(){
		
		elemento= elemento.getProximo();
		
		return elemento;
	}
}
