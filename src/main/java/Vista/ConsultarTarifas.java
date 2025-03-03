/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author judav
 */
public class ConsultarTarifas {
    
    private String tipoVehiculo;
    private double tarifaPorHora;
    private double tarifaPorDia;

    public ConsultarTarifas(String tipoVehiculo, double tarifaPorHora, double tarifaPorDia, double descuentoClienteFrecuente) {
        this.tipoVehiculo = tipoVehiculo;
        this.tarifaPorHora = tarifaPorHora;
        this.tarifaPorDia = tarifaPorDia;
    }

    public double calcularCosto(int horas, boolean esClienteFrecuente) {
        double costo;
        if (horas >= 24) {
            costo = tarifaPorDia * (horas / 24);
        } else {
            costo = tarifaPorHora * horas;
        }
        return costo;
    }

    public void mostrarTarifas() {
        System.out.println("Tarifas para " + tipoVehiculo + ":");
        System.out.println("Tarifa por hora: $" + tarifaPorHora);
        System.out.println("Tarifa por día: $" + tarifaPorDia);
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }
}
