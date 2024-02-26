package Strategy.withStrategyPattern;

import Strategy.withStrategyPattern.Strategy.DriveStrategy;
import Strategy.withStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehical extends Vehical{
    public SportsVehical() {
        super(new SportsDriveStrategy());
    }
}
