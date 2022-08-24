
package com.tienda.Tienda.service;

import com.tienda.Tienda.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activos);
    
    public void save (Articulo cliente);
    
    public void delete (Articulo cliente);
    
    public Articulo getArticulo (Articulo cliente);
}
