/**
 * <h1> Sistema Smart Tv </h1>
 * Sistema que simula um controle remoto de uma Smart Tv;
 * <p>
 * <b>Note: </b> Leia a documentação com atenção. </p>
 * 
 * @author Vitória Silva
 * @version 1.0
 * @since 07/03/2025
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    /**
     * Método para ligar a Smart Tv 
     * Não tem parâmentros e não tem retorno;
    */
    public void ligar() {
        ligada = true;
        System.out.println("SmartTv ligada!");
    }

    /**
     * Método para desligar a Smart Tv 
     * Não tem parâmentros e não tem retorno;
    */
    public void desligar() {
        ligada = false;
        System.out.println("Desligando SmartTv");
    }

    /**
     * Método para aumentar volume da Smart Tv 
     * Não tem parâmentros e não tem retorno;
    */
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    /**
     * Método para diminuir volume da Smart Tv 
     * Não tem parâmentros e não tem retorno;
    */
    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    /**
     * Método para mudar canal da Smart Tv 
     * @param canalNovo : novo canal desejado
     * Não tem retorno;
    */
    public void mudarCanal (int canalNovo) {
        canal = canalNovo;
    }

}
