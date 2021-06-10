package JavaOop.Interface;

public class CarApp {
    public static void main(String[] args) {

        //Mengakses Class Implement Avanza Yang Terhubung Dengan Interface Car
        Car car = new Avanza();
        System.out.println("Tebal Ban Avanza : "+car.getTire());
        car.drive();
        car.startEngine();
        car.color();

        System.out.println("");

        //Mengakses Class Implement Civic Dan Interface Car
        //Polymorphims
        car = new Civic();
        System.out.println("Tebal Ban Civic: "+car.getTire());
        car.drive();
        car.startEngine();
        System.out.println("Kecepatan Maximum Civic : "+car.speed() +" KM");


    }
}
