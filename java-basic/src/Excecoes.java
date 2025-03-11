import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        try ( //criação do objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
            
            System.out.println("-------------------------------");
            System.out.println("Dados do Usuario");
            System.out.println("Nome Completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + "cm");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Digite sua idade no formato númerico - > 15");
            System.out.println("e sua altura no formato: 1.67 ");
        }
    }
}
