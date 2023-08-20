package com.layout.hello.constants.enums;

public enum States {
    EFFECTIVE("有效"),
    INVALID("失效");

    private String desc;

    States(String desc) {this.desc = desc; }

    public String getDesc() {
        return desc;
    }
}
