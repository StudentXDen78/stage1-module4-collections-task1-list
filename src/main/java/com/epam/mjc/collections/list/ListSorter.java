package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void sort(List<String> sourceList) {
        Comparator<String> a = new ListComparator();
        Collections.sort(sourceList, a);
    }

    public static void main(String[] args) {
        String[] c = new String[]{"-5", "-12", "0", "20", "9", "-20", "37"};
        List<String> a = new ArrayList<>(List.of(c));
        sort(a);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer number1 = Integer.parseInt(a);
        Integer number2 = Integer.parseInt(b);
        return function(number1) - function(number2);
    }

    private int function(Integer x) {
        // ascending order of function 5x^2+3
        return 5 * (int) Math.pow(x, 2) + 3;
    }
}

