import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double nota;
            double mediaEvaluacion = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Escribe la nota que le darias a la pelicula Matrix");
                nota = teclado.nextDouble();
                mediaEvaluacion = mediaEvaluacion + nota;
            }
            System.out.println("La media para la pelicula es: " + mediaEvaluacion / 3);
        }
    }
}