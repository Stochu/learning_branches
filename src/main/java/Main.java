import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void createUser() {
        String name, lastName;
        int age;

        System.out.println("Type a name: ");
        name = scanner.next();

        System.out.println("Type a last name: ");
        lastName = scanner.next();

        System.out.println("Type your age: ");
        age = scanner.nextInt();

        User user = new User(name, lastName, age);
        System.out.println("Utworzono usera: " + user.toString());
    }

    public static void calculate() {
        int x, y;

        System.out.println("Type first number: ");
        x = scanner.nextInt();

        System.out.println("Type second number: ");
        y = scanner.nextInt();

        System.out.println("Sum: " + Calculator.add(x, y));
        System.out.println("Substract: " + Calculator.substract(x, y));
        System.out.println("Multiply: " + Calculator.multiply(x, y));
        System.out.println("Divide: " + Calculator.divide(x, y));
    }

    public static void main(String[] args) {
        calculate();
        createUser();
    }
}
