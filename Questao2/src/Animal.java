public class Animal {

    protected String nome;
    protected String raca;
    protected int patas;


    public void caminha() {
        System.out.println(nome + " caminha em " + getPatas() + " patas.");
    }


    public Animal() {
        this.patas = 0;
    }

    public Animal(String nome, String raca, int patas) {
        this.nome = nome;
        this.raca = raca;
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}