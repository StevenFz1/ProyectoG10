
package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
