package academy.learnjava;

public class sumFirstAndLastDigit {

    public static int sumFirstAndLastDigit(int num){
        if (num<0){
            return -1;
        }

        int flag_num=num;
        int last_digit=num%10;
        int first_digit=0;
        while(flag_num>0){
            first_digit=flag_num%10;
            flag_num/=10;

        }

        return last_digit+first_digit;

    }

}
