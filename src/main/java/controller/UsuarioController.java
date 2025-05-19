/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import models.Usuario;
import service.UsuarioService;

/**
 *
 * @author judav
 */
public class UsuarioController {
    
     UsuarioService usuarioService;

    public UsuarioController() {
        this.usuarioService = new UsuarioService();
    }

    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    public void addUsuario(Usuario usuario) {
        usuarioService.add(usuario);
    }

    public void removeUsuario(String id) {
        usuarioService.remove(id);
    }
    
    public Usuario validarUsuario(String nombre, String contraseña){
        return  usuarioService.searchUsers(nombre, contraseña);
    }
}
