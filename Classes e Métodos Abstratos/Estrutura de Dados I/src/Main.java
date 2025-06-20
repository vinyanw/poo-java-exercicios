public class Main {
    public static void main(String[] args) {
        testarEstrutura(new Pilha(5), "Pilha");
        testarEstrutura(new Fila(5), "Fila");
        testarEstrutura(new FilaPrioridade(5), "Fila de Prioridade");
    }

    public static void testarEstrutura(ED estrutura, String nome) {
        System.out.println("\n=== Testando " + nome + " ===");

        //adicionando na pilha, fila e fila prioridade
        estrutura.adicionar(9);
        estrutura.adicionar(8);
        estrutura.adicionar(7);
        estrutura.adicionar(6);
        estrutura.adicionar(5);

        System.out.println("\nOrdem de remoção:");
        int elemento;
        while ((elemento = estrutura.remover()) != -1) {
            System.out.println("Removido: " + elemento);
        }
    }
}