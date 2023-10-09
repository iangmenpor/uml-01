public class RAM {
    public String brand;
    public String capacity;
    private Double price;

    public String getFullName() {
        return brand + " " + capacity + " " + price;
    }

    public String getDeveloper() {
        return brand;
    }

    public String getModel() {
        return capacity;
    }

    private Double getPrice() {
        return price;
    }
}
