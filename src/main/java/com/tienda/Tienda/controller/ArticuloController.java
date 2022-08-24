
package com.tienda.Tienda.controller;


import com.tienda.Tienda.domain.Articulo;
import com.tienda.Tienda.service.ArticuloService;
import com.tienda.Tienda.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticuloController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/articulo/listado")
    public String inicio(Model model){
        var articulos=articuloService.getArticulos(false);
        model.addAttribute("articulos",articulos);
        return "/articulo/listado";
    }
    
@GetMapping("/articulo/nuevo")
    public String nuevoArticulo(Articulo articulo, Model model){
        var categorias=categoriaService.getCategorias(true);
        model.addAttribute("categorias", categorias);
        return "/articulo/modifica";
    }
    
    @PostMapping("/articulo/guardar")
    public String guardarArticulo(Articulo articulo){
        articuloService.save(articulo);
        return "redirect:/articulo/listado";
    }
    
    @GetMapping ("/articulo/modificar/{idArticulo}")
    public String modificarArticulo (Articulo articulo, Model model){
        var categorias=categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        return "/articulo/modifica";
    }
    
     @GetMapping("/articulo/eliminar/{idArticulo}")
    public String eliminarArticulo(Articulo articulo){
        articuloService.delete(articulo);
        return "redirect:/articulo/listado";
    }
}
