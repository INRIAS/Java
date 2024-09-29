import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            String cliente = "Inri Alva", tipodeCuenta = "Ahorros", salir="";
            double saldoDisponible = 5000, retirarValor, deposita;
            int qCelular, qCodigo, preguntar;
            int celular = 300123456;
            int codigo = 1234;

            do {
                System.out.println("");
                System.out.println("----------------------------------------------------");
                System.out.println("Bienvenido a nuestro sistema Bancario Credi-Ladrones");
                System.out.println("----------------------------------------------------");
                System.out.println("");
   
                System.out.println("Ingresar número telefónico:");
                qCelular = teclado.nextInt();
                System.out.println("Ingresar Código de Verificación:");
                qCodigo = teclado.nextInt();
   
                if (qCelular == celular && qCodigo == codigo) {
                    System.out.println("----Ingreso Exitoso-----");
                    System.out.println("------------------------");
                    System.out.println("");
   
                    System.out.println("-----Bienvenido a Nuestro Sistema-----");
                    System.out.println("Nombre del Clientes: " + cliente);
                    System.out.println("Tipo de Cuenta: " + tipodeCuenta);
                    System.out.println(String.format("Saldo en Cuenta: %.2f", saldoDisponible));
                    System.out.println("-------------------------------");
                    System.out.println("");
   
                    do {
                        System.out.println("1.----Consultar Saldo");
                        System.out.println("2.----Retirar");
                        System.out.println("3.----Depositar");
                        System.out.println("9.----Salir del sistema");
                        System.out.println("-----------------------------------");
                        System.out.println("Ingresar el # de la opción deseada:");
                        preguntar = teclado.nextInt();
                        System.out.println("-----------------------------------");
                        switch (preguntar) {
                            case 1 -> {
                                System.out.println("Su saldo actual es: " + saldoDisponible);
                                System.out.println("---------------------------------------");
                                System.out.println("");
                            }
                            case 2 -> {
                                System.out.println("Ingrese el valor a RETIRAR. !(Recuerde que solo se permite valores cerrados)");
                                retirarValor = teclado.nextInt();
                                System.out.println("----------------------------------");
                                System.out.println("");
   
                                if (retirarValor > saldoDisponible) {
                                    System.out.println("Saldo insuficiente. Pruebe con un valor menor");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("");
                                } else {
                                    saldoDisponible -= retirarValor;
                                    System.out.println(String.format("----Nuevo Saldo: %.2f----", saldoDisponible));
                                    System.out.println("---------Retiro Exitoso-----------");
                                    System.out.println("----------------------------------");
                                    System.out.println("");
                                }
                            }
                            case 3 -> {
                                System.out.println("Ingrese el valor a DEPOSITAR. !(Recuerde que solo se permite valores cerrados)");
                                deposita = teclado.nextInt();
                                System.out.println("----------------------------------");
                                saldoDisponible += deposita;
                                System.out.println("---------Deposito Exitoso-----------");
                                System.out.println(String.format("------Nuevo Saldo: %.2f------", saldoDisponible));
                                System.out.println("----------------------------------");
                                System.out.println("");
                            }
                            case 9 -> {
                                System.out.println("-----Saliendo del Sistema------");
                                System.out.println("---------Vuelva Pronto---------");
                                System.out.println("");
                            }
                            default -> {
                                System.out.println("----------Opción no Disponible--------");
                                System.out.println("---------------------------------------");
                                System.out.println("");
                            }
                            }
                        } while (preguntar != 9);
                    } else {
                        System.out.println("-----------------------------------------");
                        System.out.println("-------Teléfono o Código incorrecto------");
                        System.out.println("-----------------------------------------");
                        System.out.println("");
                }
   
            } while ("".equals(salir));
        }
    }
}
