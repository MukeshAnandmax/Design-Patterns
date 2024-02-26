package Strategy.withStrategyPattern;

import Strategy.withStrategyPattern.Strategy.DriveStrategy;
import Strategy.withStrategyPattern.Strategy.SportsDriveStrategy;

public class HeavyVehical extends  Vehical{
    public HeavyVehical() {
        super(new SportsDriveStrategy());
    }
}
