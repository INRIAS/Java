public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double nota;
    double sumaDeEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnica(String nombre, int fechaDeLanzamiento, int duracionEnMinutos, double nota) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.nota = nota;

        
        System.out.println("El nombre de la pelicula es: " + this.nombre);
        System.out.println("Fecha de Lanzamiento: " + this.fechaDeLanzamiento);
        System.out.println("Duración: " + this.duracionEnMinutos + " Min.");
        System.out.println("Calificacion: " + nota);
        System.out.println("**********************");

        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }
    
    void calculaMedia(){
         System.out.println("Media de las peliculas: " + sumaDeEvaluaciones/totalEvaluaciones);
    }
}
