public class Van extends Veiculo implements Alugavel{
    private int quantidadePassageiros;
    private double taxaDiaria;

    public Van(String tipo, String placa, String marca, String modelo, int ano, int quantidadePassageiros) {
        super(tipo, placa, marca, modelo, ano);
        this.quantidadePassageiros = quantidadePassageiros;
        this.taxaDiaria = 180.0;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
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
    public void exibirDados(){
        System.out.println("Van: " + getTipo());
        System.out.println("placa: " + getPlaca());
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("ano: " + getAno());
        System.out.println("quantidade de passageiros: " + getQuantidadePassageiros());
    }
}
