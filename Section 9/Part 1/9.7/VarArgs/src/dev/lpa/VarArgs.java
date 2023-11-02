package dev.lpa;

public class VarArgs {
    //Why do we need a VarArgs?
    // It helps a lot for not creating many overloaded methods
    // An example below.
    public static void main(String[] args) {

        System.out.println("Sum of 2 Numbers = "
                + sum(2,3));
        System.out.println("Sum of 3 Numbers = "
                + sum(2,3,4));
        System.out.println("Sum of 4 Numbers = "
                + sum(2,3,4,8));
        System.out.println("Sum of 5 Numbers = "
                + sum(2,3,4,5,7));
        System.out.println("-".repeat(50));

        System.out.println("Sum without any argument = "
                + sumVarAgs());
        System.out.println("Sum of 2 Numbers = "
                + sumVarAgs(2,3));
        System.out.println("Sum of 3 Numbers = "
                + sumVarAgs(2,3,4));
        System.out.println("Sum of 4 Numbers = "
                + sumVarAgs(2,3,4,8));
        System.out.println("Sum of 5 Numbers = "
                + sumVarAgs(2,3,4,5,7));
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c,int d){
        return a+b+c+d;
    }
    public static int sum(int a, int b, int c,int d,int e){
        return a+b+c+d+e;
    }

    public static int sumVarAgs(int... number){
        int result =0;
        for (int element: number){
            result = (result + element);
        }
        return result;
    }
}
