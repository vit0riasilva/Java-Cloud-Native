import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {
        int option = -1;

        do {
            System.out.println("===========================");
            System.out.println("Escolha uma das opções");
            System.out.println("===========================");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastercer a máquina com água");
            System.out.println("3 - Abastercer a máquina com xampu");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verificar o xampu da máquina");
            System.out.println("6 - Verificar se tem Pet no banho");
            System.out.println("7 - Colocar o pet na máquina");
            System.out.println("8 - Retirar o pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.darBanho();
                case 2 -> setAgua();
                case 3 -> setXampu();
                case 4 -> verificarAgua();
                case 5 -> verificarXampu();
                case 6 -> checarPetMaquina();
                case 7 -> setPet();
                case 8 -> petMachine.retirarPet();
                case 9 -> petMachine.lavarMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Invalida");
                  
            }

        } while(true);


        
    }

    private static void setAgua() {
        System.out.println("Tentando colocar água na máquina");
        petMachine.adicionarAgua();
    }

    private static void setXampu() {
        System.out.println("Tentando colocar xampu na máquina");
        petMachine.adicionarXampu();
    }

    private static void verificarAgua() {
        int total = petMachine.getAgua();
        System.out.println("A máquina está no momento com " + total + " litro(s) de agua");
    }

    private static void verificarXampu() {
        int total = petMachine.getXampu();
        System.out.println("A máquina está no momento com " + total + " litro(s) de xampu");
    }

    public static void setPet() {
        String name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do Pet");
            name = scanner.next();
        }
        
        Pet pet = new Pet(name);
        petMachine.setPet(pet);

    }

    private static void checarPetMaquina() {
        boolean temPet = petMachine.temPet();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

}
