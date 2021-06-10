package JavaOop.Encasulaption;

public class CategoryApp {
    public static void main(String[] args) {

        Category ctgr = new Category();

        //Mengubah/Megisi Fields Yang Private Menggunakan Setter
        ctgr.setId(null);
        ctgr.setId("ID 130142");
        ctgr.setId(null);
        //Mengambil Data/Field Yang Private Menggunakan Getter
        System.out.println("NO ID SAYA : "+ctgr.getId());

    }
}
