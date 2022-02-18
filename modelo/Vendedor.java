package src.modelo;

public abstract class Vendedor extends Empregado{

    private double valorVendas, comissao;

    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    

    public Vendedor(double valorVendas,double comissao, int codigoSetor,  double salarioBase,double Imposto, String nome, String endereco,int codigo, String telefone) {
            super(codigoSetor,salarioBase,Imposto,codigo,nome,endereco,telefone);
            this.valorVendas = valorVendas;
            this.comissao = comissao;
    }

    @Override
    public double calcularSalario () {
        double novoSalario = getSalarioBase() + (getValorVendas() * getComissao())/100;
        setSalarioBase(novoSalario);
        return calcularSalario();
    }

    @Override
    public String imprimirDados(){
            return "salario do vendedor:"+getComissao();
        }
}
    

