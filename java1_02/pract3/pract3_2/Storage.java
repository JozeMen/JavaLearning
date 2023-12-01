package java1_02.pract3.pract3_2;

import java.util.ArrayList;
import java.util.List;

class Storage {
    private String storage; // название склада отгрузки
    private String storageOwner; // владелец склада отгрузки
    private List<Item> items;

    public String getStorage() {
        return storage;
    }

    public String getStorageOwner() {
        return storageOwner;
    }

    public List<Item> getItems() {
        return items;
    }
    
    public Storage(String storage, String storageOwner) {
        this.storage = storage;
        this.storageOwner = storageOwner;
        this.items = new ArrayList<Item>();
    }

    public void addProduct(Item item) {
        items.add(item);
    }


}
