package main;

/**
 * Created by a.kuspakov on 08.09.2016.
 */
public class RaceCar extends AbstractCar {
    RaceCar(){
        speed = 200;
    }

    @Override
    public double getEngineVolume() {
        return 3.5;
    }
}
