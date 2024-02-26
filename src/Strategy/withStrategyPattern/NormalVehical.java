package Strategy.withStrategyPattern;

import Strategy.withStrategyPattern.Strategy.DriveStrategy;
import Strategy.withStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehical extends Vehical{
    public NormalVehical() {
        super(new NormalDriveStrategy());
    }
}
