import java.util.Scanner;
import java.lang.String;
public class dynamic {
    public static void main(String[] args) {
        String productname;
        int no_of_repetitions = 0;
        while (no_of_repetitions < 5) {
            no_of_repetitions++;
            double total;
            Scanner sc = new Scanner(System.in);

            productname = sc.nextLine();
                System.out.print("Enter the mrp per product: ");
                double mrp = sc.nextDouble();
                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                if (quantity > 5 && mrp >= 500) {
                    System.out.println("You have 10% discount");
                    mrp = mrp - mrp * 0.10;
                } else if (quantity > 5 || mrp >= 500) {
                    System.out.println("You have Special discount of 5% for puchasing morethan 500 rupees");
                    mrp = mrp - mrp * 0.05;
                } else {
                    System.out.println("You dont have any discount");
                }
                System.out.println("price per unit of " + productname + " is: " + mrp);
                total = mrp * quantity;
                System.out.println("your total order value is: " + total);
        }
    }
}


