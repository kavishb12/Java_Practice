package academy.learnjava;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
    int n1 = (int) (num1*1000);
    int n2 =  (int) (num2*1000);
    System.out.println(n1);
        if( n1 ==  n2){
        return true;
    }
    else{
        return false;
    }
    }
}
