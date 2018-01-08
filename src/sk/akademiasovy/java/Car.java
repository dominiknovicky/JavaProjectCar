package sk.akademiavysovy.java;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float fuelConsuptiom;

    // constructor
    public Car(){
        speed = 0;
        engine = false;
        fuelConsuptiom = 7.9f;
    }
    public Car(String brand, float fuelConsuptiom){
        speed = 0;
        engine = false;
        this.fuelConsuptiom = fuelConsuptiom;
        this.brand = brand;
    }

    public void setBrand(String value) {
        brand = value;
    }
    public String getBrand() {
        return brand;
    }

    public void setFuelConsuptiom(float fuelConsuptiom) {
        this.fuelConsuptiom = fuelConsuptiom;
    }
    public float getFuelConsuptiom() {
        return fuelConsuptiom;
    }

    public void printInfo () {
        System.out.println("Brand: " +brand+ ", Speed: " +speed+ ", Engine " +engine+ ", Fuel Consumption " + fuelConsuptiom);
    }

    public void startEngine () {
        engine = true;
    }
    public void stopEngine () {
        engine = false;
    }

    public void increaseSpeed () {
        if (engine)
            speed+=10;
    }

    public void decreaseSpeed () {
        if (speed > 0)
            speed-=10;
    }

    public void stop() {
        speed = 0;
    }

    public float getPrice (int distance, float costPerLiter) {
        float sum = distance*fuelConsuptiom*costPerLiter/100;
        return sum;
    }
}
