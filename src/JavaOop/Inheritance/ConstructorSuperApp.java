package JavaOop.Inheritance;

public class ConstructorSuperApp {
    public static void main(String[] args){
                                //Mengisi Parameter Constructor Superclass
        var emp = new Employee("Alfian");
        //stf.name="Alfian";
        emp.sayHello("Sora");

                                //Mengisi Parameter Constructor SubClass
        var mgr = new Manager("Toro");
        //mgr.name ="Toro";
        mgr.sayHello("Junaidi");

        var stf = new Staff("Jodi");
        //mgr.name="Jodi";
        stf.sayHello("Jully");

    }
}
