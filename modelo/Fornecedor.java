package src.modelo;

public abstract class Fornecedor extends Pessoa {

   private double valorCredito, valorDivida;

   public Fornecedor (String nome, double valorCredito, double valorDivida) {
        super(nome);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return this.valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getvalorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }


    public double obterSaldo(double valorDivida, double valorCredito){
        return this.getValorCredito() - this.getvalorDivida();
    }
   
    @Override
    public String imprimirDados(){
        String impressao = "Valor da Divida: " + getvalorDivida()+
                "\nNome: " + getNome() + 
                "\nValor do Credito: "+ getValorCredito() +
                "\nCodigo: " + getCodigo() +
                "\nCategoria: " + getClass();
                return impressao;
                 
    }

    @Override
    public String tipoPessoa() {
        return "Classe dessa Pessoa :" + this.getClass();
    }

}
