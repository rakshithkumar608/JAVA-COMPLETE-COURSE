

public class conditional {
    public static void main(String[] args) {

        int x = 5;
        int y = 17;
        int z = 10;

        if (x>y && x>z) {
            System.out.println("Hello");
        } else if(y>x && y>z) {
            System.out.println("Bye");
        } else {
            System.out.println("Welcome");
        }
    }
}
