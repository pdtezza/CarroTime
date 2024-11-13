class Vehicle {
    private int id;
    private String model;

    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + id + ", Model: " + model;
    }
}