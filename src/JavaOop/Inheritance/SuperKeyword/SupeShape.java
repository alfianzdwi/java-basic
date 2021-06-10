package JavaOop.Inheritance.SuperKeyword;

public class SupeShape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends SupeShape{
        int getCorner(){
        return 4;
        }

        //mendeklarasikan method super di child class yang sudah di override
        int getParentCorner(){
            return super.getCorner();
        }
}


