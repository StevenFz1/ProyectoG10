
package com.tienda.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private boolean activo;
    

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activa) {
        this.descripcion = descripcion;
        this.activo = activa;
    }

    

}
