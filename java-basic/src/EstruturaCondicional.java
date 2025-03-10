/**
 * DESEMPENHO ESCOLAR
 * Sistema para demonstrar o uso das estruturas condicionais em Java
 */
public class EstruturaCondicional {
    public static void main(String[] args) {
        double notaAluno = 6.5;

        //SIMPLES
        if (notaAluno >= 9.0) {
            System.out.println("Parabéns, continue assim");
        }

        //COMPOSTA e ENCADEADA
        if (notaAluno >= 7) 
            System.out.println("Aprovado");
        else if (notaAluno >= 5 && notaAluno < 7) 
            System.out.println("Recuperação");
        else 
            System.out.println("Reprovado");

        //USANDO O OPERADOR TERNÁRIO
        String resultado = (notaAluno >= 7) ? "Aprovado" : (notaAluno >= 5 && notaAluno < 7) ? "Recuperação" : "Reprovado";

        System.out.println("Resultado*: " + resultado);
        System.out.println("Nota do Aluno: " + notaAluno);

        //SWITCH CASE
        char plano = 'M';   //S - Simples, M - Medio, P - Premium

        switch (plano) {
            case 'P':
                System.out.println("3 - Acesso de downloads liberados!");
            case 'M':
                System.out.println("2 - Acesso antecipado de conteúdos!");
            case 'S':
                System.out.println("1 - Acesso a milhares de conteúdos!");
                break;
            default: 
                System.out.println("Opção Inválida!");
        }
    }
}