public class Tower {
    public String brand;
    public String model;
    private Double price;

    public String getFullName() {
        return brand + " " + model + " " + price;
    }

    public String getDeveloper() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    private Double getPrice() {
        return price;
    }
}
