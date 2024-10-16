package com.aluracursos.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        String direccion;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Consultar Serie u Pelicula: ");
        var busqueda = teclado.nextLine();
        direccion = "http://www.omdbapi.com/?t=" + busqueda + "&apikey=f33c21cc";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        // Titulo miTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(miTituloOmdb);


        Titulo miTitulo = new Titulo(miTituloOmdb);

    }
}
