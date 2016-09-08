package lesson01;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car raceCar = new RaceCar();
        Car simpleCar = new SimpleCar();
        simpleCar.setSpeed(200);
        raceCar.getDescription();
        System.out.println(simpleCar.getSpeed());
        simpleCar.getDescription();
    }
}
