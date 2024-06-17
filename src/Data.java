
public class Data {
    private int dia;
    private int mes;
    private int ano;

//Construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        validarData();
    }

//inicio construtor

    private void validarData() {
        boolean dataValida = true;

        if (mes < 1 || mes > 12) {
            dataValida = false;
        } else if (dia < 1 || dia > diasNoMes()) {
            dataValida = false;
        }

        if (!dataValida) {
            System.out.println("Data invalida. Sera atribuído o data padrao: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private int diasNoMes() {
        int diasNoMes = 0;

        switch (mes) {
            case 2:
                diasNoMes = (verificaAnoBissexto()) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasNoMes = 30;
                break;
            default:
                diasNoMes = 31;
        }

        return diasNoMes;
    }

    public boolean verificaAnoBissexto() {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }// Fim construtor 


 
    // inicio getters and Setters

      public int getDia() {
        return dia;
      }

      public void setDia(int dia) {
        this.dia = dia;
      }

      public int getMes() {
        return mes;
      }

      public void setMes(int mes) {
        this.mes = mes;
      }

      public int getAno() {
        return ano;
      }

      public void setAno(int ano) {
        this.ano = ano;
      }
       // Fim getters and Setters


    public static Data getDataValidade() {
        return null;
    }

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }

   

}// Fim Classe