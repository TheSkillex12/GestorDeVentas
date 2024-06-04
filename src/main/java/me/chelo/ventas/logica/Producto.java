package me.chelo.ventas.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String cantidad;
    private String producto;
    private String metodoPago;
    private Double precio;

    public Producto() {
    }

    public Producto(int id, String cantidad, String producto, String metodoPago, Double precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.metodoPago = metodoPago;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", cantidad=" + cantidad + ", producto=" + producto + ", metodoPago=" + metodoPago + ", precio=" + precio + '}';
    }
    
    
}
