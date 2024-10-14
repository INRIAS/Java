package com.aluracursos.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2022);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        var peliculaDeBruno = new Pelicula("El Señor de los Anillos", 2001);
        Serie casaDragon = new Serie("Casa de Dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        miPelicula.evalua(9);
        lista.add(otraPelicula);
        otraPelicula.evalua(6);
        lista.add(peliculaDeBruno);
        peliculaDeBruno.evalua(10);
        lista.add(casaDragon);
        casaDragon.evalua(10);

        for (Titulo e : lista) {
            System.out.println(e.getNombre());

            if (e instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }
        System.out.println(" ");
        System.out.println("******************************");
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Cameron Diaz");
        listaDeArtistas.add("Andrew Garfiel");
        listaDeArtistas.add("Keanu Reavers");
        listaDeArtistas.add("Jeason Stata");
        System.out.println("Lista de Artistas no Ordenada: " + listaDeArtistas);
        System.out.println(" ");
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas Ordenada: " + listaDeArtistas);

        System.out.println("*****************************");
        Collections.sort(lista);
        System.out.println(lista);
        
        System.out.println("*****************************");
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de Artistas Ordenada por Fehca de Lanzamiento: " + listaDeArtistas);
    }
}
