package com.project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "tb_product")
public class Product {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private int type;

    @Column(name = "description")
    private String description;

}
