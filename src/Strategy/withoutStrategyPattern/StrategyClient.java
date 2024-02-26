package Strategy.withoutStrategyPattern;

public class StrategyClient {
    public static void main(String[] args) {
        Vehical vehical =  new HeavyVehical();
        vehical.drive();
    }
}
