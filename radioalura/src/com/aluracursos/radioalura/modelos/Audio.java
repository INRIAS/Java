package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalMeGusta;
    private int clasiificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int meGusta) {
        this.totalMeGusta = meGusta;
    }

    public int getClasificacion() {
        return clasiificacion;
    }

    public void setClaificacion(int clasiificacion) {
        this.clasiificacion = clasiificacion;
    }

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void reproducir() {
        this.totalDeReproducciones++;
    }
}
