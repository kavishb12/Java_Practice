package academy.learnjava;

public class NumberPalindrome {
    public static boolean isPalindrome(int num){
        if (num<0){
            num=0-num;
            System.out.println("Neg 2 Pos is " +num);
        }

        int flag_num=num;
        int reverse=0;
        while(flag_num>0){
            int last_digit=flag_num%10;
            reverse*=10;
            reverse+=last_digit;
            flag_num/=10;
        }
        if (num==reverse){
            return true;
        }
        else {
            return false;
        }
    }
}
