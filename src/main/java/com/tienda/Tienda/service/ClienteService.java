
package com.tienda.Tienda.service;

import com.tienda.Tienda.domain.Cliente;
import java.util.List;


public interface ClienteService {
    
    
    
    public List<Cliente> getClientes();
    
    public void save (Cliente cliente);
    
    public void delete (Cliente cliente);
    
    public Cliente getCliente (Cliente cliente);
}
