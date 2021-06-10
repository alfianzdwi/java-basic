package JavaOop.ClassObject;

public class PersonApp {
    public static void main(String[] args) {
                                  //Mengakses Constructor
        Person objek1 = new Person("Iwan Junaidi","Subang");

        //objek1.nama = "Iwan Sukoco";
        //objek1.alamat = "Subang";

        //mengakses fields
        System.out.println(objek1.nama);
        System.out.println(objek1.alamat);
        System.out.println(objek1.negara);
        System.out.println(objek1.umur +" Tahun");

        //mengakses method parameter
        objek1.sayHello("Sueb");
        //mengakses mehod overloading
        objek1.sayHello(617223);

        //Menggunakan Objek kedua

        var objek3 = new Person("Nuri");

        Person objek2;
        objek2 = new Person();
        objek2.nama = "Juki";
        objek2.sayHello("Lulu");

    }
}
