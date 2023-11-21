package SampleClasses;

import java.util.*;

public class FindErrorNums {

    public static void main(String[] args) {

//        Credit credit = new Credit(9,400.00);
////        Loan loan = new Loan(12,700.00);
//        Optional<Credit> credit1 = Optional.of(credit);
//        System.out.println(credit1);
//        credit1.map(Loan::new).orElseThrow();

        int[] numbers = {1, 2, 3, 4, 5, 6, 2, 8, 9, 10, 10}; // Example array

        int[] errorNumbers = findErrorNumbers(numbers);

        if (errorNumbers.length > 0) {
            System.out.println("The error numbers are:");
            for (int errorNumber : errorNumbers) {
                System.out.println(errorNumber);
            }
        } else {
            System.out.println("No error numbers found in the array.");
        }

    }

    public static int[] findErrorNumbers(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find numbers with frequency more than 1 (error numbers)
        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
