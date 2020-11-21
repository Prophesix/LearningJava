import java.util.Scanner;

public class Functions {
//Function definition
    public static void announceDevTeatime(){
        System.out.println("Waiting for dev teatime...");
        System.out.println("Type a random word to start...");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its dev teatime!");
    }

    public static void main(String[] args) {
//Function call
        System.out.println("Welcome to work...");
        announceDevTeatime();
        System.out.println("Write Code");
        System.out.println("Review Code");
        System.out.println("Deploy Code");
        announceDevTeatime();
        System.out.println("Promotion!!");

    }
}
