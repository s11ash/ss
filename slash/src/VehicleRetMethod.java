 class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

     public Vehicle(int i, int i1, int i2, int i3) {
     }

     double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}
public class VehicleRetMethod {
    public static void main(String[] args) {
        vehicles car = new vehicles();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        vehicles bus = new vehicles();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.println("авотмомбиль c " + car.passengers + " пассажирами");
        System.out.println("пройдет за полчаса путь " + distanceCar + " км ");
        System.out.println("автобус с " + bus.passengers + " пассажирами");
        System.out.println("пройдет за полчаса путь " + distanceBus + " км ");
    }
}