package java1_02.pract3.pract3_1;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer extends Supplier {
    private List<Product> products;

    public Manufacturer(String inn, String supplierName, String supplierAdress) {
        super(inn, supplierName, supplierAdress);
        this.products = new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

}
