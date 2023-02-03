package Class;

import Interfaces.*;

public class Foodchat implements IChart {
 Fooditem Food_list_with_cost[]=new Fooditem[3];

    public int sum=0;
    public void addFood_name_Cost( Fooditem a)
    {
        for(int i=0;i<3;i++)
        {
            Food_list_with_cost[i]=null;
            if(Food_list_with_cost[i]==null)
            {
              Food_list_with_cost[i]=a;
                System.out.println("Taking input");
                break;
            }
            else{
                System.out.println("Sorry");
                break;
            }
        }
    }

    public  void Show_foodList()
    {
        for(int i=0;i<3;i++)
        {
            if(Food_list_with_cost[i]!=null)
            {
                System.out.println("Showing food items");
                System.out.println("Food Name is : "+Food_list_with_cost[i].getFood_Name());
                System.out.println("["+i+1+"]"+Food_list_with_cost[i].getFood_Cost());
            }
        }
    }
    public void add_Total_Cost() {
        for(int i=0;i<3;i++)
        {
            sum+=Food_list_with_cost[i].getFood_Cost();

        }

    }
}
