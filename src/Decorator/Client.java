package Decorator;

public class Client {


    public static void main(String[] args) {

        IceCream iceCream =new ChocoChips(new KesarPistaScoop( new ChocolateSyrup(new VanillaCone())));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}

