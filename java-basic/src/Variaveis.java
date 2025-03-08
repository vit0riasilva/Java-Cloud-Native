public class Variaveis {
    public static void main(String[] args) throws Exception {

        //TIPOS DE VARIÁVEIS

        String nome = "Vitoria"; // TIPO CADEIA DE CARACTERES
        int idade = 24; //TIPO INTEIRO
        double altura = 1.45; //TIPO DECIMAL
        boolean solteira = false; //TIPO BOOLEANO
        char sexo = 'F'; //TIPO CARACTERE

        final int dataNascimento = 2001; //constante

        System.out.println("Dados do Usuario");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " ( " + dataNascimento + " )");
        System.out.println("Altura: " + altura);
        System.out.println("Solteira: " + solteira);
        System.out.println("Sexo: " + sexo);
    }
}
