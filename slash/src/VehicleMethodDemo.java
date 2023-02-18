 class vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    int interval;
    int value;


     double distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("пройдет путь, равный" + value + " км. ");

         return value;
     }
}

public class VehicleMethodDemo {
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

        System.out.println("автомобиль c" + car.passengers + " пассажирами");
        System.out.println("пройдет за полчаса путь " + distanceCar + " км.");
        System.out.println("автобус c " + bus.passengers + " пассажирами");
        System.out.println("пройдет за полчаса путь " + distanceBus + " км.");





        System.out.println("пройдет за полчаса путь " + car.distance(time) + " км.");

        if (car.distance(time) > bus.distance(time))
            System.out.println("Разница " + (car.distance(time) - bus.distance(time)) + " км в пользу автомобиля");
    }
}