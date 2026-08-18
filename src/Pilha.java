import java.util.Stack;
// Pilha (STACK) segue a regra LIFO -> Last In, First Out
public class Pilha {
    // .push() -> Adiciona elemento no topo
    // .pop() -> Remove elemento do topo
    // .peek() -> Consulta o topo sem remover
    // .isEmpty() -> Verifica se está vazia

    Stack<String> pilha  = new Stack<>();

    public void adicionarNaPilha(String documento) {
        pilha.push(documento);
    }

    public void mostrarPilha(){
        System.out.println(pilha);
    }

    public void removerDaPilha(){
        System.out.println("Removendo: " + pilha.pop());
    }
}