package JavaOop.Inheritance;

public class Staff extends Manager {

    //Memanggil Consturtor super class denga menggunakan constructor sub class
    Staff(String name){
       super(name);
    }
    //Method Overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + ",My Name Is Staff " + this.name);
    }
}