import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pizza extends login{
    private int price;
    private int extraCheese = 100;
    private int extraToppings = 30;
    private int Backpack = 20;
    private int delivery = 100;
    String variety;
    String size;
    String Crust;
    String Cheese;
    String Topping;
    String Method;
    String ToppingsAdded;
    String Type;
    public void Type(String type){
        Type = type;
        if(type.equalsIgnoreCase("Veg")){
            this.price = 100;
            Veg();
        }
        else if(type.equalsIgnoreCase("Nonveg")){
            this.price = 150;
            NonVeg();
        }
        else{
            System.out.println("Invalid");
        }
    }
    public void Veg(){
       System.out.println("Our Veg Menu:-\n Classic Onion Capcicum \n Classic Corn \n Margherita \n Veggie Supreme \n Tandoori Panner \n Country Feast \n");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the selected pizza ");
       variety = sc.nextLine();
       List<String> validVariety = Arrays.asList("Classic Onion Capcicum","Classic Corn","Margherita","Veggie Supreme","Tandoori Panner","Country Feast");
       if(validVariety.contains(variety)) {
           this.price += 50;
           CustomizeSize();
       }
       else {
           System.out.println("Invalid");
       }
    }
    public void NonVeg(){
        System.out.println("Our NonVeg Menu:-\n Koosha Mangsho Pizza \n Malai Chingri Pizza \n Champaran Mutton Pizza \n Pepper Barbecue Chicken \n Chicken Sausage \n Chicken Dominator \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the selected pizza ");
        variety = sc.nextLine();
        List<String> validVariety = Arrays.asList("Koosha Mangsho Pizza","Malai Chingri Pizza","Champaran Mutton Pizza","Pepper Barbecue Chicken","Chicken Sausage","Chicken Dominator");
        if(validVariety.contains(variety)) {
            this.price += 100;
            CustomizeSize();
        }
        else {
            System.out.println("Invalid");
        }
    }
    public void CustomizeSize(){
        System.out.println("Sizes available :- \n Regular(Serves 1-+Rs25) \n Medium(Serves 2-+Rs75) \n Large(Serves 4-+Rs150) \n");
        System.out.println("Enter the Selected Size");
        Scanner sc = new Scanner(System.in);
        size = sc.nextLine();
        if (size.equalsIgnoreCase("Regular")) {
            this.price += 25;
            Customize();
        } else if (size.equalsIgnoreCase("Medium")) {
            this.price += 75;
            Customize();
        } else if (size.equalsIgnoreCase("Large")) {
            this.price += 150;
            Customize();
        } else {
            System.out.println("Invalid Size");
        }
    }
    public void Customize(){
        System.out.println("Customize Crust:- \n New Hand Tossed(+Rs20) \n 100% Wheat Thin Crust(+Rs30) \n Cheese Burst(+Rs60) \n Fresh Pan Pizza(+Rs50)");
        System.out.println("Enter the Selected Crust");
        Scanner sc = new Scanner(System.in);
        Crust = sc.nextLine();
        if(Crust.equalsIgnoreCase("New Hand Tossed")){
            this.price += 20;
        }
        else if(Crust.equalsIgnoreCase("100% Wheat Thin Crust")){
            this.price += 30;
        }
        else if(Crust.equalsIgnoreCase("Cheese Burst")){
            this.price += 60;
        }
        else if(Crust.equalsIgnoreCase("Fresh Pan Pizza")){
            this.price += 50;
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void addExtraChesse(String value){
        Cheese = value;
        if(value.equalsIgnoreCase("Yes")) {
            System.out.println("Yumm Extra cheese added!!");
            this.price += extraCheese;
        }
        else if (value.equalsIgnoreCase("No")){
            System.out.println("You missed the Chessy bite");
        }
        else{
            System.out.println("Invalid Output");
        }
    }
    public void addExtraTopping(String topping){
        Topping = topping;
        if(topping.equalsIgnoreCase("Yes")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Veg Toppings Available:-");
            System.out.println("Crisp Capsicum\nFresh Tomato\nPanner\nRed Pepper\nJalapeno\nBlack Olive\nGrilled Mushroom\nOnion\n");
            System.out.println("NonVeg Toppings Available:-\nPepper Barbecue Chicken\nPeri-Peri Chicken\nChicken Sausage\nChicken Tikka\nChicken Pepperoni\nChicken Keema\n");
            System.out.println("Enter the no of toppings to be added :- +Rs30 each");
            int a = sc.nextInt();
            String[] arr = new String[a];
            sc.nextLine();
            System.out.println("Enter the toppings to be added");
            for (int i=0; i<a; i++) {
                arr[i] = sc.nextLine();
            }
            System.out.println("Extra Toppings added");
            System.out.println("Toppings to be added are: "+ Arrays.toString(arr));
            ToppingsAdded = Arrays.toString(arr);
            this.price += extraToppings * arr.length;
        }
        else if(topping.equalsIgnoreCase("No")){
            System.out.println("Toppings Missing");
        }
        else {
            System.out.println("Invalid input");
        }
    }
    public void collectionMethod(String method){
        Method = method;
        if(method.equalsIgnoreCase("Dinein")){
            this.price = price;
        }
        else if (method.equalsIgnoreCase("Takeaway")){
            this.price += Backpack;
        }
        else if(method.equalsIgnoreCase("Delivery")){
            this.price += delivery+Backpack;
        }
        else{
            System.out.println("Invalid input");
        }
    }
   public void getBill(){
        System.out.println(this.price);
   }

    public void OrderDetails(){
        System.out.println("You have ordered "+""+variety+" "+size+" "+Crust+" Pizza");
        System.out.println("Extra Cheese:"+Cheese);
        System.out.println("Extra Topping:"+Topping);
        System.out.println("Toppings added: "+ToppingsAdded);
        System.out.println("Collection Method: "+Method);
    }
}
