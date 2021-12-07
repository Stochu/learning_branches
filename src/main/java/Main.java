import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public void createUser() {
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

    public static void main(String[] args) {

    }
}
