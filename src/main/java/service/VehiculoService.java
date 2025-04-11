package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Vehiculo;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.iservice.ApiVehiculoService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class VehiculoService {

    private ApiVehiculoService apiService;

    public VehiculoService() {
        setBaseUrl();
    }

    private void setBaseUrl() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new app.helper.LocalDateTimeAdapter()) // Registra el adaptador
                .registerTypeAdapter(LocalDate.class, new app.helper.LocalDateAdapter())
                .create();
        String BASE_URL = "http://localhost:8080";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        apiService = retrofit.create(ApiVehiculoService.class);
    }

    public List<Vehiculo>getVehiculos() {
        try {
            Response<List<Vehiculo>> response = apiService.getAll().execute();
            if (response.isSuccessful()) {
                return response.body();
            }
            else{
                System.out.println(response.code());
            }
            return null;
        } catch (IOException e) {
            throw new RuntimeException("Error al obtener los vehiculos");
        }
    }

    public void add (Vehiculo vehiculo){
        try {
            Response<Vehiculo> response = apiService.create(vehiculo).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
