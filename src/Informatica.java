public class Informatica extends Loja {
    private double seguroEletronicos;

//Inicio Construtor com Super
    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFuncacao, int quantMaxProdutos, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFuncacao, quantMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }


    //Inicio getters and setters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
//Fim getters and setters
    
     @Override
            public String toString(){
                return "Razao Social: " + getNome() + "Data de Constituicao: " + getDataFundacao() + 
                "Endereco: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
                "\nSalario base dos Funcionarios: " + getSalarioBaseFuncionario() + "Valor do Seguro dos Eletrônicos: R$ " + getSeguroEletronicos();
            

        }
}
