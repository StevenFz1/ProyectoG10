
package com.tienda.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long idArticulo;
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private Double precio;
    private int existencias;
    private boolean activo;
    @Column(name="ruta_imagen")
    private String rutaImagen;
    

    public Articulo() {
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, Double precio, int existencias, boolean activa) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activa;
    }

   

    

}