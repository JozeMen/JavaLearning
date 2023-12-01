package java1_02.pract3.pract3_1;

public class Dealer extends Supplier{
    private double priceUpPercent;
    private Manufacturer manufacturer;

    public double getPriceUpPercent() {
        return priceUpPercent;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Dealer(String inn, String name, String address, Manufacturer manufacturer, double priceUpPercent) {
        super(inn, name, address);
        this.manufacturer = manufacturer;
        this.priceUpPercent = priceUpPercent;
    }
}
