package academy.learnjava;

public class Main {

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+ position);
    }

    public static int calculatedHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >= 100){
            return 3;

        }
        else {
            return 4;
        }
    }
    public static void main(String[] args) {
        int score = 1500;
        String name = "kavish";

        displayHighScorePosition(name,calculatedHighScorePosition(score));
    }
}
