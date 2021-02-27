
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String val1 = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        Integer val2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double val3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean val4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + val1);
        System.out.println("You gave the integer " + val2);
        System.out.println("You gave the double " + val3);
        System.out.println("You gave the boolean " + val4);
    }
}
