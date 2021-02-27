
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int number = scan.nextInt();
        double tax;
        
        if (number <= 4999){
            System.out.println("No tax!");
        } else if (number >= 5000 && number <= 24999) {
            tax = 100 + ( number - 5000 ) * .08;
            System.out.println("Tax: " + tax);
        } else if (number >= 25000 && number <= 54999) {
            tax = 1700 + ( number - 25000 ) * .10;
            System.out.println("Tax: " + tax);
        } else if (number >= 55000 && number <= 199999) {
            tax = 4700	+ ( number - 55000 ) * .12;
            System.out.println("Tax: " + tax);
        } else if (number >= 200000 && number <= 999999) {
            tax = 22100 + ( number - 200000 ) * .15;
            System.out.println("Tax: " + tax);
        } else if (number >= 1000000) {
            tax = 142100 + ( number - 1000000 ) * .17;
            System.out.println("Tax: " + tax);
        }
    }
}
