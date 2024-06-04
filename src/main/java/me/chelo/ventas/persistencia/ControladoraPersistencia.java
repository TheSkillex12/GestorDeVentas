package me.chelo.ventas.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.chelo.ventas.logica.Producto;
import me.chelo.ventas.logica.Vendedor;
import me.chelo.ventas.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    private ProductoJpaController productoJpa = new ProductoJpaController();
    private VendedorJpaController vendedorJpa = new VendedorJpaController();

    public boolean checkCajaAbierta() {
        boolean caja = false;
        for(Vendedor v : vendedorJpa.findVendedorEntities()){
            if(v.isCajaAbierta()){
                caja = true;
            }
        }
        return caja;
    }

    public Vendedor traerVendedor(String nombre, String apellido) {
        Vendedor vendedor = null;
        for(Vendedor v : vendedorJpa.findVendedorEntities()){
            if(v.getNombre().equalsIgnoreCase(nombre) && v.getApellido().equalsIgnoreCase(apellido)){
                vendedor = vendedorJpa.findVendedor(v.getId());
            }
        }
        return vendedor;
    }

    public void crearVendedor(Vendedor v) {
        vendedorJpa.create(v);
    }

    public Iterable<Vendedor> traerVendedores() {
        return vendedorJpa.findVendedorEntities();
    }

    public void editarVendedor(Vendedor vendedor) {
        try {
            vendedorJpa.edit(vendedor);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Producto> traerProductos() {
        return productoJpa.findProductoEntities();
    }

    public void crearProducto(Producto p) {
        productoJpa.create(p);
    }

    public void editarProducto(Producto producto) {
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(int num_cliente) {
        return productoJpa.findProducto(num_cliente);
    }

    public void borrarProducto(int num_cliente) {
        try {
            productoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetIds() {
        productoJpa.resetIds();
    }
    
}
