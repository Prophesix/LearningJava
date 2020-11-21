import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args) {
//Control flow
//Pick a number between 1-10, if < 5 print one statement if < 5 print another
        System.out.println("Pick a number between 1 and 10...");
            Scanner scanner = new Scanner(System.in);
            int inputNum = scanner.nextInt();

        if (inputNum <= 5){
            System.out.println("You will have good luck");
        }
        else{
            System.out.println("You will have bad luck");
        }
    }
}
