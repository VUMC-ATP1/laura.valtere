package homework;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Ievadi skaitli");
        a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Your number is greater than or equal null");
        } else {
            System.out.println("Ievadi jauno skaitli");
        }
    }
}
