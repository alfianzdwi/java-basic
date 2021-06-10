package JavaOop.AccesModifier;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("T-shirt",140000);

        //error karena acces modifier fields nya private
        //System.out.println(product.nama);
        //System.out.println(product.harga);

        //Walaupun private bisa di akses menggunakan method get dahulu
        System.out.println(product.getNama());
        System.out.println(product.getHarga());
    }
}
