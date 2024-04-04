public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int numero_portas;

    public Carro(String marca, String modelo, int ano, String cor, int numero_portas){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numero_portas = numero_portas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero_portas() {
        return numero_portas;
    }

    public void setNumero_portas(int numero_portas) {
        this.numero_portas = numero_portas;
    }

    public String descricao() {
        return String.format("Marca : " + marca + "\n" +
                            "Modelo : " + modelo + "\n" +
                            "Ano : " + ano + "\n" +
                            "Cor : " + cor + "\n" +
                            "Número de portas : " + numero_portas);
    }
}
