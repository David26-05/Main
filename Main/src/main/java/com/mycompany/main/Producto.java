/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author WILLIANS
 */
/**
 * Clase Producto que representa un producto en un inventario.
 * Demuestra otro ejemplo de constructores.
 */
public class Producto {
     private String nombre;
    private double precio;
    private int cantidadStock;
    
    /**
     * Constructor por defecto.
     * Inicializa los atributos con valores predeterminados.
     */
    public Producto() {
        this.nombre = "Producto genérico";
        this.precio = 0.0;
        this.cantidadStock = 0;
    }
    
    /**
     * Constructor parametrizado.
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param cantidadStock Cantidad en stock
     */
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    
    // Métodos getter y setter (encapsulamiento)
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidadStock() {
        return cantidadStock;
    }
    
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
               "nombre='" + nombre + '\'' +
               ", precio=" + precio +
               ", cantidadStock=" + cantidadStock +
               '}';
    }
}