package src.modelo;

public abstract class Administrador extends Empregado{

    private double ajudaDeCusto;


    public double getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public Administrador(double ajudaDeCusto, int CodigoSetor, double salarioBase, double Imposto, int codigo, String nome, String endereco, String telefone) {
            super(CodigoSetor, salarioBase, Imposto, codigo, nome, endereco, telefone);
            this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double novoSalario = getSalarioBase() + this.getAjudaDeCusto();
        setSalarioBase(novoSalario);
        return novoSalario;
    }


    @Override
    public String imprimirDados(){
        return "salario admin: "+ getAjudaDeCusto();
    }
}

    
