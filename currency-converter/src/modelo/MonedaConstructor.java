package modelo;

import record.Moneda;

public class MonedaConstructor {
    private String actual;
    private String cambio;
    private double tasa;
    private double conversion;

    public MonedaConstructor(Moneda moneda) {
        this.actual = moneda.base_code();
        this.cambio = moneda.target_code();
        this.tasa = moneda.conversion_rate();
        this.conversion = moneda.conversion_result();
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    @Override
    public String toString() {
        return "Conversor: Base= " + actual +
                ", Cambio= " + cambio +
                ", Tasa= " + tasa +
                ", Conversion= " + conversion;
    }

}
