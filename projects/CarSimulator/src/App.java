import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Car fusca = new Car();
        int op;

        do {
            System.out.println("=========================");
            System.out.println("WELCOME");
            System.out.println("CAR'S DASHBOARD");
            System.out.println("1 - TURN ON CAR");
            System.out.println("2 - TURN OFF CAR");
            System.out.println("3 - SPEED UP");
            System.out.println("4 - SLOW DOWN");
            System.out.println("5 - TURN RIGH");
            System.out.println("6 - TURN LEFT");
            System.out.println("7 - CHECK SPEED");
            System.out.println("8 - CHANGE MARCH");
            System.out.println("PRESS 0 TO GET OUT OF THE CAR");
            op = scanner.nextInt();

            switch (op) {
                case 1 -> fusca.start();
                case 2 -> fusca.turnOff();
                case 3 -> fusca.speedUp();
                case 4 -> fusca.slowDown();
                case 5 -> fusca.turnRight();
                case 6 -> fusca.turnLeft();
                case 7 -> fusca.checkSpeed();
                case 8 -> fusca.changeMarch();
                case 0 -> System.exit(0);
                default -> System.out.println("INVALID OPTION");
            }
        } while(op != 0);
    }
}
