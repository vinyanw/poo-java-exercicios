public class FilaPrioridade extends Fila{
    public FilaPrioridade(int capacidade) {
        super(capacidade);
    }

    @Override
    public void adicionar(int elemento) {
        if (tamanho == capacidade) {
            System.out.println("Fila de prioridade tá cheia");
            return;
        }
        if (tamanho == 0) {
            vetorInteiros[0] = elemento;
            fim = 0;
        }
        else {
            int i;
            for (i = tamanho - 1; i >= 0; i--) {
                if (vetorInteiros[i] > elemento) {
                    vetorInteiros[i + 1] = vetorInteiros[i];
                } else {
                    break;
                }
            }
            vetorInteiros[i + 1] = elemento;
            fim = (fim + 1) % capacidade;
        }

        tamanho++;
        System.out.println("Elemento " + elemento + " adicionado com sucesso à fila com prioridade");
    }
}
