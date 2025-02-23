package Decorator;

public class VanillaScoop implements IceCream{
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ "VanillaScoop, ";
    }
}
