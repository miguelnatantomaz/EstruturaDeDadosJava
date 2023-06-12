package Recursividade;

public class Fibonacci {
	int prev;
	int curr;
	int[] vetor;
	int positionVetor = 0;
	
	public Fibonacci(int num) {
		this.prev = 0;
		this.curr = 1;
		this.vetor = new int[num + 1];
	}
	
	public void calculateFibonacci(int num) {	
		this.vetor[positionVetor] = this.prev;
		this.positionVetor += 1;
		
		if(num == 0) {
			for(int i = 0; i < this.vetor.length; i++) {
				System.out.print(" | " + this.vetor[i] + " | ");
			}
			
			return;
		}
		
		int newValue = this.prev + this.curr;
		this.prev = this.curr;
		this.curr = newValue;
		
		
		this.calculateFibonacci(num - 1);
	}
	
	public static void main(String[] args) {
		int numFibo = 3;
		
		Fibonacci f = new Fibonacci(numFibo);
		
		f.calculateFibonacci(numFibo);
	}

}
