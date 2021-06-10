package JavaOop.Inheritance;

public class Manager extends Employee{

    //Constructor Subclass dari Employee dan Di Atas Staff
    Manager(String name){
        super(name);
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ",My Name Is Manager " + this.name);
    }
}