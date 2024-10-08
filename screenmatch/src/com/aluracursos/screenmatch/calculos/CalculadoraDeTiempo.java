package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    
    private int totalTiempo;

    public int getTiempoTotal() {
        return totalTiempo;
    }
    public void incluye(Titulo titulo){
        totalTiempo += titulo.getDuracionEnMinutos();
    }
}
