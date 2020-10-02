package academy.learnjava;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a , int b){
        if(a<10||b<10){
            return -1;
        }
        int small = 0;
        if(a<b){
            small=a;
        }
        else{
            small=b;
        }
        System.out.println("small"+small);
        for(int i=small;i>1;i--){
            if(a%i==0&&b%i==0){
                return i;
            }
        }
        return 1;
    }
}
