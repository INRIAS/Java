package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("****************************");
        Pelicula miPelicula = new Pelicula("Encanto", 2022);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        System.out.println("****************************");
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        System.out.println("****************************");
        Serie casaDragon = new Serie("Casa de Dragón", 2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutoPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        System.out.println("****************************");
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        System.out.println("****************************");
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Duración total estimada: " + calculadora.getTiempoTotal() + " Min.");
        
        System.out.println("****************************");
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);
        
        System.out.println("****************************");
        Episodio episodio = new Episodio();
        episodio.setNombre("Targeryan");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtrar(episodio);

        System.out.println("**************Array List*******************");
        var peliculaDeBruno = new Pelicula("El señor de los Aniloos", 2001);
        // peliculaDeBruno.setNombre();
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);


        System.out.println("Tamaño de la Lista: "+listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+ listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de Pelicula: " + listaDePeliculas);
        
    }
}