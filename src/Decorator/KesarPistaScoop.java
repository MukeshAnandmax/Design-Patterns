package Decorator;

public class KesarPistaScoop implements IceCream{

    private IceCream iceCream;

    public KesarPistaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+35;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+ "KesarPistaScoop, ";
    }
}
