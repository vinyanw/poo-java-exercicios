public class Fila extends ED {
    protected int[] vetorInteiros;
    protected int inicio;
    protected int fim;
    protected int tamanho;
    protected int capacidade;

    public Fila(int capacidade) {
        this.vetorInteiros = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    @Override
    public void adicionar(int elemento) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia. Não é possível adicionar " + elemento);
            return;
        }
        fim = (fim + 1) % capacidade;
        vetorInteiros[fim] = elemento;
        tamanho++;
        System.out.println("Elemento " + elemento + " adicionado à fila");
    }

    @Override
    public int remover() {
        if (tamanho == 0) {
            System.out.println("Fila vazia. Retornando -1");
            return -1;
        }
        int elemento = vetorInteiros[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        System.out.println("Elemento " + elemento + " removido da fila");
        return elemento;
    }
}
