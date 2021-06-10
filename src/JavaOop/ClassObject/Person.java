package JavaOop.ClassObject;

public class Person {

    //Mendeklarasikan Fields
  String nama;
  String alamat;
  final String negara = "Indonesa" ;
  int umur = 20 ;

    //Mendeklrasikan Constructor
    //This Untuk Menandakan Field di class ini Untuk Menghindari Variable shadowing
     Person(String nama,String alamat){
        this.nama = nama;
        this.alamat= alamat;
    }
    //Me Overloading Constructor/Memanggil Constructor Lain Di Dalam Constructor
    Person(String paramNama){
        this(paramNama,null);
    }
     Person(){

     }
    //Mendeklrasikan Method Parameter
     char sayHello(String nama){
        System.out.println("Hello "+nama + ",Nama Saya "+this.nama );
         return 0;
     }
    //Melakukan Method Overloading
     void sayHello(int paramHp){
         System.out.println("Hello Nomor Handphone Saya "+paramHp );
     }

}

