package java1_02.pract3.pract3_2;

import java.util.*;

/**
 * Документ отгрузки со склада.
 * Бывает двух типов: перемещение (на другой склад) и продажа (покупателю).
 * 
 */
class ShipmentDocument {
    private String documentId; // GUID документа
    private Date documentDate; // дата документа
    private String documentType; // тип отгрузки: sale - продажа, moving - перемещение
    
    private Storage storage; // склад 
    private Storage movingStorage; // склад получения (только для перемещения)

    private List<Item> items; //набор товаров
    private String customer; // получатель (только для продажи)



    public ShipmentDocument(String documentId, Date documentDate, String documentType, Storage storage,
        Storage movingStorage, List<Item> items, String customer) {
        this.documentId = documentId;
        this.documentDate = documentDate;
        this.documentType = documentType;
        this.storage = storage;
        this.items = items;
        if (documentType.equals("sale")) {
            this.customer = customer;
            this.movingStorage = null;
        }
        else {
            this.customer = "Это документ о перемещении";
            this.movingStorage = movingStorage;
        }
    }

    /**
     * Суммарная стоимость товаров в документе.
     */
    double totalAmount() {
        double sum = 0;
        for (Item item : items) {
            sum += Math.round(item.getItemQuantity() * item.getItemPrice() * 100) / 100.0;
        }
        return sum;
    }

    /**
     * Стоимость товара с переданным id.
     */
    double itemAmount(String id) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                return Math.round(item.getItemQuantity() * item.getItemPrice() * 100) / 100.0;
            }
        }
        return 0;
    }

    /**
     * Суммарная стоимость товаров, попадающих в список промо-акции.
     */
    double promoSum(String[] promoArticles, double discount) {
        double sum = 0;
        double discountSum = 0;
        if  (documentType.equals("sale"))
        {
            discountSum = discount;
        }
        for (Item item : items) {
            for (int j = 0; j < promoArticles.length; j++) {
                if (item.getItemArticle().equals(promoArticles[j])) {
                    sum += Math.round(item.getItemQuantity() * (item.getItemPrice() * (1 - discountSum)) * 100) / 100.0;
                    break;
                }
            }
        }
        return sum;
    }

    /**
     * Является ли продажа оптовой для переданного минимального объема.
     * Для перемещений неприменимо!
     */
    boolean isWholesale(double minQuantity) {
        if (documentType.equals("moving")) {
            return false;
        }
        double sumQuantity = 0;
        for (Item item : items) {
            if (item.getItemQuantity() >= minQuantity) {
                return true;
            }
            sumQuantity += item.getItemQuantity();
        }
        return sumQuantity >= minQuantity;
    }

    /**
     * Является ли перемещение внутренним (между складами одного владельца).
     * Для продаж неприменимо!
     */
    boolean isInternalMovement() {
        return documentType.equals("moving") && storage.getStorageOwner().equals(movingStorage.getStorageOwner());
    }
}