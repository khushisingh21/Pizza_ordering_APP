import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        login log = new login();
        Pizza basePizza = new Pizza();
        boolean valid = log.gmail();
        if(valid==true){
            System.out.println("Email Valid");
            boolean valid1 = log.PhoneNumber();
            if(valid1 == true){
                System.out.println("Valid Number");
                System.out.println("OTP Sent");
                System.out.println("Enter the 6 digit OTP sent");
                Scanner sc = new Scanner(System.in);
                String Otp = sc.nextLine();
                log.name();
                log.address();
                System.out.println("Veg or NonVeg");
                String type = sc.nextLine();
                basePizza.Type(type);
                System.out.println("Do you want to add extra Chesse(+Rs100)");
                String  Ch = sc.nextLine();
                basePizza.addExtraChesse(Ch);
                System.out.println("Do you want to add Extra Topping");
                String topping = sc.nextLine();
                basePizza.addExtraTopping(topping);
                System.out.println("Delivery/Takeaway/Dinein");
                String method = sc.nextLine();
                basePizza.collectionMethod(method);
                System.out.println("Order Summary:-\n");
                log.det();
                basePizza.OrderDetails();
                System.out.println("Amount to be payed:- ");
                basePizza.getBill();
            }
            else{
                System.out.println("Invalid Number");
                System.out.println("Recheck Your Number");
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}