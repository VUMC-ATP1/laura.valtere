package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x > 0);

        int x = 1;
        System.out.println(x < 0);

        int x = 6;
        System.out.println(x > 5 && x < 10);

        int x = 5;
        System.out.println(x <= 5 && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println((x * x) > 10);


        int month = 6;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break:
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }



        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b)
        System.out.println("a ir lielaks par b un c");
    if else if (b > c) {
            System.out.println("b ir lielaks par a un c");
        }else{
            System.out.println("c ir lielaks par a un b");
        }

        Scanner scanner = new Scanner(System.in);
    String krasa = "Sarkana";
        System.out.println("Ievadi luksafora krasu");
    krasa = scanner.nextLine();
    if (krasa == 'Sarkana') {
        System.out.println(krasa + "gajeniem jastav un gaidit zalo signalu");
    } else if (krasa == 'Dzeltena') {
        System.out.println(krasa + "gajeniem vel jagaida zalo signalu");
    } else if (krasa == 'Zala') {
        System.out.println("gajenam driks iet pari celai");
    } else {
        System.out.println("Luksaforam nav tadas krasas (ievadi: Sarkana,Dzeltena,Zala");
    }


    //krasa.equals("Sarkans");
    //krasa.equals("Dzeltens");
    //krasa.equals("Zals");
    }

    public static void main(String[] args) {
        printBusinessCard("Laura", "Valtere", 28208207,1990);
        printBusinessCard("Laura", "Valtere", 28208207,1990);
        printBusinessCard("Laura", "Valtere", 28208207,1990);

    }

    public static void printBusinessCard(String name, String surname, int number, int year) {
        System.out.printf("Vards: %s \n", name);
        System.out.printf("Uzvards: %s \n", surname);
        System.out.printf("Numurs: %d \n", number);
        System.out.printf("Dzimsanas gads: %d \n", year);
    }

    public static void main(String[] args) {
        printBusinessCardTwo("Kapusta", "Salat", 28938726,1999);
        printBusinessCardTwo("Liga", "Kalnina", 28733651, 1987);
    }

    public static void printBusinessCardTwo(String name, String surname, int number, int year) {
        System.out.printf("Vards: %s \n", name);
        System.out.printf("Uzvards: %s \n", surname);
        System.out.printf("Numurs: %d \n", number);
        System.out.printf("Dzimsanas gads: %d \n", year);
    }

    public static void main(String[] args) {
        sum(4,10);
        average(10,2,4);
    }


    public static int sum(int x, int y) {
        return x*y;
    }


    public static double average(double a, double b, double c) {
        return double;
            }
            
}