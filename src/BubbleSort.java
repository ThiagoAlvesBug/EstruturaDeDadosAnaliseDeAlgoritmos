public class BubbleSort {

    public static int[] ordenar(int[] numeros){
        for(int i = 0; i < numeros.length-1; i++){
            for(int j = 0; j < numeros.length-1-i; j++){
                if(numeros[j]>numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
        return numeros;
    }

    public static void imprimir(int[] numeros){
        for(int n: numeros){
            System.out.println(n + ", ");
        }
    }
}