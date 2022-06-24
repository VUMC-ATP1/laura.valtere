package Classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {

//        int[] dayOfTheWeek;
//        dayOfTheWeek = new int[]{1, 2, 3};
        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(dayOfTheWeek.length);
        System.out.println(dayOfTheWeek[0]); //[0]-index number
        System.out.println(dayOfTheWeek[6]);
        System.out.println(dayOfTheWeek[dayOfTheWeek.length - 1]); //dayOfTheWeek.length = 7, (7 - 1 = 6)

        String[] nameOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thurssday", "Saturday", "Sunday"};
        System.out.println("Today is: " + nameOfTheWeek[1]);

        String[] fruits = new String[6];
        fruits[0] = "apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "strawberry";
        fruits[4] = "cherry";
        fruits[5] = "pineapple";

        System.out.println(fruits[3]);

        fruits[2] = "grape";

        char[] myNameCharacters = {'L', 'A', 'U', 'R', 'A'};
        System.out.println(myNameCharacters[2]);

        Random random = new Random();
        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(randomNumbers));

        // Collections (List, Map,  Queue)
        List<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("apple"); // [0]
        listOfFruits.add("kiwi"); // [1]
        listOfFruits.add("cherry"); // [2]

        System.out.println(listOfFruits.get(2));
        listOfFruits.remove(0);
        System.out.println(listOfFruits.get(0));



    }
}
