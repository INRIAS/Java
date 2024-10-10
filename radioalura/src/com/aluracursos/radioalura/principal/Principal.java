package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Favoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        var miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        var miPodcast = new Podcast();
        miPodcast.setTitulo("Cafe.Tech");
        miPodcast.setPresentador("Gabriela Aguilar");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }
        System.out.println("Total de Me Gusta: " + miCancion.getTotalMeGusta());
        System.out.println("Total de Reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("***************************************");
        
        System.out.println("Total de Me Gusta: " + miPodcast.getTotalMeGusta());
        System.out.println("Total de Reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("**************************************");

        var favoritos= new Favoritos();
        favoritos.playList(miCancion);
        favoritos.playList(miPodcast);
    }
}
