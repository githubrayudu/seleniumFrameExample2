import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int quantity;
        double price=20 ;
       while(true){
             price=20 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sadas : ");
          quantity = sc.nextInt();
          if(quantity >= 5){
              System.out.println("you have discount of 10%");
              price = price - (price * 0.10);
              System.out.print("Each soda cost you : ");
          }
          else if(quantity < 5) {
              System.out.println("Sorry...You dont have any discount");
          }
           System.out.println( price );
           System.out.print("Your total order value is: ");
           System.out.println(price * quantity);
          }
    }
}
























