public class Vestuario extends Loja {
    private boolean produtosImportados;

   

    public Vestuario (String nome, int QuantidadeDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, 
    Data dataFundacao, boolean produtosImportados, int quantMaxProdutos){
        super(nome, QuantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
        return "Razao Social: " + getNome() + "Data de Constituicao: " + getDataFundacao() + 
        "Endereco: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
        "\nSalario base dos Funcionarios: " + getSalarioBaseFuncionario() +
        "\nProdutos Importados: " + getProdutosImportados();
    }
}
