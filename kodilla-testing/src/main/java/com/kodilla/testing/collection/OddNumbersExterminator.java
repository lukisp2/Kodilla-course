package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumber = new ArrayList<>();

        for (Integer element : numbers) {
            if (element % 2 == 0) {
                evenNumber.add(element);
            }

        }
        return evenNumber;

    }


}
