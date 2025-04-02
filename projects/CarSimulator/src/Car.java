/**
 * Car Simulator
 * 
 * @author Vitória Silva
 * @since 01/04/2025
 * @version 1.0
 */

public class Car {
    private boolean carOn;
    private int speed;
    private int march;

    public Car() {
        this.carOn = false;
        this.speed = 0;
        this.march = 0;
    }

    public void start() {
        System.out.println("STARTING CAR! VRUM VRUM");
        this.carOn = true;
    }

    public void turnOff() {
        if (march == 0 && speed == 0) {
            System.out.println("TURNING OFF THE CAR!");
            this.carOn = false;
        } else {
            System.out.println("Put the car in neutral and slow down to 0km!");
        }
    }

    public void speedUp() {
        if (this.carOn) {
            speed++;
        } else {
            System.out.println("Alert! Start the car!");
        }
    }

    public void slowDown() {
        if (this.carOn && speed > 0)
            this.speed--;
        else {
            System.out.println("Alert! Start the car!");
        }
    }

    public void turnRight() {
        if (carOn) {
            if (speed >= 1 && speed <= 40) {
                System.out.println("Turning right!");
            } else {
                System.out.println("The speed must be bigger than 1km and less than 40km!");
            }
        } else {
            System.out.println("Alert! Start the car!");
        }
        
    }

    public void turnLeft() {
        if (carOn) {
            if (speed >= 1 && speed <= 40) {
                System.out.println("Turning left!");
            } else {
                System.out.println("The speed must be bigger than 1km and less than 40km!");
            }
        } else {
            System.out.println("Alert! Start the car!");
        }
        
    }

    public void checkSpeed() {
        System.out.println("Speed: " + speed + "km");
    }

    public void changeMarch() {
        march++;
    }


}
