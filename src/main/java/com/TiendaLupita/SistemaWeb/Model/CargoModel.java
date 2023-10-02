package com.TiendaLupita.SistemaWeb.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cargo")
public class CargoModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_cargo")
        private Integer idCargo;
        @Column(name = "nombre")
        private String nombre;


}
