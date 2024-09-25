import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        int numeroNotas = 0;
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
