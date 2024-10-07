public class Gerente extends Funcionario {

    private String projeto;

    public Gerente() {

    }

    public Gerente(String nome, int nasc, double salario, String projeto) {

        super(nome, nasc, salario);
        this.projeto = projeto;

    }

    public void informarProjeto() {

        System.out.print(" e o projeto do gerente é "+ projeto);

    }


    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}

