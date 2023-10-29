package Overriding;

    /*
    Same name and same parameters for the Parent's and Child's method @Override
     */

public class Dog {

    public void bark() {
        System.out.println("Woof");
    }
}

class GermanShepherd extends Dog {

    @Override
    public void bark() {
        System.out.println("Woof Woof Woof");
    }
}
