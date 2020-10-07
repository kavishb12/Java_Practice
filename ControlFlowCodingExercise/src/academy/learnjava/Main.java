package academy.learnjava;

import java.util.Scanner;

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


//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for(int i = 1;i<=10;i++){
//            System.out.println("Enter number #"+i);
//            boolean isInt  = scanner.hasNextInt();
////            System.out.println("test:"+isInt);
//            if(isInt){
//                int numUser = scanner.nextInt();
////                scanner.nextLine();
//                sum+=numUser;
//            }
//            else{
//                System.out.println("Invalid Number");
//
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
//        System.out.println("The sum is "+ sum);

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i=0;
        int min=0;
        int max = 0;
        while(true){
            System.out.println("Enter number #"+i);

            boolean isInt  = scanner.hasNextInt();
            if(isInt){
                int numUser = scanner.nextInt();
                if(i==0){
                    min=numUser;
                    max=numUser;
                }

                if(min<numUser){
                    min=numUser;
                }
                if(max>numUser){
                    max=numUser;
                }
            }
            else{
                if(i==0){
System.out.println("No value input yet");
break;
                }

                System.out.println("Minimum number is: "+min+" and max number is: "+max);
                break;
            }
            i++;
            scanner.nextLine();
        }
        scanner.close();

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
