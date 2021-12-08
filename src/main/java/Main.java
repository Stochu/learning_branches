import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static UserDao userDao = new UserDao();

    public static void main(String[] args) {
        //createUser();
        System.out.println(userDao.getAllUsers());
        //userDao.deleteUser();
        updateUser();
        UserDao userDao = new UserDao();
        System.out.println(userDao.getAllUsers());
    }

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
        userDao.createUser(user);
        System.out.println("Utworzono usera: " + user);

    }

    public static void updateUser() {
        String name, lastname;
        int age, id;

        System.out.println("Wpisz ID użytkownika, którego dane chcesz zmienić: ");
        id = scanner.nextInt();

        System.out.println("Wpisz imię jakie użytkownik ma posiadać: ");
        name = scanner.next();

        System.out.println("Wpisz nazwisko jakie użytkownik ma posiadać: ");
        lastname = scanner.next();

        System.out.println("Wpisz wiek jaki użytkownik ma posiadać: ");
        age = scanner.nextInt();

        User user = new User(id, name, lastname, age);
        userDao.updateUser(user);


    }

//    public static void calculate() {
//        int x, y;
//
//        System.out.println("Type first number: ");
//        x = scanner.nextInt();
//
//        System.out.println("Type second number: ");
//        y = scanner.nextInt();
//
//        System.out.println("Sum: " + Calculator.add(x, y));
//        System.out.println("Substract: " + Calculator.substract(x, y));
//        System.out.println("Multiply: " + Calculator.multiply(x, y));
//        System.out.println("Divide: " + Calculator.divide(x, y));
//    }
//
//    public static void main(String[] args) {
//        calculate();
//        createUser();
//    }
}
