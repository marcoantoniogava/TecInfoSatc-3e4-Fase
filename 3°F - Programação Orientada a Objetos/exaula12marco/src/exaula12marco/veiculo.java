package exaula12marco;

public class veiculo {
    protected String codigo;
    protected String marca;
    protected String modelo;
    protected String ano;
    protected String cor;
    protected String peso;
    protected String tamanho;

    public veiculo (String codigo, String marca, String modelo, String ano, String cor, String peso, String tamanho) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getPeso() {
        return peso;
    }
    public String getTamanho() {
        return tamanho;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Peso: " + peso);
        System.out.println("Tamanho: " + tamanho);
    }

}
