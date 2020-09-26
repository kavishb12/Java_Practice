package academy.learnjava;

public class Main {

    public static void main(String[] args) {
	byte bte = 123;
	short srt = 1234;
	int ing = 1213456;
	long lng = (50_000L+10L*(bte+srt+ing));
	System.out.println(lng);
    short Test = (short) (1000 + (bte+srt+ing));
    System.out.println(Test);

    }
}
