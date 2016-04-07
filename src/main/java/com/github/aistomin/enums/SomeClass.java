package com.github.aistomin.enums;

public class SomeClass {
    public static void main(String[] args) {
//        new Parametrised("test"); not allowed
    }
}

enum Enum {
    VALUE1,
    VALUE2
}

//private enum Enum { // not allowed
//    VALUE1,
//    VALUE2
//}

enum Parametrised {
    PARAM1("param1"),
    PARAM2("param2");

    private String param;

    Parametrised(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }
}