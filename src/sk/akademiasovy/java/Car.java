package sk.akademiasovy.java;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float fuelConsuptiom;
    private boolean frontWiper;
    private String plate;

    // constructor
    public Car(){
        speed = 0;
        engine = false;
        fuelConsuptiom = 7.9f;
        frontWiper = false;
        generatePlate(null);
    }
    public Car(String brand, float fuelConsuptiom, String city){
        speed = 0;
        engine = false;
        this.fuelConsuptiom = fuelConsuptiom;
        this.brand = brand;
        frontWiper = false;
        generatePlate(null);
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

    public void increaseSpeed (int value) {
        if (engine && value > 0)
            speed+=value;
    }
    public int getSpeed () {
        return speed;
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

    public void startFrontWiper(boolean frontWiper) {
        this.frontWiper = frontWiper;
    }

    private void generatePlate(String city) {
        if (city == null)
            city = "";
        //trim = odstrani medzery
        switch (city.toLowerCase().trim()) {
            case "trencin" : plate = "TN-"; break;
            case "presov" : plate = "PO-"; break;
            case "bratislava" : plate = "BL-"; break;
            case "nitra" : plate = "NR-"; break;
            case "senec" : plate = "SC-"; break;
            default: plate = "KE-";
        }

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(10);
            plate+=randomNumber;
        }
        for (int i = 0; i < 2; i++) {
            int randomLetter = random.nextInt(26)+ 'A';
            plate = plate + (char)randomLetter;
        }

        System.out.println(plate);
    }

}
