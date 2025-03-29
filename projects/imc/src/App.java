
import java.util.Scanner;

/**
 * IMC- INDICE DE MASSA CORPORAL
 * 
 * @author Vitória Silva
 * @version 1.0
 * @since 28/03/2025
 */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====== IMC =======");

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC %.2f = ", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal");
        } else if(imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
        
    }
}
