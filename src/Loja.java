// início classe Loja

import java.util.Arrays;

public class Loja {
// iniciando Scanner

//Atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFuncacao;
    private Produto [] estoqueProdutos;



// início construtor 1
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFuncacao, int quantMaxProdutos ){

       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = salarioBaseFuncionario;
       this.endereco = endereco;
       this.dataFuncacao = dataFuncacao;
       this.estoqueProdutos = new Produto[quantMaxProdutos];

    } 
// Fim construtor 1


// início construtor 2
  
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantMaxProdutos) {
      
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.endereco = endereco;
      this.dataFuncacao = dataFundacao;
      salarioBaseFuncionario = -1;
      this.estoqueProdutos = new Produto[quantMaxProdutos];
    }
// Fim construtor 2
//Contrutor 3
    public Loja(){
        
    }
//Fim construtor 3


// início getters and setters
    public String getNome() {
       
        return nome;
    
    }

    public void setNome(String nome){
    
        this.nome = nome;
    
    }

    public int getQuantidadeFuncionarios(){
    
        return quantidadeFuncionarios; 
    
    }

    public void setQuantidadeFuncionarios (int quantidadeFuncionarios) {
        
        this. quantidadeFuncionarios = quantidadeFuncionarios;
    
    }

    public double getSalarioBaseFuncionario(){
        
        return salarioBaseFuncionario;
    
    }

    public void setSalarioBaseFuncionario (double  salarioBaseFuncionario ) {
        
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    
    }
    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Data getDataFundacao() {
        return dataFuncacao;
    }


    public void setDataFundacao(Data dataFuncacao) {
        this.dataFuncacao = dataFuncacao;
    }

        public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }


    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

//Fim getters and setters

// início metodo gasto com salario

    double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (quantidadeFuncionarios * salarioBaseFuncionario);
        }
        
    }
// Fim metodo gasto com Salario

// início Metodo Tamanho loja
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';

        } else if ((quantidadeFuncionarios == 10) || (quantidadeFuncionarios <= 30)){

            return 'M';

        } else {
    
            return 'G';
        }

    }
// Fim Metodo Tamanho Loja

//Início metodo imprimeProdutos
    public void imprimeProdutos(){
        System.out.println("=========== Produtos em Estoque ===========");
        for (int i=0; i<estoqueProdutos.length; i++)
            System.out.println(estoqueProdutos[i]);
            System.out.println("===========================================");
    }

// Fim metodo imprimeProdutos

//Metodo insire produto
    public boolean insereProduto(Produto produto){
        for (int i=0; i<estoqueProdutos.length; i++){
           if (estoqueProdutos[i] == null){
                this.estoqueProdutos[i] = produto;
                System.out.println("Produto " + produto + "encontrado com sucesso!");
                return true;

           }

        }
        return false;
    }
//Fim metodo insere produto

//Metodo remover produto
    public boolean removeProduto(String nome){
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)){
                estoqueProdutos[i] = null;
                System.out.println("Produto " + nome + " removido com sucesso!");
                return true;
            }
        }
        return false;
    }
       
       
//Fim metodo remover produto
       
    @Override
        public String toString(){
            return "Razao Social: " + getNome() + "\nData de Constituicao: " + getDataFundacao() + 
            "\nEndereco: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
            "\nSalario base dos Funcionarios: " + getSalarioBaseFuncionario() + 
            "\nQuantidade Maxima de Produtos em estoque: " + Arrays.toString(estoqueProdutos);

        }
            

} // Fim clase