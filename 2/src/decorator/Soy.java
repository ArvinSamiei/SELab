package decorator;

public class Soy extends condimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " +  this.addedGetDescription();
    }

    private String addedGetDescription() {
        return "with soy";
    }

    @Override
    public double cost() {
        return super.cost() + addedCost();
    }

    private double addedCost(){
        return  0.15;
    }
}


