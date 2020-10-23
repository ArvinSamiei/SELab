package decorator;

public abstract class condimentDecorator implements Beverage{

    Beverage beverage;

    public condimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public String getDescription(){
        return beverage.getDescription();
    }

    public double cost(){
        return beverage.cost();
    }

}
