
package com.tienda.Tienda.dao;

import com.tienda.Tienda.domain.Cliente;
import com.tienda.Tienda.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);
}
