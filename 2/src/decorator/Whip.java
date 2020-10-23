package decorator;

public class Whip extends condimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " +  this.addedGetDescription();
    }

    private String addedGetDescription() {
        return "with whip";
    }

    @Override
    public double cost() {
        return super.cost() + addedCost();
    }

    private double addedCost(){
        return  0.1;
    }
}


