package src.modelo;


public abstract class Pessoa {
   
    private String nome, endereco, telefone;
    private static int cont;
    private int codigo;

    
    
  
    public Pessoa(){
       this.codigo = cont++ ;
    } 

    public Pessoa(String nome){
        this.nome = nome;
        this.codigo = cont++ ;

    }

    public Pessoa(String nome, String telefone, String endereco,int codigo){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.codigo = cont++ ;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public abstract String imprimirDados();
       
    public abstract String tipoPessoa();

    
    }

