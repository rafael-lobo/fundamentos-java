import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero = ");
        double num1 = input.nextFloat();

        System.out.print("Segundo numero = ");
        double num2 = input.nextFloat();

        double media = (num1 + num2) / 2 ;

        System.out.println("A média dos números é " + media);
    }
}
