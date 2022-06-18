package homework.classHomework;

public class Triangle {

    public int a;
    public int b;
    public int c;

    public Triangle() {

    }


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean triangleEqual() {
        return (a == b && a == c);
    }

    public boolean triangleIsoscele() {
        return (a == b || b == c || c == a);
    }

}
