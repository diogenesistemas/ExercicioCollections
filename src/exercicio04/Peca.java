package exercicio04;
public class Peca {
    private String marca;
    private String modelo;

//    public abstract Peca retirada(String consulta);

    public Peca() {
    }

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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
}
