/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.iservice;

import java.util.List;
import models.EspacioParqueadero;
import models.Vehiculo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author owenf
 */
public interface ApiEspacioService {
    
    @POST("/api/espacio/ingresar/{idEspacio}")
    Call<EspacioParqueadero> ingresarVehiculo(@Body Vehiculo vehiculo, @Path ("idEspacio") int idEspacio);
    
    @GET("/api/espacio")
    Call<List<EspacioParqueadero>> obtenerTodos();
}
