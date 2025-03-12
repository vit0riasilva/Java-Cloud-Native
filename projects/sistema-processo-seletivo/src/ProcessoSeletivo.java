import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"MARIA", "PAULO", "ANDRE", "CAIO", "FELIPE"};

        for (String candidato: candidatos) {
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTANTO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA"); 
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTANTO COM " + candidato + ", NÚMERO MÁXIMO TENTANTIVAS " + tentativasRealizadas + " REALIZADAS");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"MARIA", "PAULO", "ANDRE", "CAIO", "PEDRO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
         for (int i=0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i+1) + " é " + candidatos[i]);
         }

         System.out.println("Imprimindo de forma simplificada");
         for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
         }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"MARIA", "PAULO", "ANDRE", "CAIO", "FELIPE", "FERNANDA", "DANIEL", "PEDRO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
