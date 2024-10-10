package com.aluracursos.radioalura.modelos;

public class Favoritos {
    public void playList(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Vuelevela Favorit@ del Mes");
        }
    }
}
