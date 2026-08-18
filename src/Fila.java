import java.util.LinkedList;
import java.util.Queue;

    // Fila (QUEUE) segue a regra FIFO -> First In, First Out
public class Fila {
    // .offer() -> Adiciona o elemento no final da lista
    // .poll() -> Remove o elemento do início da lista
    // .peek() -> Consulta o elemento do início sem removê-lo
    // .isEmpty() -> Verifica se a lista está vazia

    private Queue<String> fila = new LinkedList<>();

    public void adicionarDocumento(String documento){
        fila.add(documento);
    }

    public void mostrarLista(){
        System.out.println(fila);
    }

    public void imprimirDocumentos(){
        while(!fila.isEmpty()){
            System.out.println("Imprimindo: " + fila.poll());
        }
    }
}