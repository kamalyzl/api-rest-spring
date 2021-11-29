package com.project.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseDelivery {
    String status;
    List<Delivery> delivery;

}
