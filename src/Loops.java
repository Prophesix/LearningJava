import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRepeat = true;
//While Loop
        while (isRepeat){
            System.out.println("Play current song");
            System.out.println("Would you like to take this off repeat? Yes/No");
            String userInput = input.next();

            if( userInput.equalsIgnoreCase("Yes")){
                isRepeat = false;
            }
        }
        System.out.println("Playing NEXT song");
    }
}
