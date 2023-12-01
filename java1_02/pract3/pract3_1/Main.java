package java1_02.pract3.pract3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static List<Product> createSupplier(Manufacturer... manufacturers) {
        Random rnd = new Random(0);
        List<Product> products = new ArrayList<>();
        for (Manufacturer manufacturer : manufacturers) {
            for (int i = 0; i < 5; i++) {
                String article = String.valueOf(rnd.nextInt(900_000_000) + 1_000_000_000);
                String productName = "ProductName" + i;
                double productPrice = i*1000;
                System.out.println(article);
                
                Product product = new Product(article, productName, productPrice, manufacturer);
                products.add(product);
                manufacturer.addProduct(product);
        }
        }
        return products;
    }
    
    public static void showProductDetails(Product product, Dealer... dealers)  {
        double newPrice = product.getProductPrice();
        String nameDealer = null;
        for (var dealer : dealers) {
            if  (dealer.getManufacturer() == product.getManufacturer()) {
                nameDealer = dealer.getSupplierName();       
                newPrice *= 1 + dealer.getPriceUpPercent() / 100;
                break;
            }
        }
        String nameManufact = product.getManufacturer().getSupplierName();
        String addressManufact = product.getManufacturer().getSupplierAdress();
        
        System.out.println(product.getProductName());
        System.out.println(newPrice);
        System.out.println("Наименование и адрес поставщика: " + nameManufact
        + ", " + addressManufact);
        if  (nameDealer != null) {
            System.out.println("Реальный производитель: " + nameDealer);
        }

    }

    public static Product searchProduct(List<Product> products, String searchArticle) {
        for (Product product : products) {
            if (product.getNomencul().equals(searchArticle)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("1234567890", "Manufacturer1", "Address1");
        Manufacturer manufacturer2 = new Manufacturer("0987654321", "Manufacturer2", "Address2");
        Manufacturer manufacturer3 = new Manufacturer("9876543210", "Manufacturer3", "Address3");

        Dealer dealer1 = new Dealer("1111111111", "Dealer1", "DealerAddress1", manufacturer1, 10);
        Dealer dealer2 = new Dealer("2222222222", "Dealer2", "DealerAddress2", manufacturer2, 15);
        
        List<Product> products = createSupplier(manufacturer1, manufacturer2, manufacturer3);
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите q чтобы выйти");
            String searchArticle = sc.nextLine();
            if (searchArticle.equals("q")) {
                break;
            }
            else {
                Product foundProduct = searchProduct(products, searchArticle);
                if ( foundProduct != null) {
                    showProductDetails(foundProduct, dealer1, dealer2);
                }
                else {
                    System.out.println("Товары по запросу не найдены");
                }
            }
        }
        sc.close();

    }


}
