package JavaOop.Interface;

//Multiple Inteerface Inheritance
//Class Implement Bisa Memiliki Lebih Dari Satu Parent Interface
public class Civic implements Car, IsMaintenance{
    @Override
    public void drive() {
        System.out.println("Civic Ready To Drive");
    }

    @Override
    public String getBrand() {
        return "Nissan";
    }

    public void startEngine(){
        System.out.println("Civic Engine ON");
    }
    @Override
    public int getTire() {
        return 14;
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    //Mengakses Default Method Di Salah Satu Implement Class Nya
    public boolean isBig() {
        return false;
    }

    @Override
    public int speed() {
        return 140;
    }
}
