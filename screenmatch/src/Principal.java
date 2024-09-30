
public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.muestraFichaTecnica("Encanto", 2022, 120, 7);
        miPelicula.muestraFichaTecnica("Matrix", 1991, 180, 10);
        miPelicula.muestraFichaTecnica("Toy Story", 2000, 120, 10);
        miPelicula.calculaMedia();

    }

}
