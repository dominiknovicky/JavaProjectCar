import sk.akademiasovy.java.Car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(),
            car2 = new Car("Škoda 120L", 8.7f, "Presov"),
            car3 = new Car("Seat Leon", 6, "Trencin");

        car1.setBrand("Audi A6");
        car1.setFuelConsuptiom(9.9f);
        car1.startEngine();
        car2.startEngine();
        car1.increaseSpeed(65);
        car2.increaseSpeed(65);
        car1.printInfo();
        car2.printInfo();
        System.out.println("Cost: KE <-> PRAGUE: " + car1.getPrice(1600, 1.33f));
        System.out.println("Cost: KE <-> PRAGUE: " + car2.getPrice(1600, 1.33f));

        if(car1.getSpeed() > car2.getSpeed()){
            System.out.println("First car speed: " +car1.getSpeed());
        }
        else if (car1.getSpeed() == car2.getSpeed()) {
            System.out.println("Speeds equals: " +car2.getSpeed());
        }
        else if (car1.getSpeed() < car2.getSpeed()){
            System.out.println("Second car speed: " +car2.getSpeed());
        }

        int count = 0;
        Car[] taxi = new Car[10];
        for (int i = 0; i < 10; i++) {
            taxi[i] = new Car("Kia Ceed", 6.5f, "Presov");
        }

        /*for (int i = 0; i < 10; i++) {
            taxi[i].startEngine();
        } == ↓ skrátený zápis*/
        for (int i = 0; i < 10; i++) {
            taxi[i].startEngine();
            taxi[i].turnOnLights();
            Random random = new Random();
            taxi[i].increaseSpeed(random.nextInt(31)+40);
            taxi[i].printInfo();
        }
        for (Car car:taxi){
            if(car.getPlate().contains("8")){
                System.out.println("Plate with number 8: " +car.getPlate());
            }
        }

        Car[] arr = new Car[20];

        System.out.println();
        int maxSpeed = 0;
        for (int i = 0; i < 10; i++) {
            if(taxi[i].getSpeed() > maxSpeed){
                maxSpeed = taxi[i].getSpeed();
            }
        }
        for (int i = 0; i < 10; i++) {
            if (maxSpeed == taxi[i].getSpeed())
                taxi[i].printInfo();
        }

        float averageSpeed = 0;
        for (Car car:taxi) {
            averageSpeed += car.getSpeed();
        }
        System.out.println("Average speed is: " +(float)averageSpeed/taxi.length);

        int r = new Random().nextInt(taxi.length-1);
        System.out.print("Number of random called taxi is: ");
        taxi[r].printInfo();

        taxi[5].turnOnLights();
        taxi[5].setDoors(5);
        taxi[5].setColor("navy blue");
        System.out.print(taxi[5].isLights() + ", ");
        System.out.print(taxi[5].getDoors());
        System.out.print(", " + taxi[5].getColor());

    }
}

