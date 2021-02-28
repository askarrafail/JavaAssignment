package entities;

import java.time.LocalDate;

public class Medicine {
    private int id;
    private String name;
    private double price;
    private LocalDate expirationDate;
    private String manufacturer;

    public Medicine() {}

    public Medicine(String name, double price, LocalDate expirationDate, String manufacturer) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.manufacturer = manufacturer;
    }

    public Medicine(int id, String name, double price, LocalDate expirationDate, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.manufacturer = manufacturer;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public LocalDate getExpirationDate() {

        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {

        this.expirationDate = expirationDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
