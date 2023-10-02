package com.TiendaLupita.SistemaWeb.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@Data
@Entity
@Table(name = "Usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")Integer id_usuario;
    @Column(name = "nombre")String nombre;
    @Column(name = "apellidos")String apellidos;
    @Column(name = "fecha_Nacimiento")Date fecha_Nacimiento;
    @Column(name = "horario")String horario;
    @Column(name = "edad")Integer edad;
    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private CargoModel cargo;

}
