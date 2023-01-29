import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = myName.nextLine();
        sayHello (userName);
    }

    private static void sayHello(String name) {
        System.out.println("Hello " + name);
        System.out.println("Daag " + name);
        System.out.println("Hoi " + name);
        System.out.println("Zondag 29-jan " + name);
    }
}

