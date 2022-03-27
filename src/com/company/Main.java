package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<House> myHouseArrayList = new TreeSet<>();
        House firstHouse = new House(190, 62000, "Bishkek", true);
        House secondHouse = new House(250, 80000, "Osh", true);
        House thirdHouse = new House(120, 50000, "Jalal-abad", false);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);

        for (House house : myHouseArrayList) {
            System.out.println(house);
        }


        ArrayList<House> myHouseArrayList1 = new ArrayList<>();
        House firstHouse1 = new House(190, 62000, "Bishkek", true);
        House secondHouse1 = new House(250, 80000, "Osh", true);
        House thirdHouse1 = new House(120, 50000, "Jalal-abad", false);
        myHouseArrayList1.add(firstHouse1);
        myHouseArrayList1.add(secondHouse1);
        myHouseArrayList1.add(thirdHouse1);
        for (House house : myHouseArrayList1) {
            System.out.println(house);
        }
        PriceComparator myPriceComparator = new PriceComparator();
        myHouseArrayList1.sort(myPriceComparator);
        System.out.println("Sorted: ");
        for (House house : myHouseArrayList1) {
            System.out.println(house);
        }
    }
}
