class Driver {
    private String driverName;
    private Vehicle vehicle;

    public Driver(String driverName, Vehicle vehicle) {
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

    public String getDriverName() {
        return driverName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void showInfo() {
        System.out.println("Driver Name: " + driverName);
        System.out.println("Associated Vehicle: " + vehicle);
    }
}
