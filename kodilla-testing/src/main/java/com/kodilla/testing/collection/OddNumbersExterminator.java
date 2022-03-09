package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumberList = new ArrayList<>();

        for (Integer element : numbers) {
            if (element % 2 == 0) {
                evenNumberList.add(element);
            }

        }
        return evenNumberList;

    }


}
