import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2022);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa de Dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutoPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Duración total estimada: " + calculadora.getTiempoTotal() + " Min.");

    }
}