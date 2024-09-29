package org.example;

import java.util.Arrays;

public class W3 {

    public static void main(String[] args) {
        System.out.println("Summe von 5 und 6: " + calculateSum(5, 6));
        System.out.println("Summe von 10 und 20: " + calculateSum(10, 20));

        String words = "One Two Three Four five";
        System.out.println("Anzahl der Wörter: " + countWordsInString(words));
        System.out.println("Anzahl der Wörter in 'Hello World': " + countWordsInString("Hello World"));

        String originalStr = "Hello";
        System.out.println("Reversed string: " + reverseAString(originalStr));
        System.out.println("Reversed string: " + reverseAString("Java"));

        int[] myArray = {1, 5, 10, 25};
        System.out.println("The sum of the array is: " + sumArray(myArray));
        System.out.println("The sum of another array is: " + sumArray(new int[]{2, 3, 4}));

        String myStr = "Hello";
        char[] charArray = myStr.toCharArray();
        System.out.println("First character of the string: " + charArray[0]);
        System.out.println("First character of 'World': " + "World".toCharArray()[0]);

        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        System.out.println("Sorted cars:");
        for (String car : cars) {
            System.out.println(car);
        }

        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        System.out.println("The average age is: " + calculateAverage(ages));
        System.out.println("The average age of {30, 40, 50} is: " + calculateAverage(new int[]{30, 40, 50}));

        System.out.println("The lowest age in the array is: " + findLowestAge(ages));
        System.out.println("The lowest age in {12, 45, 23} is: " + findLowestAge(new int[]{12, 45, 23}));
    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static int countWordsInString(String text) {
        return text.split("\\s").length;
    }

    public static String reverseAString(String text) {
        String reversedStr = "";
        for (int i = 0; i < text.length(); i++) {
            reversedStr = text.charAt(i) + reversedStr;
        }
        return reversedStr;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static float calculateAverage(int[] ages) {
        float sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / ages.length;
    }

    public static int findLowestAge(int[] ages) {
        int lowestAge = ages[0];
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        return lowestAge;
    }
}
