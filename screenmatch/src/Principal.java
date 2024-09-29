
public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula= new Pelicula();
        miPelicula.nombre="Encanto";
        miPelicula.fechaDeLanzamiento=2022;
        miPelicula.duracionEnMinutos=120;
        miPelicula.incluidoEnElPlan=true;

        System.out.println("Mi pelicula es: "+ miPelicula.nombre);
        System.out.println("Fecha de Lanzamiento: "+ miPelicula.fechaDeLanzamiento);
        System.out.println("Duración. "+ miPelicula.duracionEnMinutos + " Min.");
        System.out.println("**********************");

        Pelicula otraPelicula= new Pelicula();
        otraPelicula.nombre="Matrix";
        otraPelicula.fechaDeLanzamiento=1999;
        otraPelicula.duracionEnMinutos=180;
        otraPelicula.incluidoEnElPlan=true;

        System.out.println("Mi pelicula es: "+ otraPelicula.nombre);
        System.out.println("Fecha de Lanzamiento: "+ otraPelicula.fechaDeLanzamiento);
        System.out.println("Duración. "+ otraPelicula.duracionEnMinutos + " Min.");
        System.out.println("**********************");
    }    

}
