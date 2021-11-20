package com.project.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_delivery")
public class Delivery {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_delivery")
    private long id;

    @Column(name = "count")
    private int count;


    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_date")
    private Date createDate;

    //@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne()
    @JoinColumn(name = "id_client")
    private Client client;


}
