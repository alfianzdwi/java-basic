package JavaOop.Inheritance.VariableHidding;

import JavaOop.Inheritance.VariableHidding.Child;
import JavaOop.Inheritance.VariableHidding.Parent;

//Variable Hidding
public class ParentApp {
    public static void main(String[] args) {


        Child child = new Child();
        child.name = "Lupin";
        child.doIt();
        System.out.println(child.name);

        //Mengkonversi parent ke child
        Parent parent = child;
        parent.doIt();
        //Terjadi Variable hidding di sini
        System.out.println(parent.name);
    }
}
