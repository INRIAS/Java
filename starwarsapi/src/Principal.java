import java.io.IOException;
import java.util.Scanner;

import conection.ConsultaPelicula;

import conection.Pelicula;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el número de la pelicula que quiere consultar: ");

        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.generadorJson(pelicula);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Numero no encontrado: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }

        lectura.close();
    }
}
