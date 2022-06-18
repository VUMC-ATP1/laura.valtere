package Classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Enter number:");
            int answer = scanner.nextInt();
            if (answer < 1 && answer > 10) {
                System.out.println("not correct, try again");
            } else if (answer == randomNumber) {
                System.out.println("guessed! " + answer);
                isGuessed = true;
            } else {
                System.out.println("not guessed");
            }
        }


    }
}
