public class Gato extends Animal {

    public Gato() {
        this.patas = 4;
    }

    public Gato(String nome, String raca, int patas) {
        super(nome, raca, 4);
    }

    public void mia() {
        System.out.println(nome + " mia.");
    }
}