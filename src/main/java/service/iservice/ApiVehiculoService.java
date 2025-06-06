package service.iservice;

import models.Vehiculo;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ApiVehiculoService {

    @GET ("/api/vehiculos/user/{user_id}")
    Call<List<Vehiculo>> getAllByUserId(@Header("Authorization") String token, @Path("user_id")Integer user_id);

    @POST ("/api/vehiculos")
    Call<Vehiculo> create(@Body Vehiculo vehiculo);

    @DELETE ("/api/vehiculos/{id}")
    Call<Void> delete(@Path("id")Integer id);
    
  
}
