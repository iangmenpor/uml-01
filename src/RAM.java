public class RAM {
    public String brand;
    public String capacity;
    public Double price;

    public String getFullName() {
        return brand + " " + capacity + " " + price;
    }

    public String getDeveloper() {
        return brand;
    }

    public String getModel() {
        return capacity;
    }

    public Double getPrice() {
        return price;
    }
}
