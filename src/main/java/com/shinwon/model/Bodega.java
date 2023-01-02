package com.shinwon.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "bodega")
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bodega")
    private Integer idBodega;

    @OneToOne
    private Empleado empleado;

    @Column(name = "bodega", nullable = false)
    private String bodega;

    @Column(name = "ubicacion", nullable = false)
    private String ubicacion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

    @CreationTimestamp
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @OneToMany(mappedBy = "bodega", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Linea> linea;
}
