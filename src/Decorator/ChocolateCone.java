package Decorator;

public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public ChocolateCone() {
    }

    @Override
    public int getCost() {

        if(iceCream==null){
            return 12;
        }else {
            return iceCream.getCost()+12;
        }

    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return "ChocolateCone, ";
        }else {
            return iceCream.getDescription()+ "ChocolateCone, ";
        }
    }
}
