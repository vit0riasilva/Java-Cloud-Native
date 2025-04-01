import java.util.Scanner;

public class ContaBancaria {

    Scanner scanner = new Scanner(System.in);
    
    private double saldo;
    private double chequeEspecial; 
    boolean usoCheque = false;

    public void consultarSaldo() {
        System.out.println("SEU SALDO É DE " + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("SEU CHEQUE ESPECIAL É DE " + chequeEspecial);
    }

    public void depositarDinheiro() {
        System.out.println("VALOR DO DEPOSITO: ");
        double deposito = scanner.nextDouble();

        setSaldo(getSaldo() + deposito);
    }

    public void sacarDinheiro() {
        System.out.println("VALOR DO SAQUE: ");
        double saque = scanner.nextDouble();

        if (getSaldo() >= saque) {
            System.out.println("SAQUE REALIZADO COM SUCESSO");
            setSaldo(getSaldo() - saque);
        } else {
            System.out.println("SAQUE NEGADO, SALDO ABAIXO DO SOLICITADO");
        }
    }

    public void pagarBoleto() {
        System.out.println("VALOR DO BOLETO: ");
        double boleto = scanner.nextDouble();

        if (getSaldo() >= boleto) {
            System.out.println("PAGAMENTO REALIZADO COM SUCESSO.");
            setSaldo(getSaldo() - boleto);
            
        } else if ((getSaldo() + getChequeEspecial()) >= boleto) {
            System.out.println("SEM SALDO DISPONIVEL, GOSTARIA DE UTILIZAR SEU CHEQUE ESPECIAL? (1 para sim e 0 para não)");
            int op = scanner.nextInt();
            if (op == 1) {
                usoCheque = true;
                System.out.println("PAGAMENTO REALIZADO COM SUCESSO UTILIZANDO CHEQUE ESPECIAL");
                setSaldo(getSaldo() - getSaldo());
                setChequeEspecial(getChequeEspecial() - (boleto - getSaldo()));
            }
            
        } else {
            System.out.println("PAGAMENTO NEGADO, SEM SALDO DISPONÍVEL");
        }
    }

    public void verificarUsoChequeEspecial() {
        if (usoCheque) {
            System.out.println("SUA CONTA ESTÁ UTILIZANDO CHEQUE ESPECIAL!");
            
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

}
