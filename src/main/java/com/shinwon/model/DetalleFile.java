package com.shinwon.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "detalle_file")
public class DetalleFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_file")
    private Integer idDetalleFile;

    @ManyToOne
    @JoinColumn(name = "id_file", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_file"))
    private File file;

    @ManyToOne
    @JoinColumn(name = "id_bodega", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_bodega"))
    private Bodega bodega;

    @ManyToOne
    @JoinColumn(name = "id_linea", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_linea"))
    private Linea linea;

    @ManyToOne
    @JoinColumn(name = "id_color", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_color"))
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_talla", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_talla"))
    private Talla talla;

    @Column(name = "po", nullable = false)
    private String po;

    @Column(name = "cant_pizas", nullable = false)
    private Long cantPiezas;

    @Column(name = "fecha_expo", nullable = false)
    private LocalDate fechaExpo;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

}
