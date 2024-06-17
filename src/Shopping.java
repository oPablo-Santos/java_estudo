import java.util.Arrays;
import static java.util.Objects.isNull;

public class Shopping {

    // Atributos
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor do Shopping
    public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMaxLojas];
    }

    // Metodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Início metodo insere loja
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                this.lojas[i] = loja;
                System.out.println("Loja " + loja.getNome() + " inserida com sucesso!");
                return true;
            }
        }
        return false;
    }

    // Início metodo remove loja
    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)) {
                lojas[i] = null;
                System.out.println("Loja " + nome + " removida com Sucesso!");
                return true;
            }
        }
        return false;
    }

    // Início metodo quantidade de lojas por tipo
    public int quantidadeLojasPorTipo(Class<?> tipo) {
        int quant = 0;

        for (Loja loja : lojas) {
            if (loja != null && tipo.isInstance(loja)) {
                quant++;
            }
        }

        if (quant == 0) {
            System.out.println("Erro: Loja nao encontrada para o tipo desejado.");
            return -1;
        }

        return quant;
    }

    // Metodo Loja com seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;

        for (Loja loja : this.lojas) {
            if (loja instanceof Informatica) {
                Informatica atual = (Informatica) loja;

                if (isNull(maisCara) || atual.getSeguroEletronicos() > maisCara.getSeguroEletronicos()) {
                    maisCara = atual;
                }
            }
        }

        return maisCara;
    }

    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }
}
