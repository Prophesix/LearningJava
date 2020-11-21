import java.util.Scanner;
//Code challenge: Ask a multi choice question and get users input, give feedback on correct/incorrect
public class MultiChoiceQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What state is in the USA? (Pick one)");
        System.out.println("A : Colorado");
        System.out.println("B : Norway");
        System.out.println("C : Egypt");
        System.out.println("D : China");
        String userInput = input.next();
        if ( userInput.equalsIgnoreCase("A")){
            System.out.println("Your answer is correct");
        }
        else{
            System.out.println("Your answer is incorrect");
        }
    }
}
