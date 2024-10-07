public class Cachorro extends Animal {

    public Cachorro() {
        this.patas = 4;
    }

    public Cachorro(String nome, String raca, int patas) {
        super(nome, raca, 4);
    }

    public void late() {
        System.out.println(nome + " late.");
    }

}
