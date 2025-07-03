import java.util.ArrayList;

public class Livro {
    private String isbn;
    private String titulo;
    private int quantidadeCapitulos;
    private ArrayList<Capitulo> capitulos;

    public Livro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.quantidadeCapitulos = 0;
        this.capitulos = new ArrayList<>();
    }

    public void addCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
        quantidadeCapitulos++;
    }

    public void exibirRelatorio() {
        System.out.println("=== RELATÓRIO DO LIVRO ===");
        System.out.println("Editora: " + Constantes.EDITORA);
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Capítulos: ");

        int totalPaginas = 0;
        for (int i = 0; i < capitulos.size(); i++) {
            Capitulo cap = capitulos.get(i);
            System.out.println("Capítulo " + cap.getNumero() + " - " + cap.getTitulo()
                    + " (" + cap.getQuantidadePaginas() + " páginas)");
            totalPaginas += cap.getQuantidadePaginas();
        }

        System.out.println("Total de páginas: " + totalPaginas);
    }
}
