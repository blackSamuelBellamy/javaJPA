package cl.awakelab.miprimerspring.service;


import cl.awakelab.miprimerspring.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario crearUsuario(Usuario usuarioACrear);
    public Usuario actualizarUsuario(int id, Usuario usuario);
    public List<Usuario> listarUsuario();
    public Usuario devolverUsuarioId(int id);
    public void eliminarUsuario(int id);
    public void eliminarUsuario(Usuario usuario);
}
