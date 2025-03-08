public class Operadores {
    public static void main(String[] args) {

        //OPERADORES ARITMÉTICOS

        System.out.println("OPERADORES ARITMETICOS");
        System.out.println("Adicao: 10 + 10 = " + (10 + 10));
        System.out.println("Subtracao: 20 - 10 = " + (20 - 10));
        System.out.println("Multiplicacao: 10 * 2 = " + (10 * 2));
        System.out.println("Divisao: 50 / 2 = " + (50 / 2));
        System.out.println("Modulo: 10 % 3 = " + (10 % 3));
        System.out.println("--------------------------------------");

        //OPERADORES UNÁRIOS

        int x = 5;

        System.out.println("OPERADORES UNARIOS");
        System.out.println("Valor de X: " + x);
        System.out.println("Valor Negativo (-): " + (-x));
        System.out.println("Incremento (++): " + (++x));
        System.out.println("Decremento (--): " + (--x));
        System.out.println("Negacao (!): " + (!true));
        System.out.println("----------------------------------------");

       //OPERADOR TERNÁRIO
       int idade = 20;
       System.out.println("OPERADOR TERNARIO");
       String maioridade = (idade > 18) ? "SIM" : "NAO";
       System.out.println("Pode dirigir? " + maioridade);
       System.out.println("-----------------------------------------");

       //OPERADORES RELACIONAIS
       System.out.println("OPERADORES RELACIONAIS");
       System.out.println("X = " + x + " | idade = " + idade);
       System.out.println("Igual (==): x == idade? " + (x == idade));
       System.out.println("Diferente (!=): x != idade? " + (x != idade));
       System.out.println("Maior (>): x > idade? " + (x > idade));  //Maior Igual (>=)
       System.out.println("Menor (<): x < idade? " + (x < idade)); //Menor Igual (<=)
       System.out.println("--------------------------------------------------------");

       //OPERADORES LÓGICOS
       boolean solteiro = false;
       boolean adolescente = idade > 10 && idade < 18;
       boolean apto = idade >= 20 || solteiro;
       System.out.println("OPERADORES LOGICOS");
       System.out.println("Idade: " + idade);
       System.out.println("Para ser adolescente: Idade > 10 E (&&) Idade < 18 -> " + adolescente);
       System.out.println("Para ser apto: Idade >= 18 OU (||) Estar Disponivel -> " + apto);
    }
}
