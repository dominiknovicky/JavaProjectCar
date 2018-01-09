import sk.akademiasovy.java.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(),
            car2 = new Car("Škoda 120L", 8.7f, "Bratislava"),
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



    }
}
