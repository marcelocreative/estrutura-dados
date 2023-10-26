package com.mgsystems.listaligada;

public class ListaLigada<T> {

	private Elemento<T> primeiro;
	private Elemento<T> ultimo;
	private int tamanho;
	
	public ListaLigada() {
		this.tamanho = 0;
	}

	public Elemento<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento<T> primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento<T> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(T valor) {
		
		Elemento<T> novoElemento= new Elemento<T>(valor);
		
		if(primeiro == null && ultimo==null) {
			primeiro = novoElemento;
			ultimo = novoElemento;
		}
		else {
			ultimo.setProximo(novoElemento);
			ultimo= novoElemento;
		}
		
		tamanho++;
		
	}
	
	public void remover(T valor) {
		
		Elemento<T> anterior = null;
		Elemento<T> atual = primeiro;
		
		for(int i=0; i< tamanho; i++) {
			
			if(atual.getValor().equals(valor)) {
				
				
				if(tamanho == 1) {
					primeiro = null;
					ultimo = null;
				}
				
				else if(atual == primeiro) {
					
					primeiro = atual.getProximo();
					atual.setProximo(null);
					
				}
				
				else if(atual == ultimo) {
					ultimo = anterior;
					anterior.setProximo(null);
				}
				else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				
				tamanho--;
				break;
				
			}
			
			anterior = atual;
			atual= atual.getProximo();
			
		}
		
	}
	
	public Elemento<T> get(int posicao) {
		
		Elemento<T> atual = primeiro;
		
		for(int i=0; i < posicao; i++) {
			
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			
		}
		
		return atual;
		
	}
	
}
