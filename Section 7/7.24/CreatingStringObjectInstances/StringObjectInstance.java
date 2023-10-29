package CreatingStringObjectInstances;

public class StringObjectInstance {
    public static void main(String[] args) {
        // Immutable
        String hello = "Hello";
        String helloWorld = "Hello" + " World";
        String badHello = new String("Hello"); // Valid code, but redundant(лишнее)

    }
}
