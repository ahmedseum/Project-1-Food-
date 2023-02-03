package Class;
import java.lang.*;
public class Jacksons{

    public void Food_Items()
    {
        System.out.println("1. Naga Jacks Bucket            - BDt:799");
        System.out.println("2. OG Jacks Bucket              - BDT:799");
        System.out.println("3. Sticky Jacks bucket          - BDT:780");
        System.out.println("4. Chicken Popcorn              - BDT:220");
        System.out.println("5. Tangy Jacks                  - BDT:220");
    }

    Jacksons(){};
    public Jacksons(int foodItems)
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
            Fooditem a = new Fooditem("Sticky Jacks bucket",780);
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