package me.chelo.ventas.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String apellido;
    private String entrada;
    private boolean cajaAbierta;
    private int ventas;

    public Vendedor(int id, String nombre, String apellido,String entrada, boolean cajaAbierta, int ventas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.entrada = entrada;
        this.cajaAbierta = cajaAbierta;
        this.ventas = ventas;
    }
    
    public Vendedor(){
        
    }
    
    public void setVentas(int ventas){
        this.ventas = ventas;
    }
    
    public int getVentas(){
        return ventas;
    }
    
    public boolean isCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEntrada(String entrada){
        this.entrada = entrada;
    }
    
    public String getEntrada(){
        return entrada;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cajaAbierta=" + cajaAbierta + '}';
    }
    
    
    
}
