package academy.learnjava;

public class Main {

    public static void main(String[] args) {
//        switchLetter();
////        printDayOfTheWeek(-1);
//        int count=0;
//        for(int i = 1;i<=50;i++){
//            if(isPrimeNumber(i)){
//                count++;
//                if(count == 3){
//                    System.out.println();
//                    break;
//                }
//            }
//        }
////        boolean flag = isPrimeNumber(-1);
//        System.out.println("The total number of prime numbers in the first 50 natural numbers are: " + count);
//            System.out.println(sumDigits(123456));
System.out.print(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
    }

    private static void switchLetter(){
        char character = 'a';
        switch (character){
            case 'A':
                System.out.println("The Character was A");
                break;
            case 'B':
                System.out.println("The Character was B");
                break;
            case 'C':
                System.out.println("The Character was C");
                break;
            case 'D':
                System.out.println("The Character was D");
                break;
            case 'E':
                System.out.println("The Character was E");
                break;
            default:
                System.out.println("Not A,B,C,D or E");
                break;

        }

    }

    private static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static boolean isPrimeNumber(int num){
        if (num<=1){
            return false;
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static int sumDigits(int num){
        if(num<10){
            return -1;
        }
        else{
            int sum=0;
            int last_digit=0;
            while(num!=0){

                last_digit = num % 10;
                num=num/10;
                sum+=last_digit;
            }
        return sum;
        }

    }

}
