import java.util.Scanner;

public class ContaBancaria {

    Scanner scanner = new Scanner(System.in);
    Cliente cliente;
    
    private double saldo;
    private double chequeEspecial; 
    boolean usoCheque = false;


    public void consultarSaldo() {
        if(cliente == null) {
            criarCliente();
        }
        System.out.println("SEU SALDO É DE R$" + saldo);
    }

    public void consultarChequeEspecial() {
        if (cliente == null) {
            criarCliente();
        }
        System.out.println("SEU CHEQUE ESPECIAL É DE R$" + chequeEspecial);
    }

    public void depositarDinheiro() {
        if (cliente == null) {
            criarCliente();
        }
        System.out.println("VALOR DO DEPOSITO: ");
        double deposito = scanner.nextDouble();

        setSaldo(getSaldo() + deposito);
        System.out.println("R$" + deposito + "DEPOSITADO NA SUA CONTA");
    }

    public void sacarDinheiro() {
        if (cliente == null) {
            criarCliente();
        }
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
        if (cliente == null) {
            criarCliente();
        }
        System.out.println("VALOR DO BOLETO: ");
        double boleto = scanner.nextDouble();

        if (getSaldo() >= boleto) {
            System.out.println("PAGAMENTO REALIZADO COM SUCESSO.");
            setSaldo(getSaldo() - boleto);
            
        } else if ((getSaldo() + getChequeEspecial()) >= boleto) {
            System.out.println("SEM SALDO DISPONIVEL, GOSTARIA DE UTILIZAR SEU CHEQUE ESPECIAL? (1 para sim e 0 para não)");
            System.out.println("UMA TAXA DE 20% SOBRE O VALOR UTILIZADO SERÁ COBRADO.");
            int op = scanner.nextInt();
            if (op == 1) {
                usoCheque = true;
                double valorUtilizado = boleto - getSaldo();
                System.out.println("PAGAMENTO REALIZADO COM SUCESSO UTILIZANDO CHEQUE ESPECIAL");
                setChequeEspecial(getChequeEspecial() - (boleto - getSaldo()));
                setSaldo(getSaldo() - getSaldo());
                cobrarTaxa(valorUtilizado);
        
            }
            
        } else {
            System.out.println("PAGAMENTO NEGADO, SEM SALDO DISPONÍVEL");
        }
    }

    public void verificarUsoChequeEspecial() {
        if (cliente == null) {
            criarCliente();
        }
        if (usoCheque) {
            System.out.println("SUA CONTA ESTÁ UTILIZANDO CHEQUE ESPECIAL!");
            
        } else {
            System.out.println("SUA CONTA NÃO ESTÁ UTILIZANDO CHEQUE ESPECIAL");
        }
    }

    private void cobrarTaxa(double valor) {
        double taxa = valor * 0.2;
        setSaldo(getSaldo() - taxa);
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

    private void criarCliente() {
        cliente = new Cliente();
        System.out.println("CRIANDO SUA CONTA BANCÁRIA");
        System.out.println("DIGITE SEU NOME: ");
        String name = scanner.next();

        System.out.println("PARA ATIVAR SUA CONTA É NECESSÁRIO FAZER UM DEPOSITO");
        int deposito = scanner.nextInt();
        setSaldo(deposito);
        if (deposito <= 500) {
            setChequeEspecial(50);
        } else {
            setChequeEspecial(deposito * 0.5);
        }

        cliente.setName(name);
        cliente.setConta(1111);
        cliente.setAgencia(13);

        System.out.println("CONTA CRIADA COM SUCESSO " + cliente.getName());
        System.out.println("AGENCIA: " + cliente.getAgencia());
        System.out.println("CONTA: " + cliente.getConta());
        System.out.println("SALDO: " + getSaldo());
        System.out.println("CHEQUE ESPECIAL: " + getChequeEspecial());
    }

}
