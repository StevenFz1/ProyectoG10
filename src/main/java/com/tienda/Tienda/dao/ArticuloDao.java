
package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Articulo;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}
