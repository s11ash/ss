class vehicles {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    vehicles(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }

    public vehicles() {

    }

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}

public class VehicleConstrDemo {
    public static void main(String[] args) {

        vehicles car = new vehicles(2, 4, 130, 30);
        vehicles bus = new vehicles(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers + " пассажирами " + "пройдет за 1 час " + distanceCar + " км.");
        System.out.println("Автобус с " + bus.passengers + " пассажирами " + " проедет за 1 час " + distanceBus + " км.");

    }
}