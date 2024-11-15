

public class VehicleSpec implements Vehicle {
    private String id;
    private String vehicleType = null;
    private String model;
    private String colour;
    private double price;
    private int hpower;
    private String key;
    private String parkLocation;
    private String testKey;

    public VehicleSpec(String id, String vehicleType, String model, String colour, double price, int hpower) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.hpower = hpower;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHpower() {
        return hpower;
    }

    public void setHpower(int hpower) {
        this.hpower = hpower;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getParkLocation() {
        return parkLocation;
    }

    public void setParkLocation(String parkLocation) {
        this.parkLocation = parkLocation;
    }

    public String getTestKey() {
        return testKey;
    }

    public void setTestKey(String testKey) {
        this.testKey = testKey;
    }


    @Override
    public void getInFo() {
        System.out.println("\n       Vehicle Specs       ");
        System.out.println("Model       : " + this.model +  "\nColor       : " + this.colour +  "\nHorse Power : " + this.hpower + "\nPrice       : " + this.price+" $");
    }
}

