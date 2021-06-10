package JavaOop.Interface;

//Interface Mewarisi Interface Lainnya Otomatis Child/implement Classnya Harus meng ovveride method interface induknya
//Jika tidak maka akan error
//Interface Juga Bisa Memiliki Lebih Dari Satu Parent
public interface Car extends HashBrand {
    void drive();

    void startEngine();

    int getTire();


    //Default Method Agar Semua Class Yang MengImplement interface tersebut Tidak Ikut rusak/error saat method di tambahkan
    //Default Method Tidak Wajib Untuk Di override oleh implement/child classnya
    default boolean isBig(){
        return false ;
    }

    default void color(){
    }


}
