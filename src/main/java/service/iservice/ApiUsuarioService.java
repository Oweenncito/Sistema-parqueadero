package service.iservice;

import dto.LoginDTO;
import dto.LoginResponseDTO;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.DELETE;
import retrofit2.http.Body;
import retrofit2.http.Path;
import java.util.List;
import models.Usuario;
import retrofit2.Call;

public interface ApiUsuarioService {

    @GET("/api/usuarios")
    Call<List<Usuario>> getAll();

    @POST("/api/usuarios")
    Call<Usuario> create(@Body Usuario usuario);

    @DELETE("/api/usuarios/{id}")
    Call<Void> delete(@Path("id") String id);
    
    @POST("/api/usuarios/login")
    Call<LoginResponseDTO> searchUsers(@Body LoginDTO login);

    
}