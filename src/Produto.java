// início classe Produto


public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    private Data dataAtual;

    // início construtor
    public Produto (String nome, double preco, Data dataValidade){
        
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    
        
    }// Fim construtor

    //Construtor 2
        public Produto(){
            
        }
    //Fim construtor 2
    
    // Início getters and setters
    
    public String getNome (){
        
        return nome;
    
    }
    
    public void setNome (String nome){
         
        this.nome = nome;
    
    }
    
    public double getPreco () {
        
        return preco;
    
    }
    
    public void setPreco (double preco){
        
        this.preco = preco;
    
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Data getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Data dataAtual) {
        this.dataAtual = dataAtual;
    }

   
    // Fim getters and Setters

    //Metodo que avalia data de vencimento

    

    public boolean estaVencido(Data dataAtual){
        if (dataValidade.getAno() < dataAtual.getAno()){
            System.out.println("PRODUTO VENCIDO");
            return true;
            
        }else if (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes()) {
            System.out.println("PRODUTO VENCIDO");
            return true;

        }else if (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia()){
            System.out.println("PRODUTO VENCIDO");
            return true;

        }else if (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() == dataAtual.getDia()){
            System.out.println("PRODUTO VENCIDO");
            return true;
        
        }else {
            System.out.println("PRODUTO NaO VENCIDO");
            return false;
        }
    }
    //Fim Metodo que avalia data de vencimento
    
    @Override
    public String toString() {
        return "Nome do Produto: " + getNome() + "\nPreco: R$ " + getPreco() + "\nValidade: " + getDataValidade(); 
    }

    public boolean equalsIgnoreCase(String nomeProduto) {
        return false;
    }

}// Fim classe produto   