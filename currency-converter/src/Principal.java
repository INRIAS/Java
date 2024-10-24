import conexion.Conexion;
import record.Moneda;

public class Principal {
    public static void main(String[] args) throws Exception {
        Conexion consulta = new Conexion();
        Moneda moneda = consulta.parMoneda("USD", "COP");
        System.out.println(moneda);
    }
}
