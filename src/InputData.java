import java.util.Scanner;

public class InputData {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Write the name of your favorite movie: ");
        String movie = teclado.nextLine();
        System.out.println("Write movie release date: ");
        int releaseDate = teclado.nextInt();
        System.out.println("Rate this movie in a range of 1 to 5: ");
        double movieScore = teclado.nextDouble();

        System.out.println(movie);
        System.out.println(releaseDate);
        System.out.println(movieScore);
    }
}
