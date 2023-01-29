import java.util.Scanner;

class Main {
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
            System.out.println("Zondag-1 29-jan " + name);
            System.out.println("Zondag-2 29-jan " + name);
            System.out.println("Zondag-3 29-jan " + name);

    }

}

