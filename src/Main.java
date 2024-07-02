public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");


        int releaseDate = 1999;
        boolean included = true;
        double filmRate = 8.2;

        double filmAverage = (8.2 + 6.0 + 9.0) / 3;

        System.out.println(filmAverage);
        String filmDescription = """
                Paradox of humans reality
                Fué lanzada en: """ + releaseDate;
        System.out.println(filmDescription);

        int castFilmAverage = (int) (filmAverage/2);
        System.out.println(castFilmAverage);

        // examples

        int valor =  10;
        valor += 15;
        System.out.println(valor);

        String nombre = "Ali";
        int edad = 27;
        double valor1 = 55.9999F;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor1));

        String name = "Juan";
        int aulas = 4;
        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje.""".formatted(nombre, aulas);
        System.out.println(mensaje);

        String saludo = "Hola, mi nombre es ";
        String nombre1= "Alicia ";
        String continuacion = "y mi edad es ";
        int edad1 = 17;
        System.out.println(saludo + nombre1 + continuacion + edad1);
    }
}