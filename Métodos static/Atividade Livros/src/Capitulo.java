public class Capitulo {
    private static int contadorCapitulos = 0;

    private int numero;
    private String titulo;
    private int quantidadePaginas;

    public Capitulo(String titulo, int quantidadePaginas) {
        this.numero = ++contadorCapitulos;
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }
}
