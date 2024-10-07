import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Gerente ger = new Gerente();
        Programador prog = new Programador();

        System.out.print("Digite o nome do gerente: ");
        ger.setNome(sc2.nextLine());

        System.out.print("Digite o ano de nascimento de " + ger.getNome() + ": ");
        ger.setNasc(sc.nextInt());

        System.out.print("Digite o salário dele: ");
        ger.setSalario(sc.nextDouble());

        sc.nextLine();

        System.out.print("Digite o projeto dele: ");
        ger.setProjeto(sc2.nextLine());


        System.out.println("\nGerente:");
        System.out.println("Nome: " + ger.getNome());
        System.out.print("Idade: ");
        ger.calcularIdade();
        ger.informarSalario();
        ger.informarProjeto();


        System.out.print("\n\nDigite o nome do programador: ");
        prog.setNome(sc2.nextLine());

        System.out.print("Digite o ano de nascimento de " + prog.getNome() + ": ");
        prog.setNasc(sc.nextInt());

        System.out.print("Digite o salário dele: ");
        prog.setSalario(sc.nextDouble());


        System.out.print("Digite a linguagem de programação dele: ");
        prog.setLinguagem(sc2.nextLine());


        System.out.println("\nProgramador:");
        System.out.println("Nome: " + prog.getNome());
        System.out.print("Idade: ");
        prog.calcularIdade();
        prog.informarSalario();
        prog.informarLinguagem();

        sc.close();
    }
}