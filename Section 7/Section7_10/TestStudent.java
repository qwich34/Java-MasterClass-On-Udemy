public class TestStudent {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/16/1978", "Java MasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java MasterClass");

        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1986", "Java MasterClass");

        System.out.println("\nPOJO Student");
        System.out.println(pojoStudent);
        System.out.println("\nRecord Student");
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println("\nAccessor methods for POJO student");
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());

        System.out.println("\nAccessor methods for Record student");
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());

    }
}
