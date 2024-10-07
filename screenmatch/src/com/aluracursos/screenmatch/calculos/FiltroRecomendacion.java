package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtrar(Clasificacion clasificacion){
        if (clasificacion.getClasificacion()>=4) {
            System.out.println("Excelente recomendación");
        }else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Poopulares del momento");
        }else{
            System.out.println("Agregalo a tu lista de espera");
        }
    }
}
