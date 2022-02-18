package src.visao;

import java.util.Scanner;
import src.controle.*;
import javax.swing.JOptionPane;

public class EmpregadoApp { 

    public static String menu(){
        return  "[1] Cadastrar Fornecedor\n" + 
                "[2] Cadastrar empregado\n" +
                "[3] Pesquisar uma pessoa\n" +
                "[4] Imprimir todas as pessoas\n" +
                "[5] Imprimir todos os fornecedores\n" +
                "[6] Imprimir todos os empregados\n" +
                "[0] Sair do Programa\n";
    }

    public static void main(String[] args) {
        ControlePessoa controlePessoa = new ControlePessoa();
        int op = 10;
        String nome;
        
        while(op != 0) {
            switch(op) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome da pessoa :");
                        Double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de credito :"));
                        Double valorDivida = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da divida\n Montante da divida do Fornecedor "));
                        controlePessoa.cadastrarFornecedorParametro(nome, valorCredito, valorDivida);
                        JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com sucesso !");
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome do Empregado: ");
                        int codigoSetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Setor: "));
                        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario Base: "));
                        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto em % inteira(5%,6%...): "));
                        int opEmpregado = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de empregado vc quer cadastrar ? \n[1] Vendedor\n[2] Administrador"));
                        switch(opEmpregado) {
                            case 1:
                                double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas :"));
                                controlePessoa.cadastrarVendedorParametero(nome, codigoSetor, salarioBase, imposto, valorVendas);
                                JOptionPane.showMessageDialog(null,"Vendedor Cadastrado com sucesso !");
                                break;
                            case 2:
                                Double ajudaDeCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite os valores da ajuda de custo do administrador :"));
                                controlePessoa.cadastrarAdministradorParametro(nome, codigoSetor, salarioBase, imposto, ajudaDeCusto);
                                JOptionPane.showMessageDialog(null,"Administrador Cadastrado com Sucesso !");
                                break;
                        }
                    case 3:
                        nome = JOptionPane.showInputDialog("Digite o nome da pessoa\n");
                        if(controlePessoa.verificaNomePessoa(nome)) {
                        JOptionPane.showMessageDialog(null, controlePessoa.imprimirPessoas());
                        } else {
                        JOptionPane.showMessageDialog(null,"Pessoa não encontrada");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, controlePessoa.imprimirPessoas());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, controlePessoa.imprimirFornecedores());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, controlePessoa.imprimirEmpregados());
                        break;
            }
        }
    }
}
