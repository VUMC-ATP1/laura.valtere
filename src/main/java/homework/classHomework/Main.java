package homework.classHomework;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        triangle1.a = 2;
        triangle1.b = 3;
        triangle1.c = 4;
        System.out.println("Triangle parameters are: " + triangle1.a + ", " + triangle1.b + ", " + triangle1.c);
        System.out.println("Triangle S equal to: " + (triangle1.a* triangle1.b)/2);

        triangle1.triangleEqual();
        System.out.println("Triangle Equal: " + triangle1.triangleEqual());

        triangle1.triangleIsoscele();
        System.out.println("Triangle isoscele: " + triangle1.triangleIsoscele());



        Triangle triangle2 = new Triangle(3,3,7);
        System.out.println("Triangle parameters are: " + triangle2.a + ", " + triangle2.b + ", " + triangle2.c);
        System.out.println("Triangle S equal to: " + (triangle2.a* triangle2.b)/2);

        triangle2.triangleEqual();
        System.out.println("Triangle Equal: " + triangle2.triangleEqual());

        triangle2.triangleIsoscele();
        System.out.println("Triangle isoscele: " + triangle2.triangleIsoscele());

    }
}
