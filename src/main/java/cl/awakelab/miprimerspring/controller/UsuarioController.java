package cl.awakelab.miprimerspring.controller;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    IUsuarioService objUsuarioService;

    @GetMapping("/crearUsuario")
    public String mostrarFormularioCrearUsuario(){
        return "crearUsuario";
    }

    @PostMapping("/crearUsuario")
    public String crearFormulario(@ModelAttribute Usuario usuario){
        objUsuarioService.crearUsuario(usuario);
        return "redirect/:usuario";
    }

    @GetMapping
    public String listarUsuarios(Model model){
        List<Usuario> listaDeUsuarios = objUsuarioService.listarUsuario();
        model.addAttribute("atributoListaUsuarios", listaDeUsuarios);
        return "templateListarUsuarios";
    }

    @GetMapping("/{id}")
    public String listarUsuarioId(Model model, @PathVariable int id){
        Usuario usuario = objUsuarioService.devolverUsuarioId(id);
        model.addAttribute("usuario", usuario);
        return "templateListarUsuariosId";
    }
}
