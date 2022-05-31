public class MyOwnHomework {
    public static <Scanner> void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        int midValue = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println(midValue);
    }
}