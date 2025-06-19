public class Caminhão extends Veiculo {
    private double capacidadeCarga;
    private int numeroEixos;

    public Caminhão(String tipo, String placa, String marca, String modelo, int ano, double capacidadeCarga, int numeroEixos) {
        super(tipo, placa, marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("caminhão: " + getTipo());
        System.out.println("placa: " + getPlaca());
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("ano: " + getAno());
        System.out.println("capacidade de carga: " + getCapacidadeCarga() + " kg");
        System.out.println("numero de eixos: " + getNumeroEixos());
    }
}
