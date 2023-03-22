package questions_day_1and2;

class Vehicle {
    private int fuelCapacity;
    private int maxSpeed;

    public Vehicle(int fuelCapacity, int maxSpeed) {
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
    }

    // Getters and setters

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle {
    private String model;

    public Car(int fuelCapacity, int maxSpeed, String model) {
        super(fuelCapacity, maxSpeed);
        this.model = model;
    }

    // Getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Car specific behavior

    public void drive() {
        System.out.println("Driving a car: " + model);
    }
}

// Composition
class Car2 {
    private String model;
    private Vehicle vehicle;

    public Car2(int fuelCapacity, int maxSpeed, String model) {
        this.vehicle = new Vehicle(fuelCapacity, maxSpeed);
        this.model = model;
    }

    // Getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelCapacity() {
        return vehicle.getFuelCapacity();
    }

    public void setFuelCapacity(int fuelCapacity) {
        vehicle.setFuelCapacity(fuelCapacity);
    }

    public int getMaxSpeed() {
        return vehicle.getMaxSpeed();
    }

    public void setMaxSpeed(int maxSpeed) {
        vehicle.setMaxSpeed(maxSpeed);
    }

    // Car specific behavior

    public void drive() {
        System.out.println("Driving a car: " + model);
    }
}


