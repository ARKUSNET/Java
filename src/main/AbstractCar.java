package main;

/**
 * Created by a.kuspakov on 08.09.2016.
 */
public abstract class AbstractCar implements Car {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + 12;
    }

    protected int speed = 100;

    public void getDescription() {
        out("\n" + this.getClass().getSimpleName() + "Speed: " + speed + "\n" +
                "EngineVolume: " + getEngineVolume());
    }

    private void out(String str) {
        System.out.println(str);
    }
}
