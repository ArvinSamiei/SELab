package decorator;

public class Mocha extends condimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " +  this.addedGetDescription();
    }

    private String addedGetDescription() {
        return "with mocha";
    }

    @Override
    public double cost() {
        return super.cost() + addedCost();
    }

    private double addedCost(){
        return  0.2;
    }
}

