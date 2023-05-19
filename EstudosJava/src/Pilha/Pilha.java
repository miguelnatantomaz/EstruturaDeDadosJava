package Pilha;

public class Pilha {
	//É importante NÃO misturar dados e estrutura de dados na implementação! 
	//Um dado é uma informação armazenada e estrutura de dados é quem administra os dados.
	
	private int topo;
	private int[] dados;
	
	public Pilha() {
		this.dados = new int[10];
		this.topo = -1;
	}
	
	public void empilhar(int valor) {
		if(pilhaCheia()) {
			this.topo++;
			this.dados[this.topo] = valor;
		}
	}
	
	public boolean pilhaVazia() {
		if(this.topo > -1) return false;
		
		System.out.println("Pilha vazia!");
		
		return true;
	}
	
	public boolean pilhaCheia() {
		if(this.topo < this.dados.length - 1) return true;
		
		System.out.println("PILHA CHEIA BROTHER");
	
		return false;
	}
	
	public void desempilhar() {
		if(pilhaVazia()) return;
		
		this.dados[this.topo--] = 0;
	}
	
	public void mostraPilha() {
		for(int i = this.dados.length - 1; i >= 0; i--) {
			if(this.dados[i] != 0) {
				System.out.println("| " + this.dados[i] + " |");				
			}
		}
	}
	

	public static void main(String[] args) throws Exception {
		Pilha pilha = new Pilha();
		pilha.empilhar(10);
		pilha.empilhar(9);
		pilha.empilhar(8);
		pilha.empilhar(7);
		pilha.empilhar(6);
		pilha.empilhar(5);
		pilha.empilhar(4);
		pilha.empilhar(3);
		pilha.empilhar(2);
		pilha.empilhar(1);
		pilha.empilhar(0);
		pilha.mostraPilha();
		pilha.desempilhar();
		System.out.println("***** Removido um elemente *****");
		pilha.mostraPilha();
		
		Pilha pilhaVazia = new Pilha();
		pilhaVazia.desempilhar();
		

	}

}
