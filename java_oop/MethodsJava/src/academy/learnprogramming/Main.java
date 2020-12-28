package academy.learnprogramming;

public class Main {

    public static int calculateScore(int score, int levelsCompleted, int bonus) {
        return score + (levelsCompleted * bonus);
    }

    public static void main(String[] args) {
        int score = 30;
        int levelsCompleted = 5;
        int bonus = 300;
        int finalScore = calculateScore(score, levelsCompleted, bonus);
        System.out.println(finalScore);
    }
}
