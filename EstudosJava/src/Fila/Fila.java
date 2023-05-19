package Fila;

public class Fila {
	private int primeiro;
	private int ultimo;
	private int[] dados;
			
	public Fila() {
		this.primeiro = -1;
		this.ultimo = -1;
		this.dados = new int[10];
	}
	
	public void adicionar(int valor) {
		if(this.ultimo < this.dados.length -1) {
			if(this.primeiro == -1) {
				this.primeiro = 0;
			}
			
			this.ultimo++;
			this.dados[this.ultimo] = valor;
			
		}
		
	}
	
	public void remove() {
		if(filaVazia()) return;
		
		this.dados[this.primeiro] = 0;
		this.primeiro++;
	}
	
	public boolean filaVazia() {
		if(this.primeiro > -1) return false;
		
		System.out.println("Fila vazia!");
		
		return true;
	}
	
	public boolean filaCheia() {
		if(this.ultimo < this.dados.length - 1) return true;
		
		System.out.println("FILA CHEIA BROTHER");
	
		return false;
	}
	
	public void mostrarFila() {
		
		for(int i = 0; i < this.ultimo; i++) {
			System.out.println("Dado -> " + this.dados[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		Fila f = new Fila();
		f.adicionar(1);
		f.adicionar(2);
		f.adicionar(3);
		f.adicionar(4);
		f.adicionar(5);
		f.adicionar(6);
		
		f.mostrarFila();
		
		f.remove();
		
		System.out.println("**********REMOÇÃO**********");
		
		f.mostrarFila();
		
		f.remove();
		
		System.out.println("**********REMOÇÃO**********");
		
		f.mostrarFila();
		
	}

}
