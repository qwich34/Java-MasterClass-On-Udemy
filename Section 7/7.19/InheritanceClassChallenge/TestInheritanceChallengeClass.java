package InheritanceClassChallenge;

public class TestInheritanceChallengeClass {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/23/1986",
                "10/26/2003");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe",
                "11/11/1920","03/03/2020",35000);

        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970","03/03/2021",31);

        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }
}
