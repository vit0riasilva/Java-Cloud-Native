public class Computador {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        FacebookMessenger face = new FacebookMessenger();
        Telegram tlg = new Telegram();

        System.out.println("MSN");
        msn.enviarMensagem();

        System.out.println("Facebook");
        face.enviarMensagem();

        System.out.println("Telegram");
        tlg.enviarMensagem();

    }
}
