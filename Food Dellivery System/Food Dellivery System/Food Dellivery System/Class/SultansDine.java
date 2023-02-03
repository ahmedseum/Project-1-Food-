package Class;
import java.lang.*;
public class SultansDine {

    public void Food_Items()
    {
        System.out.println("1. Kacchi(Basmati)         - BTD:269");
        System.out.println("2. Morag Polao             - BDT:240");
        System.out.println("3. Chicken Roast           - BDT:130");
        System.out.println("4. Beef Rezala             - BDT:180");
        System.out.println("5. Chicken Tandoori        - BDT:120");
    }
    SultansDine (){};
    public SultansDine(int foodItems)
    {
        switch(foodItems)
        {
        case 1:
            {
                Fooditem a =new Fooditem("Kacchi(Basmati)",269);
            }

        case 2: 
        {
            Fooditem a =new Fooditem("Morag Polao",240);
        }

        case 3:
        {
            Fooditem a =new Fooditem("Chicken Roast",130);
        }

       case 4: 
    {
        Fooditem a =new Fooditem("Beef Rezala",180);
    }
    case 5:
    {
        Fooditem a =new Fooditem("Chicken Tandoori",120);
 }
        }
    }
}