public class MoreVehiclesDemo {
        int passengers;
        int wheels;
        int maxspeed;
        int burnup;
        public static void main(String[] args) {

            VehicleDemo car1 = new VehicleDemo();
            car1.passengers = 2;
            car1.wheels = 6;
            car1.maxspeed = 130;
            car1.burnup = 30;

            VehicleDemo bus1 = new VehicleDemo();
            bus1.passengers = 45;
            bus1.wheels = 4;
            bus1.maxspeed = 100;
            bus1.burnup = 45;

            double interval = 1.25;
            double distanceCar = car1.maxspeed * interval;
            double distanceBus = bus1.maxspeed * interval;

            System.out.println("car1 может проехать за 1 час 15 мин. расстояние в ");
            System.out.println(distanceCar + " км c" + car1.passengers);
            System.out.println("пассажирами.");
            System.out.println("bus1 может проехать за 1 час 15 мин. расстояние в ");
            System.out.println(distanceBus + " км c " + bus1.passengers );
            System.out.println("пассажирами");

    }
}
