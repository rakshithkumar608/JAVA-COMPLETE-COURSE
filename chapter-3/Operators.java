public class Operators {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);
        int b = 10;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b);

        //  Arithemetic Operators (+, -, *, /, %)

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational Operators (==, !=, >, <, >=, <=)

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //  Logcal Operators (&&, ||)

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(!true);
        System.out.println(!false);


        //  Assignment operators(=, +=, -=, *=, /=, %=)

    }
}
