package JavaOop.Inheritance.AbstractMethod;

public class AbstractApp {
    public static void main(String[] args) {

        //Abstract Class Tidak Bisa Langsung Di Buat Objek/iNSTASIASI "Menggunakan Polymorphims"/Melalui Sub Class
        Hewan hewan = new Kucing() ;
        hewan.name ="Doki";
        hewan.run();

        Hewan hewan1 = new Anjing();
        hewan1.name = "Doli";
        hewan1.run();
    }
}
