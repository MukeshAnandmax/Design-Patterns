package Strategy.withStrategyPattern;

import Strategy.withStrategyPattern.Strategy.DriveStrategy;

public class Vehical {

    DriveStrategy driveStrategy;

    public Vehical(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void  drive(){
        driveStrategy.drive();
    }
}
