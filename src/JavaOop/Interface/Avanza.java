package JavaOop.Interface;

//Multiple Inteerface Inheritance
//Class Implement & Interface Bisa Memiliki Lebih Dari Satu Parent Interface
public class Avanza implements Car, IsMaintenance{

    @Override
    public void drive() {
        System.out.println("Avanza Ready Drive");
    }

    public void startEngine(){
        System.out.println("Avanza Engine ON");
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public int getTire() {
        return 6;
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public void color() {
        System.out.println("Color Avanza Is Red");
    }

}
