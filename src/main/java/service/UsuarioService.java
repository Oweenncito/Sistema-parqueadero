/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.IOException;
import java.util.List;

import dto.LoginDTO;
import dto.LoginResponseDTO;
import models.Usuario;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.iservice.ApiUsuarioService;


/**
 * @author judav
 */
public class UsuarioService {

    private ApiUsuarioService apiService;

    public UsuarioService() {
        setBaseUrl();
    }

    private void setBaseUrl() {

        String BASE_URL = "https://sistema-parqueadero-backend.onrender.com";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiUsuarioService.class);
    }

    public List<Usuario> getUsuarios() {
        try {
            Response<List<Usuario>> response = apiService.getAll().execute();
            if (!response.isSuccessful()) {
                System.out.println(response.code());
            }
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException("Error al obtener los usuarios");
        }
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

    public LoginResponseDTO searchUsers(String nombre, String contraseña) {
        try {
            LoginDTO loginDTO = new LoginDTO(nombre, contraseña);
            Response<LoginResponseDTO> response = apiService.searchUsers(loginDTO).execute();
            if (response.isSuccessful()) {
                LoginResponseDTO usuario = response.body();  // Recibimos un solo usuario directamente
                if (usuario != null) {
                    return usuario;  // Usuario encontrado
                } else {
                    System.out.println("No se encontró ningún usuario");
                }
            } else {
                System.out.println("Código: " + response.code());
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al validar usuario", e);
        }
        return null;
    }

}

