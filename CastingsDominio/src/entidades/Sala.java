/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Sala {
    String nombre;
    Direccion direccion;
    String descripcion;

    public Sala() {
    }

    public Sala(String nombre, Direccion direccion, String descripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", direccion=" + direccion + ", descripcion=" + descripcion + '}';
    }
    
    
}
