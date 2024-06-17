import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = null;
        Loja loja = null;

        System.out.println("========== Bem-Vindo(a) ==========");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int menu;

        do {
            System.out.println("========= Menu Principal =========");
            System.out.println("[1] Criar uma loja");
            System.out.println("[2] Criar um produto");
            System.out.println("[3] Sair");
            System.out.println();
            System.out.print("Digite a opcao desejada: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (menu) {
                case 1:
                    loja = novaLoja();
                    System.out.println("Loja criada com sucesso!\n");
                    identificarSegmento(loja); // Identifica o segmento da loja apos a criacao
                    break;
                case 2:
                    produto = novoProduto();
                    System.out.println("Produto criado com sucesso!\n");
                    break;
                case 3:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.\n");
                    break;
            }
        } while (menu != 3);

        if (produto != null) {
            System.out.println("========== Validacao do Produto ==========");
            System.out.println("Nome do Produto: " + produto.getNome());
            System.out.print("Status da Validade: ");
            produto.estaVencido(new Data(20, 10, 2023));
            System.out.println();
        } else {
            System.out.println("Nenhum produto foi criado.\n");
        }

        if (loja != null) {
            System.out.println("========== Informacoes da Loja ==========");
            if (loja instanceof Alimentacao) {
                System.out.println("Segmento: Alimentacao");
                System.out.println((Alimentacao) loja);
            } else if (loja instanceof Bijuteria) {
                System.out.println("Segmento: Bijuteria");
                System.out.println((Bijuteria) loja);
            } else if (loja instanceof Cosmetico) {
                System.out.println("Segmento: Cosmeticos");
                System.out.println((Cosmetico) loja);
            } else if (loja instanceof Informatica) {
                System.out.println("Segmento: Informatica");
                System.out.println((Informatica) loja);
            } else {
                System.out.println("Loja de outro segmento criada.");
                System.out.println(loja);
            }
        } else {
            System.out.println("Nenhuma loja foi criada.\n");
        }
    }

    public static Loja novaLoja() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Criar Nova Loja ==========");
        System.out.print("Nome Fantasia: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade de Funcionarios: ");
        int quantidadeFuncionarios = scanner.nextInt();
        System.out.print("Salario Base dos Funcionarios: R$ ");
        double salarioBaseFuncionario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer de entrada
        Data dataFundacao = novaData("Data de Fundacao da Loja");
        Endereco endereco = novoEndereco("Endereco da Loja");
        System.out.print("Quantidade Maxima de Produtos em Estoque: ");
        int quantMaxProdutos = scanner.nextInt();

        // Pergunta o tipo de loja
        System.out.println("Qual o segmento da loja?");
        System.out.println("[1] Alimentacao");
        System.out.println("[2] Bijuteria");
        System.out.println("[3] Cosmeticos");
        System.out.println("[4] Informatica");
        System.out.print("Digite a opcao desejada: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        switch (opcao) {
            case 1:
                Data dataAlvara = novaData("Data do Alvara de Funcionamento da Alimentacao");
                return new Alimentacao(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, dataAlvara, quantMaxProdutos);
            case 2:
                System.out.print("Meta de Vendas: R$ ");
                double metaVendas = scanner.nextDouble();
                return new Bijuteria(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos, metaVendas);
            case 3:
                System.out.print("Taxa de Comercializacao: R$ ");
                double taxaComercializacao = scanner.nextDouble();
                return new Cosmetico(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos, taxaComercializacao);
            case 4:
                System.out.print("Valor do Seguro de Eletrônicos: R$ ");
                double seguroEletronicos = scanner.nextDouble();
                return new Informatica(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos, seguroEletronicos);
            default:
                return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        }
    }

    public static Produto novoProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Criar Novo Produto ==========");
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preco do Produto: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer de entrada
        Data dataValidade = novaData("Data de Validade do Produto");

        return new Produto(nome, preco, dataValidade);
    }

    private static Endereco novoEndereco(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);
        System.out.print("Logradouro: ");
        String nomeDaRua = scanner.nextLine();
        System.out.print("Nrº: ");
        String numero = scanner.nextLine();
        System.out.print("Cidade: ");
        String nomeDaCidade = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("Estado (UF): ");
        String estado = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();

        return new Endereco(nomeDaRua, nomeDaCidade, estado, pais, cep, numero, complemento);
    }

    private static Data novaData(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);
        System.out.print("Dia (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Mês (mm): ");
        int mes = scanner.nextInt();
        System.out.print("Ano (aaaa): ");
        int ano = scanner.nextInt();

        return new Data(dia, mes, ano);
    }

    private static void identificarSegmento(Loja loja) {
        if (loja instanceof Alimentacao) {
            System.out.println("Loja de Alimentacao criada!");
        } else if (loja instanceof Bijuteria) {
            System.out.println("Loja de Bijuteria criada!");
        } else if (loja instanceof Cosmetico) {
            System.out.println("Loja de Cosmeticos criada!");
        } else if (loja instanceof Informatica) {
            System.out.println("Loja de Informatica criada!");
        } else {
            System.out.println("Loja de outro segmento criada.");
        }
    }
}
