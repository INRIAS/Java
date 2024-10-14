package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporada;
    private int episodiosPorTemporada;
    private int minutoPorEpisodios;

    // ******Constructor********
    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporada * episodiosPorTemporada * minutoPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + " ("+ getFechaDeLanzamiento() + ")";
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutoPorEpisodios() {
        return minutoPorEpisodios;
    }

    public void setMinutoPorEpisodios(int minutoPorEpisodios) {
        this.minutoPorEpisodios = minutoPorEpisodios;
    }

}
