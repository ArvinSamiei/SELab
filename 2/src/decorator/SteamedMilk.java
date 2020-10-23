package decorator;

public class SteamedMilk extends condimentDecorator {
    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " +  this.addedGetDescription();
    }

    private String addedGetDescription() {
        return "with milk";
    }

    @Override
    public double cost() {
        return super.cost() + addedCost();
    }

    private double addedCost(){
        return  0.1;
    }
}


