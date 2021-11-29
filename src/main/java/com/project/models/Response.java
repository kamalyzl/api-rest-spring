package com.project.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response {
    String status;
    List<Delivery> delivery;

}
