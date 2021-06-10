package JavaOop.Interface;

//Interface Inheritance
public interface HashBrand {
    String getBrand();

    //default method tidak wajib di override oleh semua child class nya
    default int speed() {
        return 0;
    }
}
