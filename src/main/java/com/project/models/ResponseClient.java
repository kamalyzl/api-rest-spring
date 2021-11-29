package com.project.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseClient {

    String status;
    List<Client> client;
}
