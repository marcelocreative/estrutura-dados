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
	
	private void adicionarPrimeiroElemento(T valor) {
		
		Elemento<T> novoElemento = criarElemento(valor);
		
		novoElemento.setProximo(ultimo);
		primeiro = novoElemento;
		ultimo = novoElemento;
		
	}
	
	public void adicionarPorPosicao(int posicao, T valor) {
		
		Elemento<T> novoElemento = criarElemento(valor);
		Elemento<T> elementoAux = primeiro;
		
		if(posicao == 0) {
			adicionarNoComeco(valor);
		}
		else if(posicao == tamanho) {
			adicionarNoFinal(valor);
		}
		else if(posicao < tamanho) {
			
			for(int i=0; i < posicao- 1; i++) {
				elementoAux = elementoAux.getProximo();
			}
			
			novoElemento.setProximo(elementoAux.getProximo());
			elementoAux.setProximo(novoElemento);
			elementoAux = novoElemento;
			
			tamanho ++;
			
		}
		else {
			
			throw new IndexOutOfBoundsException("Posi��o inv�lida");
			
		}
		
		
	}
	
	public void adicionarNoComeco(T valor) {
		
		Elemento<T> novoElemento= criarElemento(valor);
		
		if(primeiro == null && ultimo==null) {
			adicionarPrimeiroElemento(valor);
		}
		else {
			novoElemento.setProximo(primeiro);
			primeiro = novoElemento;
		}
		
		tamanho++;
		
	}
	
	public void adicionarNoFinal(T valor) {
		
		Elemento<T> novoElemento= criarElemento(valor);
		
		if(primeiro == null && ultimo==null) {
			adicionarPrimeiroElemento(valor);
		}
		
		else {
			ultimo.setProximo(novoElemento);
			ultimo= novoElemento;
			
		}
		
		tamanho++;
	}
	

	
	public Elemento<T> remover(T valor) {
		
		Elemento<T> anterior = null;
		Elemento<T> atual = primeiro;
		Elemento<T> elementoRetorno= null;
		
		for(int i=0; i< tamanho; i++) {
			
			if(atual.getValor().equals(valor)) {
				elementoRetorno = atual;
				
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
		
		return elementoRetorno;
		
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
	
	public IteratorListaLigada<T> getIteraor(){
		
		return new IteratorListaLigada<T>(primeiro);
		
	}
	
	private Elemento<T> criarElemento(T valor){
	
		return new Elemento<T>(valor);
		
	}
	
	public String imprimeLista(IteratorListaLigada<T> iterator) {
		
		StringBuilder builder= new StringBuilder();
		
		if(primeiro != null) {
			
			builder.append("["+primeiro.getValor());
				
			while(iterator.temProximo()) {
				builder.append(","+iterator.getProximo().getValor());
			}
			
			builder.append("]");
			
		}
		else {
			builder.append("[]");
		}
		
		return builder.toString();
	}
	
}
