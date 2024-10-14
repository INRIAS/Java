package com.alura.desafioarray.modelos;

public class Compra {
    private int billeteraVirtual;
    private int almacenarCosto;
    private String producto;
    private int valorProducto;

    public int getBilleteraVirtual() {
        return billeteraVirtual;
    }

    public void setBilleteraVirtual(int billeteraVirtual) {
        this.billeteraVirtual = billeteraVirtual;
    }

    public int getAlmacenarCosto() {
        return almacenarCosto;
    }

    public void setAlmacenarCosto(int almacenarCosto) {
        this.almacenarCosto = almacenarCosto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    
    public void almacenarTotal(){
        this.almacenarCosto+=getValorProducto();
    }
}
