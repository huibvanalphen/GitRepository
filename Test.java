import java.util.Scanner;

public class Test {
    public static void zegWat(){

        Scanner myName = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = myName.nextLine();

        for (int i = 0; i < 5; i++) {
            sayHello(userName);
        }

        static var i = 0;
        while (i < 5) {
            sayHello(userName);
            i++;
        }
    }

    private static void sayHello (String name) {
        System.out.println("Hello " + name);
    }

}

