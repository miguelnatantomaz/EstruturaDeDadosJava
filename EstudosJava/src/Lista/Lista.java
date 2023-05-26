package Lista;

public class Lista {
	//Estática: utiliza vetores;  Pode somente acessa uma posição com a referencia na posicao anterior
	//Dinâmica: utiliza ponteiros (referências); Pode acessar qualquer posição do array
	
	//Estática: Na representação em array o acesso a um elemento consiste em calcular o endereço a partir de um endereço base e do índice do elemento na array.
	//Dinâmica: Dada a referência de um elemento, o elemento é acessado diretamente sem a necessidade de cálculos de endereço.
	private No primeiro;
	
	public Lista() {
		primeiro = null;
	}
	
	public boolean vazio() {
		return primeiro == null;
	}
	
	public void inserePrimeiro(int info) {
		No auxiliar = new No();
		auxiliar.setInfo(info);
		auxiliar.setProx(primeiro);
		
		primeiro = auxiliar;
	}
	
	public void insereUltimo(int info) {
		if(this.vazio()) {
			inserePrimeiro(info);
			return;
		}
		
		No auxiliar = primeiro;
		
		while(auxiliar != null && auxiliar.getProx() != null) {
			auxiliar = auxiliar.getProx();
		}
		
		No novo = new No();
		novo.setInfo(info);
		auxiliar.setProx(novo);
	}
	
	public No getPrimeiro() {
		return primeiro.getProx().getProx();
	}
	
	public void removePrimeiro() {
		if(this.vazio()) return;
		
		No auxiliar = primeiro;
		
		auxiliar = auxiliar.getProx();
		auxiliar.setInfo(auxiliar.getInfo());
		
		primeiro = auxiliar;
	}
	
	public void removeUltimo() {
		if(this.vazio()) return;
		
		No penultimo = primeiro;
		No auxiliar = primeiro;
		
		while(auxiliar != null && auxiliar.getProx() != null) {
			penultimo = auxiliar;
			auxiliar = auxiliar.getProx();
		}
		
		penultimo.setProx(null);
	}
	
	public void insereDepois(No no, int info) {
		if(this.vazio()) return;
		
		if(no == null) {
			insereUltimo(info);
			return;
		}
		
		No novo = new No();	
		novo.setInfo(info);
		novo.setProx(no.getProx());
		no.setProx(novo);
	}
	
	public void remove(No no) {
		if(this.vazio() || no == null) return;
		
		if(no == primeiro) {
			removePrimeiro();
			return;
		}
		
		No auxiliar = primeiro;
		
		while(auxiliar.getProx() != no) {
			auxiliar = auxiliar.getProx();
		}
		
		No noRemovido = auxiliar.getProx();
		
		auxiliar.setProx(noRemovido.getProx());
	}
	
	public void mostrar() {
		No auxiliar = primeiro;
		while(auxiliar != null) {
			System.out.print(" | " + auxiliar.getInfo());
			auxiliar = auxiliar.getProx();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Lista l = new Lista();
		l.insereUltimo(50);
		l.insereUltimo(20);
		l.insereUltimo(30);
		
		l.mostrar();
		
		System.out.print("| \n antes inserePrimeiro \n");
		
		l.inserePrimeiro(0);
		
		l.mostrar();
		
		System.out.print("| \n antes de insereUltimo \n");
		
		l.insereUltimo(250);
		
		l.mostrar();
		
		System.out.print("| \n antes de remover primeiro \n");
		
		l.removePrimeiro();
		
		l.mostrar();
		
		System.out.print("| \n antes de remover ultimo \n");
		
		l.removeUltimo();
		
		l.mostrar();
		
		System.out.print("| \n antes de remove() primeiro \n");
		
		No primeiroNo = l.getPrimeiro();
		
		l.remove(primeiroNo);
				
		l.mostrar();
		
		System.out.print("| \n Antes do insereDepois \n");
		
		No primeiroNoAgora = l.getPrimeiro();
		
		l.insereDepois(primeiroNoAgora, 555);
		
		l.mostrar();
		
	}

}
