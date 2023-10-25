package com.mgsystems.listaligada;

public class ListaLigada {

	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaLigada() {
		this.tamanho = 0;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String valor) {
		
		Elemento novoElemento= new Elemento(valor);
		
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
	
	public void remover(String valor) {
		
		Elemento anterior = null;
		Elemento atual = primeiro;
		
		for(int i=0; i< tamanho; i++) {
			
			if(atual.getValor().equalsIgnoreCase(valor)) {
				
				
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
	
	public Elemento get(int posicao) {
		
		Elemento atual = primeiro;
		
		for(int i=0; i < posicao; i++) {
			
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			
		}
		
		return atual;
		
	}
	
}
