package com.shinwon.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table
public class Linea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_linea")
    private Integer idLinea;

    @ManyToOne
    @JoinColumn(name = "id_bodega", nullable = false, foreignKey = @ForeignKey(name = "FK_linea_bodega"))
    private Bodega bodega;

    @OneToOne()
    private Empleado empleado;

    @Column(name = "linea", nullable = false)
    private Integer linea;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

    @CreationTimestamp
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;



}
