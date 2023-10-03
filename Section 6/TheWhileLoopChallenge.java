public class TheWhileLoopChallenge {
    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        int countEven = 0;
        int countOdd = 0;

        while(start <= end){
            start++;

            if(!isEvenNumber(start)) {
                countOdd++;
                continue;
            }

            System.out.println(start + " number is even: " + isEvenNumber(start));
            countEven++;

            if(countEven >= 5){
                break;
            }
        }
        System.out.println("total Even: " + countEven);
        System.out.println("Total Odd: " + countOdd);

    }

    public static boolean isEvenNumber (int number){
        if(number % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}