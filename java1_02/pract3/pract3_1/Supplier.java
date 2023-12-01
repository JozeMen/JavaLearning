package java1_02.pract3.pract3_1;


public class Supplier {
    private String inn;
    private String supplierName;
    private String supplierAdress;

    public String getInn() {
        return inn;
    }
    public String getSupplierName() {
        return supplierName;
    }
        
    public String getSupplierAdress() {
        return supplierAdress;
    }

    public Supplier(String inn, String supplierName, String supplierAdress) {
        this.inn = inn;
        this.supplierName = supplierName;
        this.supplierAdress = supplierAdress;
    }

}
