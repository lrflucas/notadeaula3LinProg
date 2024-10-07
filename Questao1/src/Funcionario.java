public class Funcionario {

    protected String nome;
    protected int nasc;
    protected double salario;

    public void informarSalario() {

        System.out.print("O salário dele é R$ "+ salario);

    }

    public void calcularIdade() {
        System.out.println(2024 - nasc);
    }


    public Funcionario() {

    }

    public Funcionario(String nome, int nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}