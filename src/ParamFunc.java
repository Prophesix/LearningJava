import java.util.Scanner;

public class ParamFunc {
    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100,.2,.08);
        System.out.println("Total meal cost: " + groupTotalMealPrice);
        System.out.println("How many people will split the bill?");
        Scanner input = new Scanner(System.in);
        int inputNumberOfPeople = input.nextInt();
        double individualMealPrice = groupTotalMealPrice / inputNumberOfPeople;
        System.out.println("Cost per person when split between "+ inputNumberOfPeople + " people: " + individualMealPrice);

    }
}
