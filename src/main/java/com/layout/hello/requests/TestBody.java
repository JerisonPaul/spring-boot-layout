package com.layout.hello.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class TestBody implements Serializable {

    private static final long serialVersionUID = -7151464967889396022L;

    @NotNull(message = "id cannot be empty")
    private Integer id;

    @NotEmpty(message = "name cannot be empty")
    private String name;
}
