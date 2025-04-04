/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.UUID;

/**
 *
 * @author PC
 */
public class Cliente {
    private String nombre;
   private String apellido;
   private String id;
   private String telefono;
   private String placaVehiculo;

public Cliente () {
	
	this.id = UUID.randomUUID().toString();
	
}
   public Cliente(String nombre, String apellido, String telefono, String placaVehiculo) {
       this.nombre = nombre;
       this.apellido = apellido; 
       this.id = UUID.randomUUID().toString();
       this.telefono = telefono;
       this.placaVehiculo = placaVehiculo;
//La factura se generará después
   }

   // Getters y Setters
   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getApellido() {
       return apellido;
   }

   public void setApellido(String apellido) {
       this.apellido = apellido;
   }

   public String getId() {
       return id;
   }

   public void setCedula(String id) {
       this.id= id;
   }

   public String getTelefono() {
       return telefono;
   }

   public void setTelefono(String telefono) {
       this.telefono = telefono;
   }

   public String getPlacaVehiculo() {
       return placaVehiculo;
   }

   public void setPlacaVehiculo(String placaVehiculo) {
       this.placaVehiculo = placaVehiculo;
   }
}
