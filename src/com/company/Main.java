package com.company;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Car, InfoCar> car = new HashMap<>();
        car.put(new Car("04KG", "354ABC"),
                new InfoCar(LocalDate.of(2008, 10, 6),
                        "BMW", 25000, "Green"));
        car.put(new Car("01KG", "777QQQ"),
                new InfoCar(LocalDate.of(2020, 04, 02),
                        "Tesla", 75000, "SuperWhite"));
        car.put(new Car("02KG", "111OSH"),
                new InfoCar(LocalDate.of(2022, 01, 02),
                        "AUDI", 90000, "Red"));
        car.put(new Car("03KG", "333SDR"),
                new InfoCar(LocalDate.of(2021, 01, 06),
                        "MercedesBenz", 120000, "Black"));

        for (Map.Entry<Car, InfoCar> carInfoCarEntry : car.entrySet()) {
            System.out.println(carInfoCarEntry.getKey() + " " + carInfoCarEntry.getValue());
        }

    }
}
