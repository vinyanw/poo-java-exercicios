public class Utilidade {
    public static float media(float[] vet) {
        float soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma = soma + vet[i];
        }
        return (soma / vet.length);
    }

    public static float soma(float[] vet) {
        float somaTotal = 0;
        for (int i = 0; i < vet.length; i++) {
            somaTotal = somaTotal + vet[i];
        }
        return somaTotal;
    }

    public static float maior(float[] vet) {
        float maior = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static float menor(float[] vet) {
        float menor  = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public static int max (int A, int B) {
        if (A > B) {
            return A;
        } else {
            return B;
        }
    }

    public static float desvioPadrao(float[] vet) {
        int n = vet.length;
        float soma = 0;
        float somaQuadrados = 0;

        for (int i = 0; i < n; i++) {
            soma += vet[i];
            somaQuadrados += vet[i] * vet[i];
        }

        float media = soma / n;
        float variancia = (somaQuadrados / n) - (media * media);

        return (float) Math.sqrt(variancia);
    }
}
