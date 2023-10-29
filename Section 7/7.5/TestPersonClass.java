public class TestPersonClass {
    public static void main(String[] args) {
        Person john = new Person();

        john.setFirstName("John");
        john.setLastName("Blake");
        john.setAge(18);
        System.out.println("Full name is: " + john.getFullName());
        System.out.println("Age is: " + john.getAge());
    }
}
