/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author judav
 */
public class ConsultarTarifas {
    
    private String tipoVehiculo;
    private double tarifaPorHora;
    private double tarifaPorDia;

    public ConsultarTarifas(String tipoVehiculo, double tarifaPorHora, double tarifaPorDia) {
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
        JOptionPane.showMessageDialog(null,
                "Tarifas para " + tipoVehiculo + ":\n" +
                "Tarifa por hora: $" + tarifaPorHora + "\n" +
                "Tarifa por día: $" + tarifaPorDia,
                "Tarifas", JOptionPane.INFORMATION_MESSAGE);
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
