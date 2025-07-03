public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("111-1111-1111-11", "Senhor dos Anéis");

        livro.addCapitulo(new Capitulo("A sociedade do anel", 33));
        livro.addCapitulo(new Capitulo("As duas torres", 44));
        livro.addCapitulo(new Capitulo("O retorno do rei", 55));

        livro.exibirRelatorio();
    }
}
