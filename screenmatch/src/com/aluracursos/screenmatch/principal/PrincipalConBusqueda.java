package com.aluracursos.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aluracursos.screenmatch.exepsion.ErrorEnConversionDeDuracionExeption;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalConBusqueda {
        public static void main(String[] args) throws IOException, InterruptedException {
                String direccion;

                Scanner teclado = new Scanner(System.in);
                List<Titulo> titulos= new ArrayList<>();
                Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

                while (true) {
                        System.out.println("Consultar Serie u Pelicula: ");
                        var busqueda = teclado.nextLine();

                        if (busqueda.equalsIgnoreCase("salir")) {
                                break;
                        }

                        String busquedaCodificada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8);
                        direccion = "http://www.omdbapi.com/?t=" + busquedaCodificada + "&apikey=f33c21cc";

                        try {
                                HttpClient client = HttpClient.newHttpClient();
                                HttpRequest request = HttpRequest.newBuilder()
                                                .uri(URI.create(direccion))
                                                .build();

                                HttpResponse<String> response = client
                                                .send(request, BodyHandlers.ofString());

                                String json = response.body();
                                System.out.println(json);

                               
                                // Titulo miTitulo = gson.fromJson(json, Titulo.class);
                                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                                System.out.println(miTituloOmdb);
                                Titulo miTitulo = new Titulo(miTituloOmdb);
                                System.out.println(miTitulo);
                                // FileWriter escritura = new FileWriter("Peliculas.txt");
                                // escritura.write(miTitulo.toString());
                                // escritura.close();

                                titulos.add(miTitulo);
                        } catch (NumberFormatException e) {
                                System.out.println("Ocurrió un error.");
                                System.out.println(e.getMessage());
                        } catch (IllegalArgumentException e) {
                                System.out.println("Verifique la dirección.");
                        } catch (ErrorEnConversionDeDuracionExeption e) {
                                System.out.println(e.getMessage());
                        }
                }
                System.out.println(titulos);
                FileWriter escritura= new FileWriter("Titulos.txt");
                escritura.write(gson.toJson(titulos));
                escritura.close();
                System.out.println("Finalizo la ejecucion del programa.");

        }
}
