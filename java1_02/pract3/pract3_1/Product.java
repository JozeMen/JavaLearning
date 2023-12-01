package java1_02.pract3.pract3_1;

public class Product {
    private String nomencul;
    private String productName;
    private double productPrice;
    private Manufacturer manufacturer;

    public String getNomencul() {
        return nomencul;
    }
    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Product(String nomencul, String productName, double productPrice, Manufacturer manufacturer) {
        this.nomencul = nomencul;
        this.productName = productName;
        this.productPrice = productPrice;
        this.manufacturer = manufacturer;
    }
    
}
