package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double nota;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void muestraFichaTecnica(String nombre, int fechaDeLanzamiento, int duracionEnMinutos, double nota) {
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

    public void calculaMedia() {
        System.out.println("Media de las peliculas: " + sumaDeEvaluaciones / totalEvaluaciones);
    }

    public double getSumaDeEvaluaciones() {
        return sumaDeEvaluaciones;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }
}
