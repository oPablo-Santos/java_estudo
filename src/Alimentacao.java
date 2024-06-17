public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, Data dataAlvara, int quantMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Razao Social: " + getNome() + "\nData de Constituicao: " + getDataFundacao() +
               "\nEndereco: " + getEndereco() + "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() +
               "\nSalario base dos Funcionarios: " + getSalarioBaseFuncionario() + 
               "\nData do Alvara de Funcionamento: " + getDataAlvara();
    }
}
