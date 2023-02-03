package Class;
import java.lang.*;
public class Chillox {

    public void Food_Items()
    {
        System.out.println("1. Pankha Wings                           - BDt:190");
        System.out.println("2. Chicken Cheese Burger                  - BDT:180");
        System.out.println("3. Fish Burger                            - BDT:250");
        System.out.println("4. Chicken Bacon Burger                   - BDT:230");
        System.out.println("5. Chicken Sausage Burger                 - BDT:240");
    }

    Chillox(){};
    public Chillox(int foodItems)
    {
        switch(foodItems)
        {
        case 1:
            {
                Fooditem a = new Fooditem("Pankha Wings",190);
            }

        case 2: 
        {
            Fooditem a = new Fooditem("Chicken Cheese Burger",180);
        }

        case 3:
        {
            Fooditem a = new Fooditem("Fish Burger",250);
        }

       case 4: 
    {
        Fooditem a = new Fooditem("Chicken Bacon Burger",230);
    }
    case 5:
    {
        Fooditem a = new Fooditem("Chicken Sausage Burger ",240);
    }
        }
    }
}
