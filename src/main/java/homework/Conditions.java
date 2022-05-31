package homework;

public class Conditions {

    public static void main(String[] args) {

        System.out.println("Before condition check");

        if (20 > 18) {
            System.out.println("yes, 20 > 18");
        }

        System.out.println("After condition check");

        int age = 20;
        if (age >= 18) {
            System.out.println("You can go vote");
        } else {
            System.out.println("you cant go vote");
        }
        System.out.println("Thank you");


        int currentTime = 10;
        if (currentTime <= 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        int a = 10;
        int b = 20;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        max = (a >b) ? a : b;
        System.out.println(max);
        System.out.println(Math.max(a, b));


        int number = 5;
        if (number <= 0) {
            System.out.println("Number is less orequal then 0");
        } else if (number > 3) {
            System.out.println("Number is greater than 3");
        } else {
            System.out.println(".....");
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not incorrect day of the week");
        }

    }
}
