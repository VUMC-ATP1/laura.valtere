package homework;

public class FirstClass {

    public static void main(String[] args) {

        String island = "Malta";
        String greeting = "Hello!";
        String verb = "tell";
        System.out.println(greeting + " Let me " + verb + " tell you about beautiful island " + island);


        int iedzivotajuSkaits = 525285;
        System.out.printf("Maltas iedzivotaju skaits uz 2020 gadu ir %d\n", iedzivotajuSkaits);

        short maltasPlatiba = 316;
        System.out.printf("Bet platiba ir %d\n", maltasPlatiba);

        String maltasValoda = "Maltijas valoda";
        System.out.println("Malta runa " + maltasValoda);

        String maltasPilseta = "Valleta";
        System.out.println("Galvaspilseta ir " + maltasPilseta);

        boolean irES = true;
        if (irES) {
            System.out.printf("Malta ir ES dalibvalsts: %b\n", irES);
        } else {
            System.out.printf("Malta nav ES dalibvalsts: %b\n", irES);
        }

        char maltasValuta = '€';
        System.out.println("Maltas valuta ir: " + maltasValuta);

        String knowledgeLevel = "basic";
        String wish = "Good Luck!";
        System.out.println("Now you have a " + knowledgeLevel + " knowledge about Malta, " + wish);

        int a = 3;
        int b = 6;
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);

        int diff = b - a;
        System.out.println("Diff between b and a is: " + diff);

        int prod = a * b;
        System.out.println("Product of a and b is: " + prod);

        int div = b/a;
        System.out.println("Division of a and b is: " + div);

        int mod = b%a;
        System.out.println("Reminder of a and b is " + mod);


        int d = 1;
        int e = 1;
        System.out.println(d - e);

        int g = 3;
        int h = 4;
        System.out.println(g * h);

        int m = 9;
        int n = 3;
        System.out.println(m/n);

        int o = 4;
        int p = 6;
        System.out.println(o%p);

        int f = d - e;
        System.out.println(f);

        int i = g * h;
        System.out.println(i);

        int l = m/n;
        System.out.println(l);

        int q = o%p;
        System.out.println(q);
    }
}
