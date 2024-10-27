import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el valor de su limite de targeta: ");
        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;

        while (salir != 0) {
            System.out.println("Escriba su producto: ");
            String descripcion = lectura.next();

            System.out.println("Escriba el valor de su producto: ");
            double valor = Double.valueOf(lectura.nextDouble());

            Compra compra = new Compra(descripcion, valor);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra Realizada");
                System.out.println("Scriva 0 para Salir o 1 para Comprar");
                salir = lectura.nextInt();
            } else {
                salir = 0;
            }

        }

        System.out.println("*****************************");
        System.out.println("*****Compras Realizadas******");
        Collections.sort(tarjeta.getListaDeCompras());


        for (Compra compra: tarjeta.getListaDeCompras()) {
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("\n************************************");
        System.out.println("\nSaldo en tarjeta de credito: " + tarjeta.getSaldo());
        lectura.close();
    }
}
