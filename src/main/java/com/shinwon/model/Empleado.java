package com.shinwon.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer idEmpleado;

    @ManyToOne
    @JoinColumn(name = "id_puesto", nullable = false, foreignKey = @ForeignKey(name = "FK_empleado_puesto"))
    private Puesto puesto;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "email")
    private String email;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @CreationTimestamp
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;





}
