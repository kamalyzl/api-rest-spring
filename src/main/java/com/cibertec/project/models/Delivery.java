package com.cibertec.project.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_delivery")
public class Delivery {

    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_delivery")
    private long idDelivery;

    @Column(name = "count")
    private int count;

    @Column(name = "create_date")
    private Date createDate;

    //@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne()
    @JoinColumn(name = "id_client")
    private Client client;

    public long getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(long idDelivery) {
        this.idDelivery = idDelivery;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
