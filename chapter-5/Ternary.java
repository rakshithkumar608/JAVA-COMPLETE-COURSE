

public class Ternary {
    public static void main(String[] args) {
        int age = 20;

        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        String numbers = (age % 2 == 0) ? "Even" : "odd";
        
        System.out.println(result);
        System.out.println(numbers);
    }
}
