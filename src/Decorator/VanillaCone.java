package Decorator;

public class VanillaCone implements IceCream{

    private IceCream iceCream;

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public VanillaCone() {
    }

    @Override
    public int getCost() {

        if(iceCream==null){
            return 10;
        }else {
            return iceCream.getCost()+10;
        }

    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return "VanillaCone, ";
        }else {
            return iceCream.getDescription()+ "VanillaCone, ";
        }
    }
}
