package Class;

public class ShopList {
    public ShopList()
    {
        System.out.println("1. Sultans Dine ");
        System.out.println("2. Kacchi Vai");
        System.out.println("3. Jacksons Fried Chicken");
        System.out.println("4. Chillox");
        System.out.println("5. PizzaBurg");
    }
    public void User_Decision(int shop_number)
    {
        switch(shop_number)
        {
            case 2:
            {
                Kacchivai kacchi= new Kacchivai();
                kacchi.Food_Items();
                break;
            }
            case 1:
            {
                SultansDine sultans= new SultansDine();
                sultans.Food_Items();
                break;
            }
            case 3:
            {
                Jacksons jacksons=new Jacksons();
                jacksons.Food_Items();
                break;
            }
            case 4:
            {   
                Chillox chillox= new Chillox();
                chillox.Food_Items();
                break;
            }
           
            default:
            {

                break;
            }

        }
    }

}
