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
 * Clase Persona que representa a una persona con nombre, edad y profesión.
 * Demuestra el uso de constructores por defecto, parametrizados y sobrecarga.
 */
public class Persona {
    private String nombre;
    private int edad;
    private String profesion;
    
    /**
     * Constructor por defecto.
     * Inicializa los atributos con valores predeterminados.
     */
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.profesion = "Sin profesión";
    }
    
    /**
     * Constructor parametrizado.
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     * @param profesion Profesión de la persona
     */
    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }
    
    /**
     * Constructor sobrecargado (solo nombre y edad).
     * La profesión se establece como "Desconocida".
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = "Desconocida";
    }
    
    // Métodos getter y setter (encapsulamiento)
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getProfesion() {
        return profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", profesion='" + profesion + '\'' +
               '}';
    }
}
