import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        //Input data
        Scanner teclado = new Scanner(System.in);

        //welcome message
        System.out.println("Welcome to TrueBank, Select one option: ");
        int principalMenuOption = teclado.nextInt();
        switch (principalMenuOption) {
            case 1:
                System.out.println("New client");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }


        System.out.println("Full Name: ");
        String clientName = teclado.nextLine();
        System.out.println("Account type: ");
        String accountType = teclado.nextLine();
        System.out.println("Balance: ");
        double availableBalance = teclado.nextDouble();
        System.out.println("Select menu option: ");
        int menuOption = teclado.nextInt();

        switch (menuOption) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }
    }
}
