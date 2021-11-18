package com.cibertec.project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long idClient;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "document_type")
    private int documentType;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Delivery> delivery;

    public Client() {

    }
    public Client(long idClient, String name, String lastName, String documentNumber, int documentType) {
        this.idClient = idClient;
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", documentType=" + documentType +
                '}';
    }


}
