package JavaOop.Inheritance.AbstractClass;

public class LocationApp {
    public static void main(String[] args) {
       /* var location = new Location(); //Error Karena Abstract class tidak bisa langsung di buat objek/akses
        location.name = "Supri";
        System.out.println(location.name);*/

        //Mengakses Fields Abstract Class Melalui Subclass nya
        var city = new City();
        city.name = "Bogor";
        System.out.println("Saya Tinggal Di "+city.name);
    }
}
