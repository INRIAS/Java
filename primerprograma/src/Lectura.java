import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Escribe el nombre de tu pelicula favorita");
            String pelicula = teclado.nextLine();
            System.out.println("Ahora escribe la fecha de lanzamiento");
            int fechaDeLanzamiento = teclado.nextInt();
            System.out.println("Dinos que nota le das a esta pelicula");
            double nota = teclado.nextDouble();

            System.out.println(String.format("Pelicula : %s", pelicula));
            System.out.println(String.format("Lanzamiento : %d", fechaDeLanzamiento));
            System.out.println(String.format("Clasificación : %.2f", nota));
        }
    }
}
