/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Paula
 */
public class register {
    int id;
    String nombre;
    Double precio;
    String descripcion;
    String color;
    int material;

//cree un metodo constructor basio
public register() {
}
//Añadi los parametros
public register(int id, String nombre, Double precio, String descripcion, String color, int material){
    this.id=id;
    this.nombre= nombre;
    this.precio=precio;
    this.descripcion=descripcion;
    this.color=color;
    this.material=material;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

}
