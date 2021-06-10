package JavaOop.Inheritance.VariableHidding;

//Variable Hidding (Variable tidak bisa di overriding)
class Parent {
    String name = "Joko";

    void doIt(){
        System.out.println("Do it In Parent");
    }
}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do it In Child");
        System.out.println("Parent Name Is "+super.name);
    }
}
