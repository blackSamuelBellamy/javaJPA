package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.repository.IUsuarioRepository;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("usuarioServiceimpl")
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    IUsuarioRepository objUsuarioRepo;
    @Override
    public Usuario crearUsuario(Usuario usuarioACrear) {
        Usuario usuario = new Usuario();
        usuario = objUsuarioRepo.save(usuarioACrear);
        return usuario;
    }

    @Override
    public Usuario actualizarUsuario(int id, Usuario usuarioActualizar) {
        Usuario usuarioEncontrado = objUsuarioRepo.findById(id).orElse(null);
        usuarioEncontrado.setNombreUsuario(usuarioActualizar.getNombreUsuario());
        usuarioEncontrado.setRol(usuarioActualizar.getRol());
        usuarioEncontrado.setContrasena(usuarioActualizar.getContrasena());
        return objUsuarioRepo.save(usuarioEncontrado);
    }

    @Override
    public List<Usuario> listarUsuario() {
        List<Usuario> listarUsuarios = new ArrayList<>();
        listarUsuarios = objUsuarioRepo.findAll();
        return listarUsuarios;
    }

    @Override
    public Usuario devolverUsuarioId(int id) {
        return objUsuarioRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuario(int id) {
        objUsuarioRepo.deleteById(id);
    }

    @Override
    public void eliminarUsuario2(Usuario usuario) {

    }

}
