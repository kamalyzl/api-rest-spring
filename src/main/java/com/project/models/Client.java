package com.project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_client")
public class Client {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "document_type")
    private int documentType;

   // @OneToMany(mappedBy = "mClient")
   // private List<Delivery> deliveries;

}
