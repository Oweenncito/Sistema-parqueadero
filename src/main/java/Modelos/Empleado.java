/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author PC
 */
public class Empleado {
    
    public String nombre;
    public int ID;
    public String turno;
    public String cargo;
           
    public Empleado(String nombre, int ID, String turno, String cargo){
        this.nombre = nombre;
        this.ID = ID;
        this.turno = turno;
        this.cargo = cargo;
    }
   
    public String getnombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getId(){
        return ID;
    }
    
    public void setId(int ID){
        this.ID = ID;
    }
    
     public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
     public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
