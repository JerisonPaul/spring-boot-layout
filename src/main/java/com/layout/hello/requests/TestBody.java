package com.layout.hello.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestBody implements Serializable {

    private static final long serialVersionUID = -7151464967889396022L;

    private int id;
    private String name;
}
