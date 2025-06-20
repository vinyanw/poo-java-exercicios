public class Pilha extends ED{
    private int[] vetorInteiros;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade){
        this.vetorInteiros = new int[capacidade];
        this.topo = -1;
        this.capacidade = capacidade;
    }


    @Override
    public void adicionar(int elemento) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia. Não é possível adicionar " + elemento);
            return;
        }
        vetorInteiros[++topo] = elemento;
        System.out.println("Elemento " + elemento + " adicionado com sucesso à pilha");
    }

    @Override
    public int remover() {
        if (topo == -1) {
            System.out.println("Pilha vazia. Retornando -1");
            return -1;
        }
        int elementoRemovido = vetorInteiros[topo--];
        System.out.println("Elemento " + elementoRemovido + " removido com sucesso da pilha");
        return elementoRemovido;
    }
}
