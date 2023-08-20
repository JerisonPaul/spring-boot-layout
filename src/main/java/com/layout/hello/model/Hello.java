package com.layout.hello.model;

import com.layout.hello.constants.enums.States;
import com.layout.hello.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Hello extends BaseEntity implements Serializable{
    private static final long serialVersionUID = -7300544011973193887L;

    @Column(nullable = true, columnDefinition = "varchar(255) COMMENT '姓名'")
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = true, length = 5)
    private States states = States.EFFECTIVE;

}
