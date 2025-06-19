public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        frota.cadastrarVeiculo(new Carro("Carro", "POO-1111", "Wolkswagen", "Civic", 2005, 4));
        frota.cadastrarVeiculo(new Caminhão("Caminhão", "BTS-3333", "Mercedes", "Uno", 2008, 32000.0, 5));
        frota.cadastrarVeiculo(new Van("Van", "UAU-999", "Ferrari", "Astra", 2020, 12));

        frota.listarVeiculosCadastrados();
        frota.listarVeiculosAlugaveis(3);
    }
}