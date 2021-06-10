package JavaOop.Inheritance;

public class PolymorphimsApp {
    public static void main(String[] args) {
        //Polymorphims = Banyak Bentuk
        Employee employee = new Employee("Alfian");
        employee.sayHello("Jundi");

        employee = new Manager("Bagas");
        employee.sayHello("Riyan");

        employee = new Staff("Bayu");
        employee.sayHello("Harry");

        //Contoh Kegunaan Polymorhimps Meminimalisir Method sayHello di scoupe bawah
        sayHello(new Employee("Rudi"));
        sayHello(new Manager("Agung"));
        sayHello(new Staff("Tekle"));



    }
        //Tanpa Type Check & Result(Mengecek tipe data) Akan Error Jika yang di konversi bukan objek(tipe data) yang di maksud
        /*static void sayHello (Employee employee) {
            System.out.println("Hello " + employee.name);
        }
         */
        static void sayHello (Employee employee) {
            if (employee instanceof Staff) {
                Staff stf = (Staff) employee;
                System.out.println("Hello Staff " + stf.name);
            }else if (employee instanceof Manager) {
                Manager mgr = (Manager) employee;
                System.out.println("Hello Manager " + mgr.name);
            } else {
                System.out.println("Hello " + employee.name);
            }
        }

}