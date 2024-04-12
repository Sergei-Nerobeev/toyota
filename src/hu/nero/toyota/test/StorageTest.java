package hu.nero.toyota.test;

import hu.nero.toyota.storage.Storage;

public class StorageTest {
    public static void main(String[] args) {
        testStorageCreation();
    }

    private static void testStorageCreation() { //todo
        Storage storage = new Storage();
        if(storage.getTotalCarsStorage() == 0 && storage.getTotalCamryStorage() == 0 && storage.getTotalSolaraStorage()
        == 0 && storage.getTotalDynaStorage() == 0 && storage.getTotalHianceStorage() == 0) {

        }


    }
}
