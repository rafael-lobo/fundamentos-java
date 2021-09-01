import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = input.nextLine();

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        System.out.println("Seu nome foi " + nome);
    }
}
