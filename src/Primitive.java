import java.util.Scanner;

public class Primitive {

    public static void main(String[] args) {
//Boolean, int, double, char are primitives
        int studentAge = 15;
        double studentGPA = 3.0;
        char studentFirstInitial = 'J';
        char studentLastInitial = 'S';
        boolean perfectAttendance = true;
        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(perfectAttendance);
//Strings (reference type build out of chars)
        String studentFirstName = "Joe";
        String studentLastName = "Schmoe";
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
//charAt allows access to letter in string (array index)
        char charatFirstInitial = studentFirstName.charAt(0);
        char charatLastInitial = studentLastName.charAt(0);
        System.out.println("Char at First Name initial: " + charatFirstInitial);
        System.out.println("Char at Last Name initial: " + charatLastInitial);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + studentGPA);
        System.out.println("What would you like to update the GPA to? (AS DOUBLE)");
// Scanner to get input from user, requires import statement at BOF
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of: " + studentGPA + ".");
    }
}
