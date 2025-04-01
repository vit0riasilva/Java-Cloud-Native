
import java.util.Scanner;

/**
 * Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:
 * 
 * TO-DO
 * 1 - CONSULTAR SALDO ok
 * 2 - CONSULTAR CHEQUE ESPECIAL ok
 * 3 - DEPOSITAR DINHEIRO ok
 * 4 - SACAR DINHEIRO OK
 * 5 - PAGAR UM BOLETO OK
 * 6 - VERIFICAR SE A CONTA ESTÁ USANDO CHEGUE ESPECIAL OK
 * 
 * REGRAS:
 * a CB deve ter um limite de cheque especial somado ao saldo da conta;
 * 
 * o valor do CE é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
 * 
 * se o valor depositado na criação da conta for de R$ 500,00 ou menos o CE deve ser de R$50,00
 * 
 * para valores acima de R$500,00 o CE deve ser de 50% do valor depositado.
 * 
 * caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial;
 */

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();
        int opcao; 

        do {
            System.out.println("======================================");
            System.out.println("BEM VINDO A SUA CONTA BANCÁRIA");
            System.out.println("======================================");
            System.out.println("PRESSIONE 1 PARA CONSULTAR SALDO");
            System.out.println("PRESSIONE 2 PARA CONSULTAR CHEQUE ESPECIAL");
            System.out.println("PRESSIONE 3 PARA DEPOSITAR DINHEIRO");
            System.out.println("PRESSIONE 4 PARA SACAR DINHEIRO");
            System.out.println("PRESSIONE 5 PARA PAGAR BOLETO");
            System.out.println("PRESSIONE 6 PARA VERIFICAR USO DE CHEQUE ESPECIAL");
            System.out.println("PRESSIONE 0 PARA SAIR");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cb.consultarSaldo();
                case 2 -> cb.consultarChequeEspecial();
                case 3 -> cb.depositarDinheiro();
                case 4 -> cb.sacarDinheiro();
                case 5 -> cb.pagarBoleto();
                case 6 -> cb.verificarUsoChequeEspecial();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Invalida");
            }
        } while(opcao != 0);

        System.out.println("FIM DA SESSÃO");

        scanner.close();
    }
}
