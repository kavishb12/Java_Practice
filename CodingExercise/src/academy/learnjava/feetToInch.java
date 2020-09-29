package academy.learnjava;

public class feetToInch {
    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        if ((feet <0 || inch<0) || inch>12 ){
            return -1;
        }

        else{
            return feet*12*2.54+inch*2.54;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inch){
        if (inch<0){
            return -1;
        }

        else{
            double feet = (int) inch/12;
            //System.out.println("feet = "+feet);
            double inch_remaining = inch%12;
            return calcFeetAndInchesToCentimeters(feet,inch_remaining);
        }
    }
}
