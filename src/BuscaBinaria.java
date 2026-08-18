public class BuscaBinaria {

    public static int buscar(int[] numeros, int alvo){
        int inicio = 0;
        int fim = numeros.length - 1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;

            if(numeros[meio] == alvo){
                return meio;
            }
            if (numeros[meio] < alvo){
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }
        return -1;
    }
}