package Strategy.withStrategyPattern;

import Strategy.withStrategyPattern.Strategy.DriveStrategy;
import Strategy.withStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehical extends Vehical{
    public GoodsVehical() {
        super(new NormalDriveStrategy());
    }
}
