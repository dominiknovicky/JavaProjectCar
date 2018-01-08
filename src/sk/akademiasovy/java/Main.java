package sk.akademiavysovy.java;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(),
                car2 = new Car("Škoda 120L", 8.5f);
        car1.setBrand("Audi A6");
        car1.setFuelConsuptiom(9.9f);
        car2.startEngine();
        car1.increaseSpeed();
        car2.increaseSpeed();
        car1.printInfo();
        car2.printInfo();
        System.out.println("Cost: KE <-> PRAGUE: " + car1.getPrice(1600, 1.33f));
        System.out.println("Cost: KE <-> PRAGUE: " + car2.getPrice(1600, 1.33f));
    }
}
