import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double nota;
            int numeroNotas;
            double mediaEvaluacion = 0;
            double totalEvaluacion = 0;

            System.out.println("Cuantas clasificaciones desea dar");
            numeroNotas = teclado.nextInt();
            while (totalEvaluacion != numeroNotas) {
                System.out.println("Escribe la nota que le darias a la pelicula Matrix");
                nota = teclado.nextDouble();
                mediaEvaluacion += nota;
                totalEvaluacion++;
            }
            System.out.println("La media para la pelicula es: " + mediaEvaluacion / totalEvaluacion);
        }

    }
}
