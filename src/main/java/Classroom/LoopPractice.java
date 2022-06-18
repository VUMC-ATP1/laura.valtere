package Classroom;

import java.util.ArrayList;
import java.util.List;

public class LoopPractice {
    public static void main(String[] args) {
        // do
        //Exercise: print 0-4

        System.out.println("START");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; // i +1 = 1, i+1 = 2....
        }
        System.out.println("END");

        System.out.println("START NEW");
        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--; // i -1 = 9, 9-1=8.....
        }
        System.out.println("END");


        System.out.println("Print all number using loop");
        int[] arr = {2, 4, 6, 10, 15};

        int num = 0;
        while (num < arr.length) {
            System.out.println(arr[num]);
            num++;
        }
        System.out.println("END");

        System.out.println("Print out even numbers from 0 to 10 using loop");

        int even = 0;
        while (even <= 10) {
            // !=0 make exception for 0
            if (even % 2 == 0 && even != 0) {
                System.out.printf("Number %d divided on 2%n", even);
            }
            even++;
        }

        System.out.println("Variant 2");
        num = 0;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.print(num + ", "); //without .printlt make a line of numbers
            }
            num++;
        }

        System.out.println("Variant 3 with DO");
        num = 0;
        do {
            System.out.printf(num + ", ");
            num++;
        } while (num < 10);

        System.out.println("Print out odd numbers from 0 to 10 using do while");
        num = 0;
        do {
            if (num % 2 != 0) {
                System.out.println("This is odd number: " + num);
            }
            num++;
        } while (num < 10);

        String[] countries = new String[]{"LV", "USA", "UK", "CZ", "PL"};
        i = 0;
        do {
            if (countries[i].equals("LV")) {
                System.out.println("Latvia");
            } else if (countries[i].equals("CZ")) {
                System.out.println("Czech");
            } else {
                System.out.println(countries[i]);
            }
            i++;
        } while (i < countries.length);

        for (int j = 0; j < countries.length; j++) {
            if (j == countries.length - 1) {
                System.out.println(countries[j]);
            } else {
                System.out.print(countries[j] + ", ");
            }
        }
        System.out.println();

        System.out.println("Print numbers to 100 using for loop");
        for (int j = 0; j <= 100; j++) {
            if (j > 50) {
                System.out.print(j + ", ");
            }
        }
        System.out.println();

        System.out.println("Create int[] with 0 to 100, print only even");
        int[] numbers = new int[100];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j;
        }
        for (int k = 0; k <= numbers.length; k++) {
            if (k % 2 == 0) {
                System.out.println("Even numbers: " + k);
            }
        }

        for (String country : countries) {
            if (country.equals("LV")) {
                System.out.println("Latvia");
            } else {
                System.out.println(country);
            }
        }

        System.out.println("Create int[] with 0 to 100, print all with for each");
        int[] numbers2 = new int[100];
        for (int j = 0; j < numbers2.length; j++) {
            numbers2[j] = j;
        }
        for (int num2 : numbers2) {
            System.out.print(num2 + ", ");
        }

        int houses = 50; //Print numbers that does not divided on 3
        int validHouse = 0;
        for (int j = 1; j < houses; j++) {
            if (j % 3 != 0 && j % 5 != 0) {
                System.out.printf("Deriga maja ir nr. %d%n", j);
                validHouse++;
            }
        }
        System.out.printf("Derigas majas ir %d\n", validHouse);

        System.out.println("Variant 2");
        int houseCount = 0;
        for (int j = 1; j <= 50; j++) {
            if (j % 3 == 0 || j % 5 == 0) {
                System.out.println("Numuri neder: " + j);
            }else{
                System.out.println("Numuri der: " + j);
                houseCount = houseCount + 1;
            }
        }
        System.out.println("Atbilst prasibai: \n" + houseCount);

        System.out.println("Variant 3");
        List<Integer> houses2 = new ArrayList<>();
        for (int o = 1; o <= 50; o++) {
            if (o % 3 == 0 || o % 5 == 0) {
                System.out.println("neder: " + o);
            }else {
                System.out.println("der: " + o);
                houses2.add(o);
            }
        }
        System.out.println("atbilst: " + houses2.size());
        System.out.println("der:");
        for (int houseNumber : houses2) {
            System.out.print(houseNumber + ", ");
        }

        String sentence = "Hello, my name is Laura";
        System.out.println();

        int count = 0;
        for (int c = 0; c < sentence.length(); c++) {
            if(sentence.charAt(c) == 'a') {
                count = count + 1;
            }
        }
        System.out.println("a skaits: " + count);

        for (String country : countries) {
            System.out.println(country);
            if (country.equals("CZ")) {
                System.out.println("found CZ, stop!");
                break;
            }
        }

        for (int j = 1; j <= 10; j++) {
            if (j > 4 && j < 9) { //skip numbers from 5 to 8
                continue;
            }
            System.out.print(j + ", ");
        }
    }
}
