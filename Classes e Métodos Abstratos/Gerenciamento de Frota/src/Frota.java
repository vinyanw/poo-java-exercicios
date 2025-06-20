import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculosCadastrados() {
        System.out.println("=== VEÍCULOS CADASTRADOS ===");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
            System.out.println();
        }
    }

    public void listarVeiculosAlugaveis(int dias) {
        System.out.println("\n=== VEÍCULOS ALUGÁVEIS (" + dias + " dias) ===");
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Alugavel) {
                Alugavel alugavel = (Alugavel) veiculo;
                System.out.printf("%s %s (%d) - Valor para %d dias: R$ %.1f%n",
                        veiculo.getMarca(),
                        veiculo.getModelo(),
                        veiculo.getAno(),
                        dias,
                        alugavel.calcularValorAluguel(dias));
            }
        }
    }
}