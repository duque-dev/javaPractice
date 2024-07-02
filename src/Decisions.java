public class Decisions {

    public static void main(String[] args) {
        int releaseDate = 1999;
        boolean included = true;
        double filmRate = 8.2;
        String suscriptionType = "Plus";

        if(releaseDate >= 2022) {
            System.out.println("Most popular movies");
        }else {
            System.out.println("Ancient movie ;)");
        }

        if (included || suscriptionType.equals("Plus")) {
            System.out.println("Enjoy your Movie!!");
        }else {
            System.out.println("Not available in your actual suscription");
        }

        //Alternative to if/else condition SWITCH
        int dia = 3;
        switch (dia) {
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
