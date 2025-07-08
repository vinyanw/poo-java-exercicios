import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros numero = new Numeros();
        boolean divisaoTeste = false;

        while(!divisaoTeste) {
            try {
                numero.lerNumeros();
                float resultado = numero.divisaoDosNumeros();
                System.out.println("Resultado da divisão: " + resultado);
                divisaoTeste = true;
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("ERRO: arithmeticException: %s\n", arithmeticException.getMessage());
                System.out.println("Divisão por zero é impossível, refaça");
            }
        }
    }
}