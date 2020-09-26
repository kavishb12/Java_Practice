package academy.learnjava;

public class Main {

    public static void main(String[] args) {
	double var1 = 20.00d;
	double var2 = 80.00d;
	double var3 = 100d*(var1+var2);
	double var4 = var3%40.00;
	boolean var5 = var4 == 0?true:false;
	System.out.println(var5);
	if (!var5) System.out.println("Got Some Remainder");
    }
}
