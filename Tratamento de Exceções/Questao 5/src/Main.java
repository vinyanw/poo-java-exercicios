public class Main {
    public static void verificaIdade(int idade) {
        if (idade < 0 || idade > 130) {
            throw new IllegalArgumentException("Número inválido detectado");
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }

    public static void main(String[] args) {
        int[] idades = {25, -5, 140, 60, 10, 20, 30};

        for (int i = 0; i < idades.length; i++) {
            try {
                verificaIdade(idades[i]);
            } catch (IllegalArgumentException e) {
                System.err.println("ERRO: " + e.getMessage());
            }
        }
    }
}