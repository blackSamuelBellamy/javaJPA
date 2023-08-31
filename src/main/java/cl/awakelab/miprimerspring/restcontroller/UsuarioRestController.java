package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {
    @Autowired
    IUsuarioService objUsuarioService;

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){
        return objUsuarioService.crearUsuario(usuario);
    }
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return objUsuarioService.listarUsuario();
    }

    @PostMapping
    public Usuario actualizarUsuario(@RequestBody int id, Usuario usuario){
        return objUsuarioService.actualizarUsuario(id, usuario);
    }

    @PostMapping
    public Usuario devolverUsuarioId(@RequestBody int id){
        return objUsuarioService.devolverUsuarioId(id);
    }
    public void eliminarUsuario(@RequestBody int id) {
        objUsuarioService.eliminarUsuario(id);
    }
    public void eliminarUsuario2(@RequestBody Usuario usuario) {objUsuarioService.eliminarUsuario2(usuario);}

}

