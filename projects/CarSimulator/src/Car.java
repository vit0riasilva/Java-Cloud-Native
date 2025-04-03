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
            switch (march) {
                case 0 -> System.out.println("Car in neutral, change march");
                case 1 -> {
                    if (speed >= 0 && speed < 20)
                        speed += 5;
                    else 
                        System.out.println("Put in march 2");
                }

                case 2 -> {
                    if (speed >= 20 && speed < 40)
                        speed += 5;
                    else 
                        System.out.println("Put in march 3");
                }

                case 3 -> {
                    if (speed >= 40 && speed < 60)
                        speed += 5;
                    else 
                        System.out.println("Put in march 4");
                }

                case 4 -> {
                    if (speed >= 60 && speed < 80)
                        speed += 5;
                    else 
                        System.out.println("Put in march 5");
                }

                case 5 -> {
                    if (speed >= 80 && speed < 100)
                        speed += 5;
                    else 
                        System.out.println("Put in march 6");
                }

                case 6 -> {
                    if (speed >= 100 && speed < 120)
                        speed += 5;
                    else 
                        System.out.println("Max speed!");
                }
                        
                
            }
        } else {
            System.out.println("Alert! Start the car!");
        }
    }

    public void slowDown() {
        if (this.carOn && speed > 0) {
            this.speed -= 5;
            if (speed == 0) {
                System.out.println("Car in neutral!");
                setMarch(0);
            }
            if(speed > 0 && speed <= 20) 
                setMarch(1);

            if (speed > 20 && speed <= 40) {
                setMarch(2);
            }

            if (speed > 40 && speed <= 60)
                setMarch(3);
            
            if (speed > 60 && speed <= 80)
                setMarch(4);

            if (speed > 80 && speed <= 100)
                setMarch(5);
        } else {
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

        switch (march) {
            case 0 -> march++;
            case 1 -> {
                if (speed == 20) {
                    march++;
                } else {
                    System.out.println("is not necessary to change!");
                }
            }
            case 2 -> {
                if (speed == 40) {
                    march++;
                } else {
                    System.out.println("is not necessary to change!");
                }
            }
            case 3 -> {
                if (speed == 60) {
                    march++;
                } else {
                    System.out.println("is not necessary to change!");
                }
            }

            case 4 -> {
                if (speed == 80) {
                    march++;
                } else {
                    System.out.println("is not necessary to change!");
                }
            }

            case 5 -> {
                if (speed == 100) {
                    march++;
                } else {
                    System.out.println("is not necessary to change!");
                }
            }

            case 6 -> {
                System.out.println("it's the maxim speed!");
            }
        }
    }

    public boolean isCarOn() {
        return carOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMarch() {
        return march;
    }

    public void setMarch(int march) {
        this.march = march;
    }

}
