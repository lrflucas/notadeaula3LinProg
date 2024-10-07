import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        System.out.print("Digite o nome do cachorro: ");
        c.setNome(sc2.nextLine());

        System.out.print("Digite a raça dele: ");
        c.setRaca(sc2.nextLine());

        System.out.println("\nAnimal: Cachorro");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());
        c.caminha();
        c.late();

        System.out.print("\nDigite o nome do gato: ");
        g.setNome(sc2.nextLine());

        System.out.print("Digite a raça dele: ");
        g.setRaca(sc2.nextLine());

        System.out.println("\nAnimal: Gato");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Raça: " + g.getRaca());
        g.caminha();
        g.mia();

    }

}