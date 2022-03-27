package com.company;

public class Car {
    private String id;
    private String numberCar;

    public Car() {
    }

    public Car(String id, String numberCar) {
        this.id = id;
        this.numberCar = numberCar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", numberCar='" + numberCar + '\'' +
                '}';
    }
}
