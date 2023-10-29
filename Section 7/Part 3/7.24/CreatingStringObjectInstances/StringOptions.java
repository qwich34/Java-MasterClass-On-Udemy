package CreatingStringObjectInstances;

public class StringOptions {

    public static void main(String[] args) {

        System.out.println(" _ ".repeat(20));
        String helloWorld = "Hello" + " World";

        //String methods create a new Object in memory, and return a reference to this new object.
        //StringBuilder methods return a StringBuilder reference, but it's really a self-reference to itself.



        //The String reference by the helloWorld variable never changed.
        //Instead, a new String was created by the method.
        //There was no reference pointer in the heap memory to a new String.

        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");

        //We still have one StringBuilder Object
        //The reference pointer of helloWorld is still the same, but the value changed
        //It will point to Hello World and Goodbye in heap memory with a different value in it.
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);

        emptyStart.append("a".repeat(17));
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        emptyStart.append("a".repeat(57));
        emptyStart32.append("a".repeat(57));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);
        System.out.println(" _ ".repeat(20));

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);
        System.out.println(" _ ".repeat(20));

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        System.out.println(" _ ".repeat(20));
    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
        System.out.println(" _ ".repeat(20));

    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());
        System.out.println(" _ ".repeat(20));

    }
}
