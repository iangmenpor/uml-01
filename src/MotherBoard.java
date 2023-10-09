public class MotherBoard {
    public Integer id;
    public String model;
    public Double price;

    public String getFullName() {
        return id + " " + model + " " + price;
    }

    public String getDeveloper() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }


    public void setId(Integer id){ this.id = id; }

    public void setModel(String model) { this.model = model; }

    public void setPrice(Double price) { this.price = price;}

}
