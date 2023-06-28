public class teste {

  public static int recursiva(int valor)

{

    if(valor == 1)

    {
      return valor;

    }

    else

    {
        return 2 + recursiva(valor - 1);

    }

}
  
  public static void main(String[] args) {
    // int[][] matriz = {{1,2, 3}, {4,5,6}, {7,8,9}};
    
    // int i = 0, j = 0;



    // for(i = 1; i < 2; i++){

    //   for(j = 1; j < 2; j++){

    //       System.out.print(matriz[j][i]);

    //   }

    // }
          System.out.print("caraio final : " + recursiva(6) +  "\n");
}
}
