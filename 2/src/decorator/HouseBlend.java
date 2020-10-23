package decorator;

public class HouseBlend implements Beverage{
    public String getDescription() {
        return "Delicious HouseBlend";
    }

    public double cost(){
        return 0.89;
    }
}


