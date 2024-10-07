public class Programador extends Funcionario {

    private String linguagem;

    public Programador() {

    }

    public Programador(String nome, int nasc, double salario, String linguagem) {

        super(nome, nasc, salario);
        this.linguagem = linguagem;

    }

    public void informarLinguagem() {

        System.out.println(" e a linguagem de programação é "+ linguagem);

    }


    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
