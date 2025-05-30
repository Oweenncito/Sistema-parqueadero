/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.iservice;

import java.util.List;
import models.EspacioParqueadero;
import models.Vehiculo;
import retrofit2.Call;
import retrofit2.http.*;

/**
 *
 * @author owenf
 */
public interface ApiEspacioService {
    
    @POST("/api/espacio/ingresar")
    Call<EspacioParqueadero> ingresarVehiculo(@Header("Authorization")String token, @Body Vehiculo vehiculo, @Query("user_id") Integer user_id, @Query("numero") int numero);
    
    @GET("/api/espacio/user/{user_id}")
    Call<List<EspacioParqueadero>> obtenerTodos(@Header("Authorization")String token, @Path("user_id") Integer user_id);

    @GET("/api/espacio/numero/{numero}")
    Call<EspacioParqueadero> obtenerPorId(@Path ("numero") int idEspacio);

    @POST("/api/espacio")
    Call<EspacioParqueadero> crear(@Body EspacioParqueadero espacioParqueadero);
    
    @PUT("/api/espacio/liberar")
    Call<EspacioParqueadero>liberarEspacio(@Header("Authorization")String token, @Query("user_id") Integer user_id, @Query("numero") int numero);
}