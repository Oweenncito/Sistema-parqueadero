/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import models.Usuario;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.iservice.ApiUsuarioService;


/**
 *
 * @author judav
 */
public class UsuarioService {

    private ApiUsuarioService apiService;

    public UsuarioService() {
        setBaseUrl();
    }

    private void setBaseUrl() {
  
        String BASE_URL = "http://localhost:8080";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiUsuarioService.class);
    }

    public List<Usuario> getUsuarios() {
        try {
            Response<List<Usuario>> response = apiService.getAll().execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                System.out.println(response.code());
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al obtener los usuarios");
        }
        return null;
    }

    public void add(Usuario usuario) {
        try {
            Response<Usuario> response = apiService.create(usuario).execute();
        } catch (IOException e) {
            throw new RuntimeException("Error al crear usuario", e);
        }
    }

    public void remove(String id) {
        try {
            Response<Void> response = apiService.delete(id).execute();
        } catch (IOException e) {
            throw new RuntimeException("Error al eliminar usuario", e);
        }
    }
    
   public Usuario searchUsers(String nombre, String contraseña) {
    try {
        Response<List<Usuario>> response = apiService.searchUsers(nombre, contraseña).execute();
        if (response.isSuccessful()) {
            List<Usuario> listaUsuarios = response.body();
            if (listaUsuarios != null && !listaUsuarios.isEmpty()) {
                return listaUsuarios.get(0); // ✅ Devuelve el primer usuario de la lista
            } else {
                System.out.println("La lista de usuarios está vacía");
            }
        } else {
            System.out.println("Código: " + response.code()); // 401 si no autorizado
        }
    } catch (IOException e) {
        throw new RuntimeException("Error al validar usuario", e);
    }

    return null; // Usuario no válido
}
  
}

