import java.util.Scanner;

import conexion.ConexionApi;
import modelo.MonedaConstructor;
import record.Moneda;

public class Principal {

    public static void main(String[] args) throws Exception {
        
        int opcion=-1;
        double cantidad;
        String menu = """
                ******************************************
                1) Dólar ----------------> Peso Argentino
                2) Peso Argentino -------> Dólar
                3) Dólar ----------------> Real Brasileño
                4) Real Brasileño -------> Dólar
                5) Dólar ----------------> Peso Colombiano
                6) Peso Colombiano ------> Dólar
                0) Salir del Sistema
                ******************************************
                """;
        String textOpcion = "Elija la Convencion: ";
        String textCantidad = "Ingrese el valor a convertir: ";
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("************************************************");
        System.out.println("-----Bienvenidos a Nuestro Sitema de Cambio-----");
        System.out.println("************************************************");
        System.out.println("");
        do {

            
            try {

                ConexionApi consulta = new ConexionApi();
                // System.out.println(moneda);
                
                System.out.println(menu);
                System.out.println(textOpcion);
                opcion = teclado.nextInt();
                System.out.println(textCantidad);
                cantidad = teclado.nextInt();
                
                
                switch (opcion) {
                    case 1:
                    Moneda monedaRecord = consulta.parMoneda("COP", "USD", cantidad);
                    MonedaConstructor moneda = new MonedaConstructor(monedaRecord);
                    System.out.println("");
                    System.out.println("El valor de " + cantidad + " COP su conversión es de: " + moneda.getConversion() + " USD");
                    System.out.println("");
                        break;

                    default:
                        break;
                }

            } catch (Exception e) {

            }
        } while (opcion != 0);

    }
}
