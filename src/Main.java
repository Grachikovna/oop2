public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Scott ", 2);
        Car car = new Car("Porsche ", 4);
        Truck truck = new Truck("Камаз ", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(new CarMaintenance[]{bicycle, truck, car});
    }
}