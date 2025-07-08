import java.util.Scanner;

public class Numeros {
    private float n1;
    private float n2;

    public void lerNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1: ");
        n1 = sc.nextFloat();
        System.out.println("Número 2: ");
        n2 = sc.nextFloat();
    }

    public float divisaoDosNumeros()
    {
        if (n2 == 0) {
            throw new ArithmeticException("Divisão por zero detectada!");
        }
        return n1 / n2;
    }
}
