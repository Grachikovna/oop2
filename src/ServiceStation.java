public class ServiceStation {
    public void check(CarMaintenance[] transports) {
        for (CarMaintenance transport : transports) {
            transport.service();
        }


    }
}

