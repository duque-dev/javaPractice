import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double score = 0;
        double scoreAverage = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Rate this movie in a range of 1 to 5: ");
            score = teclado.nextDouble();
            scoreAverage = scoreAverage + score;
        }
        System.out.println(scoreAverage/3);

        int count = 0;
        while(score != -1){

            System.out.println("Rate this movie in a range of 1 to 5: ");
            score = teclado.nextDouble();

            if(score >= 1) {
                scoreAverage += score;
                count++;
            }
        }
        System.out.println(scoreAverage/3);
        }

    }
}
