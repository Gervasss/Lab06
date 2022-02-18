package src.controle;

import java.util.ArrayList;

import src.modelo.*;


public class ControlePessoa {

   
    ArrayList <Pessoa> pessoas = new ArrayList<>();

                   
    public void cadastrarPessoa(Pessoa novaPessoa){
        pessoas.add(novaPessoa);
    }

    public void cadastrarEmpregado(Empregado novoEmpregado) {
        pessoas.add(novoEmpregado);
    }

    public void cadastrarFornecedor(Fornecedor novoFornecedor){
        pessoas.add(novoFornecedor);
    }

    public void cadastrarAdministrador(Administrador novoAdministrador){
        pessoas.add(novoAdministrador);
    }

    public void cadastrarVendedor(Vendedor novoVendedor){
        pessoas.add(novoVendedor);
    }

    public void cadastrarEmpregadoParametro(String nome,int codigoSetor, double salarioBase, double imposto) {
        pessoas.add(new Empregado(codigoSetor,salarioBase,imposto, nome ));
    }

    public void cadastrarFornecedorParametro(String nome, double valorCredito, double valorDivida) {
        pessoas.add(new Fornecedor(nome, valorCredito, valorDivida));
    }

    public void cadastrarAdministradorParametro(String nome, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        pessoas.add(new Administrador(nome, codigoSetor, salarioBase, imposto, ajudaDeCusto));
    }

    public void cadastrarVendedorParametero(String nome, int codigoSetor, double salarioBase, double imposto, double valorVendas) {
        pessoas.add(new Vendedor(nome, codigoSetor, salarioBase, imposto, valorVendas));
    }



    public Pessoa pesquisarPessoa(String nome){    
        for(int i = 0; i < pessoas.size(); i++) {
                if(pessoas.get(i).getNome() == nome) {
                    return pessoas.get(i);
                }
            }
            return null;
    }
     
    public Boolean verificaNomePessoa(String nome) {
        Boolean existe = false;
        for(int i = 0; i < pessoas.size(); i++) {
            if(nome == pessoas.get(i).getNome()) {
                existe = true;
                return existe;
            }
        }
        return existe;
    }

    public String imprimirPessoas(){
        String impressao = "";
        for(int i = 0; i < pessoas.size(); i++) {
           impressao+=pessoas.get(i).imprimirDados();
           
        }
        return impressao;

    }

    public String imprimirFornecedores(){
        String impressao = "";
        for(int i=0; i < pessoas.size(); i++){
            if(pessoas.get(i)instanceof Fornecedor){
                impressao += pessoas.get(i).imprimirDados();         
            }
        }
        return impressao;
    }

    public String imprimirEmpregados(){
        String impressao = "";
        for(int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i) instanceof Empregado) {
                impressao += pessoas.get(i).imprimirDados();
            }
        }
        return impressao;
    }

    
    
}
