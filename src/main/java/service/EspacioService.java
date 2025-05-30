package service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.LoginResponseDTO;
import models.EspacioParqueadero;
import models.Vehiculo;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.iservice.ApiEspacioService;

public class EspacioService {

    private ApiEspacioService espacioService;

    public EspacioService() {

        setBaseUrl();
    }

    private void setBaseUrl() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new app.helper.LocalDateTimeAdapter())
                .registerTypeAdapter(LocalDate.class, new app.helper.LocalDateAdapter())
                .create();

        String BASE_URL = "https://sistema-parqueadero-backend.onrender.com";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        espacioService = retrofit.create(ApiEspacioService.class);
    }

    public EspacioParqueadero getById(int id) {
        try {
            Response<EspacioParqueadero> respuesta = espacioService.obtenerPorId(id).execute();
            return respuesta.body();
        } catch (IOException ex) {
            Logger.getLogger(EspacioService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public EspacioParqueadero crear(EspacioParqueadero espacio) {
        try {
            Response<EspacioParqueadero> respuesta = espacioService.crear(espacio).execute();
            return respuesta.body();
        } catch (IOException ex) {
            Logger.getLogger(EspacioService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public EspacioParqueadero ingresarVehiculo(Vehiculo vehiculo, int idEspacio, LoginResponseDTO loginResponseDTO) {
        try {
            String token = "Bearer " + loginResponseDTO.getToken();
            Response<EspacioParqueadero> respuesta = espacioService.ingresarVehiculo(token, vehiculo, loginResponseDTO.getUser().getId(), idEspacio).execute();
            if (!respuesta.isSuccessful()) {
                System.out.println("Error: " + respuesta.code());
            }
        } catch (IOException ex) {
            Logger.getLogger(EspacioService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<EspacioParqueadero> obtenerTodos(LoginResponseDTO loginResponseDTO) {
        try {
            String token = "Bearer " + loginResponseDTO.getToken();
            Response<List<EspacioParqueadero>> respuesta = espacioService.obtenerTodos(token, loginResponseDTO.getUser().getId()).execute();
            if (respuesta.isSuccessful()) {
                return respuesta.body();
            }
            System.out.println("gonorrea");
        } catch (IOException ex) {
            System.out.println("hpta");
        }
        System.out.println("sapaa");
        return null;
    }

    public EspacioParqueadero liberarEspacio(int numeroEspacio, LoginResponseDTO loginResponseDTO) {
        try {
            String token = "Bearer " + loginResponseDTO.getToken();
            Response<EspacioParqueadero> respuesta = espacioService.liberarEspacio(token, loginResponseDTO.getUser().getId(), numeroEspacio).execute();
            if (respuesta.isSuccessful()) {
                return respuesta.body();
            }
        } catch (IOException ex) {
            Logger.getLogger(EspacioService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}