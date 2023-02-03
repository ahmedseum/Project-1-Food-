package Class;

public class Fooditem {
    protected String Food_Name;
    protected double Food_Cost;
    public Fooditem(String Food_name,double Food_Cost)
    {
        this.Food_Name=Food_name;
        this.Food_Cost=Food_Cost;

    }

    public double getFood_Cost() {
        return Food_Cost;
    }
    public String getFood_Name()
    {
        return Food_Name;
    }
}