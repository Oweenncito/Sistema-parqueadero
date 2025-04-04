/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.UUID;

/**
 *
 * @author judav
 */
public class ClienteMensualidad {
    
    public String nombre;
    public String apellido;
    public String id;
    public String placaVehiculo;
    
    public ClienteMensualidad(){
        this.id = UUID.randomUUID().toString();
    }
    
    public ClienteMensualidad(String nombre, String apellido,String id, String placaVehiculo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = UUID.randomUUID().toString() ;
        this.placaVehiculo = placaVehiculo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getid(){
        return id;
    }
    
    public void setid(String id){
        this.id = id;
    }
    
    
    public String getPlacaVehiculo(){
        return placaVehiculo;
    }
    
    public void setPlacaVehiculo(String placaVehiculo){
        this.placaVehiculo = placaVehiculo;
    }
}

