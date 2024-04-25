package hu.nero.toyota.exceptoin;

public class StorageIsEmptyException extends Exception {
    public StorageIsEmptyException(){
        System.out.println("This Storage is empty!");
    }
}
