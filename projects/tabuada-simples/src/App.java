import java.util.Scanner;

/**
 * Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 * 
 * @author Vitória Silva
 * @version 1.0
 * @since 29/03/2025
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===GERADOR DE TABUADA===");
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        //SOMA
        System.out.println("ADIÇÃO");
        for (int i = 1; i<=10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        //MULTIPLICAÇÃO
        System.out.println("MULTIPLICAÇÃO");
        for (int i = 1; i<=10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
