import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.muestraFichaTecnica("Encanto", 2022, 120, 7);
        miPelicula.muestraFichaTecnica("Encanto", 2022, 180, 10);
        miPelicula.muestraFichaTecnica("Encanto", 2022, 120, 10);
        System.out.println("Suma de Calificaciones: " + miPelicula.getSumaDeEvaluaciones());
        miPelicula.calculaMedia();
        System.out.println("Total de Evaluaciones: " + miPelicula.getTotalEvaluaciones());


    }

}
