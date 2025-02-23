package Decorator;

public class ChocolateScoop implements IceCream{
    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+25;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ "ChocolateScoop, ";
    }
}
