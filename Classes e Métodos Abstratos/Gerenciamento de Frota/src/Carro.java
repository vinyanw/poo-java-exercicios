public class Carro extends Veiculo implements Alugavel{
    private int numeroPortas;
    private double taxaDiaria;

    public Carro(String tipo, String placa, String marca, String modelo, int ano, int numeroPortas) {
        super(tipo, placa, marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.taxaDiaria = 120.0;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double getTaxaDiaria() {
        return taxaDiaria;
    }

    @Override
    public void setTaxaDiaria(double taxaDiaria) {
        this.taxaDiaria = taxaDiaria;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return dias * taxaDiaria;
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro: " + getTipo());
        System.out.println("placa: " + getPlaca());
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("ano: " + getAno());
        System.out.println("Número de portas: " +  getNumeroPortas());
    }
}
