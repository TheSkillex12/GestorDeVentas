package me.chelo.ventas.logica;

import java.util.List;
import me.chelo.ventas.persistencia.ControladoraPersistencia;

public class Controladora {
    
    private ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public boolean checkCajaAbierta() {
        return controlPersis.checkCajaAbierta();
    }

    public Vendedor traerVendedor(String nombre, String apellido) {
        return controlPersis.traerVendedor(nombre ,apellido);
    }

    public void crearVendedor(String nombre, String apellido,String entrada, boolean b) {
        Vendedor v = new Vendedor();
        v.setNombre(nombre);
        v.setApellido(apellido);
        v.setEntrada(entrada);
        v.setCajaAbierta(b);
        v.setVentas(1);
        
        controlPersis.crearVendedor(v);
    }

    public Iterable<Vendedor> traerVendedores() {
        return controlPersis.traerVendedores();
    }

    public void editarVendedor(Vendedor vendedor) {
        controlPersis.editarVendedor(vendedor);
    }

    public List<Producto> traerProductos() {
        return controlPersis.traerProductos();
    }

    public void crearProducto(String cantidad, String producto, String metodo, double precio) {
        Producto p = new Producto();
        p.setCantidad(cantidad);
        p.setPrecio(precio);
        p.setProducto(producto);
        p.setMetodoPago(metodo);
        
        controlPersis.crearProducto(p);
    }

    public void editarProducto(Producto producto) {
        controlPersis.editarProducto(producto);
    }

    public Producto traerProducto(int num_cliente) {
        return controlPersis.traerProducto(num_cliente);
    }

    public void borrarProducto(int num_cliente) {
        controlPersis.borrarProducto(num_cliente);
    }

    public void resetIds() {
        controlPersis.resetIds();
    }
    
}
