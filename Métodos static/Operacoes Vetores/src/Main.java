public class Main {
    public static void main(String[] args) {
        float[] numeros = {10.5f, 20.0f, 30.5f, 40.0f};
        int A =     10;
        int B = 20;

        System.out.println("Média: " + Utilidade.media(numeros));
        System.out.println("Soma dos elementos: " + Utilidade.soma(numeros));
        System.out.println("Maior numero: " + Utilidade.maior(numeros));
        System.out.println("Menor numero: " + Utilidade.menor(numeros));
        System.out.println("Entre A e B, o maior é: " + Utilidade.max(A, B));
        System.out.println("Desvio padrão: " + Utilidade.desvioPadrao(numeros));
    }
}