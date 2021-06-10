package JavaOop.Inheritance.SuperKeyword;



public class ShapeApp {
    public static void main(String[] args){
        var shp = new SupeShape();
        System.out.println("Sebelum Di Overide : "+shp.getCorner());

        var rtc=new Rectangle();
        System.out.println("Setelah Di Overide : "+rtc.getCorner());
        //Mengakses Method Super class melalui child class
        System.out.println(rtc.getParentCorner());

    }
}
