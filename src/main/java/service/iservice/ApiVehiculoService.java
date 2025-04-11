package service.iservice;

import models.Vehiculo;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ApiVehiculoService {

    @GET ("/api/vehiculos")
    Call<List<Vehiculo>> getAll();

    @POST ("/api/vehiculos")
    Call<Vehiculo> create(@Body Vehiculo vehiculo);

    @DELETE ("/api/vehiculos/{id}")
    Call<Void> delete(@Path("id")String id);
}
