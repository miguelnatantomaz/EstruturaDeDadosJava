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
		
		l.inserePrimeiro(0);
		
		l.insereUltimo(250);
		
		l.mostrar();
		
	}

}
