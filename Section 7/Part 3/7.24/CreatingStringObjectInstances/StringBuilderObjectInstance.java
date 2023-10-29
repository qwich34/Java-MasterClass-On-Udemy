package CreatingStringObjectInstances;

public class StringBuilderObjectInstance {
    public static void main(String[] args) {
        //Mutable String Object
        StringBuilder helloBuilder = new StringBuilder("Hello");
        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder emptyBuilder5 = new StringBuilder(5);
        StringBuilder stringBuilder = new StringBuilder(helloBuilder);
    }
}
