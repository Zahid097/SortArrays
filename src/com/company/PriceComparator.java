package com.company;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {

    public int compare(House h1, House h2) {
        if (h1 == h2) {
            return 0;
        }
        if (h1.getPrice() > h2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
