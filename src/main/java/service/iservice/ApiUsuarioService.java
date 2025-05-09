package service.iservice;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.DELETE;
import retrofit2.http.Body;
import retrofit2.http.Path;
import java.util.List;
import models.Usuario;
import retrofit2.Call;

public interface ApiUsuarioService {

    @GET("/api/usuariosqs")
    Call<List<Usuario>> getAll();

    @POST("/api/usuariosqs")
    Call<Usuario> create(@Body Usuario usuario);

    @DELETE("/api/usuariosqs/{id}")
    Call<Void> delete(@Path("id") String id);
}
