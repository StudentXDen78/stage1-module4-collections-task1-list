package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public static LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer element : sourceList) {
            if (element % 2 != 0) newList.addFirst(element);
            else newList.addLast(element);
        }
        return newList;
    }

    public static void main(String[] args){
        Integer[] c = new Integer[]{2, 14, 3, 6, 5, 7};
        List<Integer> a = new ArrayList<>(List.of(c));
        createLinkedList(a);
    }
}
