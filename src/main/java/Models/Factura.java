/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class Factura {
	   private Cliente placaVehiculo;
	    private LocalDateTime horaIngreso;
	    private LocalDateTime horaSalida;
	    private double totalPagar;

	    public Factura(Cliente placaVehiculo, LocalDateTime horaIngreso, LocalDateTime horaSalida, double totalPagar) {
	        this.placaVehiculo = placaVehiculo;
	        this.horaIngreso = horaIngreso;
	        this.horaSalida = horaSalida;
	        this.totalPagar = totalPagar;
	    }

	    public Cliente getPlacaVehiculo() {
	        return placaVehiculo;
	    }

	    public void setPlacaVehiculo(Cliente placaVehiculo) {
	        this.placaVehiculo = placaVehiculo;
	    }

	    public LocalDateTime getHoraIngreso() {
	        return horaIngreso;
	    }

	    public void setHoraIngreso(LocalDateTime horaIngreso) {
	        this.horaIngreso = horaIngreso;
	    }

	    public LocalDateTime getHoraSalida() {
	        return horaSalida;
	    }

	    public void setHoraSalida(LocalDateTime horaSalida) {
	        this.horaSalida = horaSalida;
	    }

	    public double getTotalPagar() {
	        return totalPagar;
	    }

	    public void setTotalPagar(double totalPagar) {
	        this.totalPagar = totalPagar;
	    }
	   
	}