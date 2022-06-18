package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        //Uzd.1
        Scanner scanner = new Scanner(System.in);
        int g = 0;
        do {
            System.out.println("Ievadi veselo skaitli lidz 100: ");
            int num = scanner.nextInt();
            g = g + num;
            if (g > 100) {
                System.out.println("Gatavs");
            }
        } while (g <= 100);


        //Uzd.2
        System.out.println("Ievadi jauno skaitli: ");
        int number = scanner.nextInt();
        boolean primeNumber = false;

        if (number <= 1) {
            primeNumber = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                primeNumber = true;
                break;
            }
        }
        if (!primeNumber) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " try again");
        }

        //Uzd. 3
        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        String[] nameOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"};
        char[] myNameCharacters = {'L', 'A', 'U', 'R', 'A'};


        System.out.println("While");

        int a = 0;
        while (a < dayOfTheWeek.length) {
            System.out.print(dayOfTheWeek[a] + "\n");
            a++;
        }

        a = 0;
        while (a < nameOfTheWeek.length) {
            System.out.print(nameOfTheWeek[a] + "\n");
            a++;
        }

        a = 0;
        while (a < myNameCharacters.length) {
            System.out.print(myNameCharacters[a] + "\n");
            a++;
        }

        System.out.println("Do While\n");

        a = 0;
        do {
            System.out.println(dayOfTheWeek[a]);
            a++;
        } while (a < dayOfTheWeek.length);


        a = 0;
        do {
            System.out.println(nameOfTheWeek[a]);
            a++;
        } while (a < nameOfTheWeek.length);


        a = 0;
        do {
            System.out.println(myNameCharacters[a]);
            a++;
        } while (a < myNameCharacters.length);


        System.out.println("For Loop");

        for (int l = 0; l < dayOfTheWeek.length; l++) {
            System.out.println(dayOfTheWeek[l]);
        }

        for (int l = 0; l < nameOfTheWeek.length; l++) {
            System.out.println(nameOfTheWeek[l]);
        }

        for (int l = 0; l < myNameCharacters.length; l++) {
            System.out.println(myNameCharacters[l]);
        }

        System.out.println("For Each");

        for (int b : dayOfTheWeek) {
            System.out.println(b);
        }

        for (String c : nameOfTheWeek) {
            System.out.println(c);
        }

        for (char n : myNameCharacters) {
            System.out.println(n);
        }

        //Uzd. 4
        int[] numberO = new int[100];
        int w = 0;
        int o = 0;
        while (o < numberO.length && numberO.length <= 100) {
            if (w % 2 == 0) {
                numberO[o] = w;
                w++;
                o++;
            } else {
                w++;
            }
        }
        System.out.println(Arrays.toString(numberO));


    }
}