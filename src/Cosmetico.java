
public class Cosmetico extends Loja {
    private double taxaComercializacao;

//Construtor da classe com o super puxando dados da classe mae
    public Cosmetico (String nome, int QuantidadeDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  int quantMaxProdutos, double taxaComercializacao){
        super(nome, QuantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
//Fim Construtor

//Getters and Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaDeComercializacao) {
        this.taxaComercializacao = taxaDeComercializacao;
    }
//Fim getters and setters

    @Override
    public String toString(){
        return "Razao Social: " + getNome() + "Data de Constituicao: " + getDataFundacao() + 
        "Endereco: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
        "\nSalario base dos Funcionarios: " + getSalarioBaseFuncionario() +
        "\nTaxa de Comercializacao: " + getTaxaComercializacao();
    }

}
