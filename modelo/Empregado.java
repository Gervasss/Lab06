package src.modelo;

public abstract class Empregado extends Pessoa {
    int codigoSetor;
    double salarioBase,Imposto;

    public Empregado(int codigoSetor, double salarioBase, double Imposto, int codigo, String nome, String endereco, String telefone) {
        super( nome,telefone,endereco,codigo);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.Imposto = Imposto;
    }

    public int getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return this.Imposto;
    }

    public void setImposto(double Imposto) {
        this.Imposto = Imposto;
    }

    public double calcularSalario(){
        double salario = this.getSalarioBase() - ((this.getSalarioBase() * this.getImposto()) / 100 );
        return salario;
    }

   
    @Override
    public String imprimirDados() {
        String impressao = "Codigo Setor : " + this.getCodigoSetor() + 
        "\nSalario Base : " + this.getSalarioBase() + 
        "\nImposto : " + this.getImposto() + 
        "\nNome : " + getNome() + 
        "\nCodigo : " + getCodigo() +
        "\nClasse :" + getClass();
        return impressao;
    }

    @Override
    public String tipoPessoa() {
        return "Classe dessa Pessoa :" + this.getClass();
    }

}
