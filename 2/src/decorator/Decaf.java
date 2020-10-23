package decorator;

public class Decaf  implements Beverage{
    public String getDescription() {
        return "Delicious Decaf";
    }

    public double cost(){
        return 1.99;
    }
}
