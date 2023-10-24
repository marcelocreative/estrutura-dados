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
		
	}
	
	public Elemento get(int posicao) {
		
		return null;
		
	}
	
}