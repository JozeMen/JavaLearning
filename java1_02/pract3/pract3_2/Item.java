package java1_02.pract3.pract3_2;

class Item {
    private String itemId; // список GUID товаров
    private String itemArticle; // список артикулов товаров
    private String itemTitle; // список наваний товаров
    private double itemQuantity; // список количества шт. товаров
    private double itemPrice; // список цен товаров
    
    public String getItemId() {
        return itemId;
    }
    public String getItemArticle() {
        return itemArticle;
    }
    public String getItemTitle() {
        return itemTitle;
    }
    public double getItemQuantity() {
        return itemQuantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }

    public Item(String itemId, String itemArticle, String itemTitle, double itemQuantity, double itemPrice) {
        this.itemId = itemId;
        this.itemArticle = itemArticle;
        this.itemTitle = itemTitle;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
}
