/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

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
    
    public static void consultarTarifas(ConsultarTarifas moto, ConsultarTarifas carro) {
        String opcionStr = JOptionPane.showInputDialog(null,
                "--- Consulta de Tarifas ---\n" +
                "1. Moto\n" +
                "2. Carro\n" +
                "3. Camión\n" +
                "Seleccione el tipo de vehículo:", "Tarifas", JOptionPane.QUESTION_MESSAGE);
        
        if (opcionStr == null) {
            return;
        }
        
        try {
            int opcion = Integer.parseInt(opcionStr);
            
            switch (opcion) {
                case 1:
                    moto.mostrarTarifas();
                    break;
                case 2:
                    carro.mostrarTarifas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida. Ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
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
