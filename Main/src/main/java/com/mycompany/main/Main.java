/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author WILLIANS
 */
/**
 * Programa que demuestra el uso de constructores en Java,
 * incluyendo constructores por defecto, parametrizados y sobrecarga.
 */
public class Main {

    public static void main(String[] args) {

        // Crear instancias usando diferentes constructores
        
        // Constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Persona 1 (constructor por defecto): " + persona1);
        
        // Constructor parametrizado
        Persona persona2 = new Persona("David", 25, "Ingeniero");
        System.out.println("Persona 2 (constructor parametrizado): " + persona2);
        
        // Constructor sobrecargado (solo nombre y edad)
        Persona persona3 = new Persona("Antonio", 28);
        System.out.println("Persona 3 (constructor sobrecargado): " + persona3);
        
        // Crear instancia de otra clase con constructores
        Producto producto1 = new Producto();
        System.out.println("Producto 1 (constructor por defecto): " + producto1);
        
        Producto producto2 = new Producto("Laptop", 1200.99, 10);
        System.out.println("Producto 2 (constructor parametrizado): " + producto2);
    }
}
    
