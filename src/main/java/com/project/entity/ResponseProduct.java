package com.project.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseProduct {

    String status;
    List<Product> product;
}
