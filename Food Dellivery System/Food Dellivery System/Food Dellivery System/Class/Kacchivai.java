 package Class;
import java.lang.*;
public class Kacchivai {

    public void Food_Items()
    {
        System.out.println("1. Basmati Kacchi            - BDT:270");
        System.out.println("2. Kacchi Khadok             - BDT:430");
        System.out.println("3. Plain Polao               - BDT:150");
        System.out.println("4. Chicken Roast             - BDT:120");
        System.out.println("5. Chicken Kabab             - BDT:80");
    }

    Kacchivai(){};
    public Kacchivai(int foodItems)
    {
        switch(foodItems)
        {
        case 1:
            {
                Fooditem a = new Fooditem("Basmati Kcchi",270);
            }

        case 2: 
        {
            Fooditem a = new Fooditem("Kacchi Khadok",430);
        }

        case 3:
        {
            Fooditem a = new Fooditem("Plain polao",150);
        }

       case 4: 
    {
        Fooditem a = new Fooditem("Chicken Roast",120);
    }
    case 5:
    {
        Fooditem a = new Fooditem("Chicken Kabab",430);
    }

        }
    }
}

