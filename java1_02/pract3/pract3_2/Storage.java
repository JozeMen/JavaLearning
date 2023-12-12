package java1_02.pract3.pract3_2;


class Storage {
    private String storage; // название склада отгрузки
    private String storageOwner; // владелец склада отгрузки

    public String getStorage() {
        return storage;
    }

    public String getStorageOwner() {
        return storageOwner;
    }


    public Storage(String storage, String storageOwner) {
        this.storage = storage;
        this.storageOwner = storageOwner;
    }



}
