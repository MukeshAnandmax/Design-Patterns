package Strategy.withStrategyPattern;

public class StrategyClient {
    public static void main(String[] args) {
        Vehical vehical =  new GoodsVehical();
        vehical.drive();
    }
}
