package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

   private final OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    public void before() {
        System.out.println("The system is to execute test.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("The test was executed.");
    }


    @BeforeAll
    public static void beforeAll() {
        System.out.println("All tests finished.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite is now ended.");
    }

    @DisplayName("Test is to check behavior of empty list.")
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        List<Integer> list = new ArrayList<>();

        //When
        List<Integer> testResultList;
        testResultList = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing: " + testResultList);

        //Then
        List<Integer> listExpected = new ArrayList<>();
        Assertions.assertEquals(listExpected, testResultList);
    }

    @DisplayName("Test is to check behavior of full list.")
    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add((Integer) i);
        }

        //When
        List<Integer> testResultList;
        testResultList = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing List: " + testResultList);

        //Then
        Integer integers[] = new Integer[]{2, 4, 6, 8, 10};
        List<Integer> listExpectedArrays = Arrays.asList(integers);
        Assertions.assertEquals(listExpectedArrays, testResultList);
    }
}
