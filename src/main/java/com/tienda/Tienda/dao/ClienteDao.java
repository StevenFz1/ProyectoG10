
package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
    public List<Cliente> findByApellidos(String apellidos);
}
