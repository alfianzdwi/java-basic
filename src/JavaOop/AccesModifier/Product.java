package JavaOop.AccesModifier;

public class Product {
    private String nama;
    private int harga;

    Product(String nama,int harga){
        this.nama = nama ;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }
}
