import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Conta Terminal</h1>
 * <p> Simulando a criação de uma uma conta bancária com Java </p>
 * 
 * @author Vitória Silva
 * @version 1.0
 * @since 10/03/2025
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco XXX!");
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência com digito: ");
        String agencia = scanner.next();
        System.out.println("E para finalizar, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        
    }
}
