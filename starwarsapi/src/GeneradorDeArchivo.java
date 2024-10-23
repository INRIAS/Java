import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import conection.Pelicula;

public class GeneradorDeArchivo {
    public void generadorJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title() + ".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}