import Class.*;
import Interfaces.*;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name,location,Phone_number;
        System.out.println("Welcome to your App");
        System.out.println("--------------------------");
        System.out.println("User name    :");
        name=sc.next();
        System.out.println("Phone Number :");
        Phone_number=sc.next();
        System.out.println("Location     :");
        location=sc.next();
        User_Profile pro=new User_Profile(){};
            pro.UserName(name);
            pro.getuserLocation(location);
            pro.getuserPhoneNUmber(Phone_number);
    //user input done
        ShopList shops=new ShopList();
        int shop_number=sc.nextInt();
        shops.User_Decision(shop_number);
        //shops decision done

        //user food decision
int food_decision=sc.nextInt();

switch (shop_number)
{
    case 1:
        SultansDine s= new SultansDine(food_decision);
        break;
    case 2:
        Kacchivai k=new Kacchivai(food_decision);
        break;
    case 3:
        Jacksons j=new Jacksons(food_decision);
        break;
    case 4:
        Chillox c=new Chillox(food_decision);
        break;
    case 5:
        PizzaBurg p=new PizzaBurg(food_decision);
        break;
}
// food decision done.
     TotalCost ff= new TotalCost();
ff.Cost();
Foodchat aa=new Foodchat();
aa.Show_foodList();
    }
}
