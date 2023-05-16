package VetoresMatriz;

public class VetoresMatriz {

	public static void main(String[] args) {
		//	Declarando uma matriz
		int[][] novaMatriz;
		int[] vetor = {10,10,5,5};
		int total = 0;
		
		Double[] vetorDouble = {10.0,10.0,5.5,5.0};
		Double totalDouble = 0.0;
		
		
		
		for(int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		
		for(int i = 0; i < vetorDouble.length; i++) {
			totalDouble += vetorDouble[i];
		}
		
		System.out.println("Media: " + (total/vetor.length));
		System.out.println("Media double: " + (totalDouble/vetorDouble.length));

		int[][] matriz = {{10, 10}, {5,5},{1,1}};
		
		Double totalMatriz = 0.0;
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				totalMatriz += matriz[i][j];
				contador++;
			}
		}
		
		System.out.println("Media double Matriz: " + (totalMatriz/contador));
		
		// Moda do vetor
		int[] modaVetor = {1, 5, 2, 3, 1, 1, 3, 3, 1};
		int numeroVezes = 0;
		boolean verificaModa = false;
		int numeroVezesAnterior = 0;
		int moda = 0;
		for(int i = 0; i < modaVetor.length; i++) {
		    numeroVezes = 1;
		    for(int j = i+1; j < modaVetor.length; j++) {
		        if(modaVetor[i] == modaVetor[j]) {
		            numeroVezes++;
		        }
		    }
		    if(numeroVezes > numeroVezesAnterior) {
		        moda = modaVetor[i];
		        numeroVezesAnterior = numeroVezes;
		        verificaModa = true;
		    } else if (numeroVezes == numeroVezesAnterior) {
		        verificaModa = false;
		    }
		}
		if(verificaModa) {
		    System.out.println(moda);
		} else {
		    System.out.println("Não existe moda");
		}
		
	}

}
