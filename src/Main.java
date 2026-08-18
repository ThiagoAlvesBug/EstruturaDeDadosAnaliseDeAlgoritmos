import java.util.Arrays;

public class Main {

    public static void main(String [] args) {

        /*__________DIVISÃO__________*/
        var distancia = "-".repeat(50);

        /*__________RECURSIVIDADE__________*/
        int fatorial = 10;
        int resultado = Recursividade.fatorial(fatorial);
        System.out.println("Fatorial de 10: ");
        System.out.println(resultado);
        System.out.println(distancia);

        /*__________BUSCA BINÁRIA__________*/
        // ___Posição____0___1___2___3___4___5___6___7___8___9
        int[] numeros = {01, 12, 25, 32, 46, 56, 68, 74, 81, 99};
        int alvo = 46;
        int posicao = BuscaBinaria.buscar(numeros, alvo);
        System.out.println("Valor a ser buscado: " + alvo);
        System.out.println(Arrays.toString(numeros));
        System.out.println("Alvo encontrado na posição: " + posicao);
        System.out.println(distancia);

        /*__________BUBBLE SORT__________*/
        int[] numerosDesordenados = {01, 32, 44, 15, 87, 26, 76, 99, 53, 68};
        System.out.println("Fora de ordem: ");
        System.out.println(Arrays.toString(numerosDesordenados));
        System.out.println("Ordenado: ");
        int[] numerosOrdenados = BubbleSort.ordenar(numerosDesordenados);
        System.out.println(Arrays.toString(numerosOrdenados));
        System.out.println(distancia);

        /*__________FILA (Queue)__________*/
        Fila impressora = new Fila();
        System.out.print("Lista atual: ");
        impressora.mostrarLista();
        System.out.print("Adicionando: ");
        impressora.adicionarDocumento("A");
        impressora.adicionarDocumento("B");
        impressora.adicionarDocumento("C");
        impressora.mostrarLista();
        impressora.imprimirDocumentos();
        System.out.print("Itens Restantes: ");
        impressora.mostrarLista();
        System.out.println(distancia);

        /*__________PILHA (Stack)__________*/
        Pilha pilha = new Pilha();
        pilha.mostrarPilha();
        pilha.adicionarNaPilha("Documento A");
        pilha.adicionarNaPilha("Documento B");
        pilha.adicionarNaPilha("Documento C");
        pilha.mostrarPilha();
        pilha.removerDaPilha();
        pilha.mostrarPilha();
        System.out.println(distancia);
    }
}