import java.util.Random;
import java.util.Scanner;

public class Adivinar {

   public static void main(String[] args) {
      try (Scanner teclado = new Scanner(System.in)) {
         int numeroSecreto = new Random().nextInt(100);
         int intentos = 0;
         int numeroValidar;

         System.out.println("Bienvenido al juego de adivinar");
         System.out.println("-------Adinia el numero entre 1 y 100-----------");
         System.out.println("--------Tiene 5 intentos-----------");
         System.out.println("");
         for (int i = 1; i <= 5; i++) {
            System.out.println("Intento número " + i + ":");
            numeroValidar = teclado.nextInt();
            if (numeroValidar == numeroSecreto) {
               System.out.println("Felicidades adivinaste el número que es: " + numeroValidar + " en el intento #" + i);
               break;
            } else if (numeroValidar < numeroSecreto) {
               System.out.println("El número secreto es mayor");
            } else if (numeroValidar > numeroSecreto) {
               System.out.println("El número secreto es menor");
            }

            intentos++;
         }

         if (intentos >= 5) {
            System.out.println("Lo sentimos, ya usaste los 5 intentos, el número secreto era: " + numeroSecreto);
         }
      }

   }
}