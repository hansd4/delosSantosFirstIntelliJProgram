import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello world!");
        scan.nextLine();
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Pleasure to be of service, " + name);
    }
}
