package Class;
import java.lang.*;
public class PizzaBurg{


    public void Food_Items()
    {
        System.out.println("1. Cheese Fountain            - BDT:200");
        System.out.println("2. Meaty Onion                - BDT:250");
        System.out.println("3. Cheddar Cream              - BDT:276");
        System.out.println("4. Tender Beef                - BDT:290");
        System.out.println("5. Juicy Bomb                 - BDT:300");
    }

    PizzaBurg(){};
    public PizzaBurg(int foodItems)
    {
        switch(foodItems)
        {
            case 1:
            {
                Fooditem a = new Fooditem("Naga Jacks Bucket",799);
            }

            case 2:
            {
                Fooditem a = new Fooditem("OG Jacks Bucket",799);
            }

            case 3:
            {
                Fooditem a = new Fooditem("Sticky Jacks bucket",799);
            }

            case 4:
            {
                Fooditem a = new Fooditem("Chicken Popcorn",220);
            }
            case 5:
            {
                Fooditem a = new Fooditem("Tangy Jacks ",220);
            }


        }
    }

}