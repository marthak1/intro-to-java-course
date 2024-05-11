package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {
    int calculatedSumOfEvens = 0;
    int calculatedSumOfOdds = 0;

    // public List<String> fizzBuzz(List<Integer> numbers) {

    // TODO - Implement this method such that
    // it creates a list where for each element of the input list ${numbers}
    // - if the ${element} is divisible by 3, it adds “Fizz” to the list
    // - if the ${element} is divisible by 5, it adds “Buzz” to the list
    // - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the
    // list
    // - it adds the element to the list in any other case
    // - it returns the constructed list
    // throw new RuntimeException("Not implemented");
    // List<String> fizzbuzz = new ArrayList<>();

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            } else if (number % 3 == 0) {
                result.add("Fizz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(number.toString());
            }
        }
        return result;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        // - it returns the month corresponding to the input ${number}
        // - if the ${number} is invalid, the method should return "Invalid month
        // number"
        // throw new RuntimeException("Not implemented");
        String whichmonth = "Invalid month number";
        switch (number) {
            case 1:
                whichmonth = "January";
                break;
            case 2:
                whichmonth = "Febuary";
                break;
            case 3:
                whichmonth = "March";
                break;
            case 4:
                whichmonth = "April";
                break;
            case 5:
                whichmonth = "May";
                break;
            case 6:
                whichmonth = "June";
                break;
            case 7:
                whichmonth = "July";
                break;
            case 8:
                whichmonth = "August";
                break;
            case 9:
                whichmonth = "September";
                break;
            case 10:
                whichmonth = "October";
                break;
            case 11:
                whichmonth = "November";
                break;
            case 12:
                whichmonth = "December";

                break;

            default:
                break;
        }
        for (int i = 0; i <= 12; i++) {
            if ((i <= 12)) {
                System.out.print(whichmonth);
            } else {
                System.out.print("Invalid month number");
            }
        }

        return whichmonth;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        // - creates and initialises a list of 100 numbers - from 1 to 100
        // - determines the sum of all the even numbers in the list
        // - determines the sum of all the odd numbers in the list
        // - returns a map with two entries:
        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        // throw new RuntimeException("Not implemented");

        Map<String, Integer> result = new HashMap<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                calculatedSumOfEvens += i;
            } else {
                calculatedSumOfOdds += i;
            }
        }

        result.put("SumOfEvens", calculatedSumOfEvens);
        result.put("SumOfOdds", calculatedSumOfOdds);
        return result;
    }

    public static List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        // - it takes an array list of integers
        // - it returns the list in reverse order
        // throw new RuntimeException("Not implemented");
        // List<Integer> reverseint = new ArrayList<Integer>(numbers.size());
        // numbers.size();

        // Use Collections.reverse() to reverse the list
        List<Integer> reversedList = new ArrayList<>(numbers);

        // Reverse the order of elements using Collections.reverse
        Collections.reverse(reversedList);

        return reversedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        List<Integer> reversedList = reverse(originalList);

        System.out.println("Original list: " + originalList);
        System.out.println("Reversed list: " + reversedList);
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
