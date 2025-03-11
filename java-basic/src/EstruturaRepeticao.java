public class EstruturaRepeticao {
    public static void main(String[] args) {
        //For (para)
        System.out.println("*** FOR ***");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //For each
        System.out.println("*** FOR EACH ***");
        String nomes[] = {"VITORIA", "DAVI", "MANUEL", "CAIO"};

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        //break e continue
        System.out.println("*** BREAK ***");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) 
                break;
            
            System.out.println(x);
        }

        System.out.println("*** CONTINUE ***");
        for (int y = 1; y <= 5; y++) {
            if (y == 3) 
                continue;
            
            System.out.println(y);
        }

        //WHILE
        int numero = 0;
        System.out.println("*** WHILE ***");
        while (numero <= 10) {
            System.out.println("N " + numero);
            numero++;
        }

        //DO WHILE
        System.out.println("*** DO WHILE ***");
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 20);

    }
}