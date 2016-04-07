package com.github.aistomin.enums;

public class SomeClass {
    public static void main(String[] args) {
//        new Parametrised("test"); not allowed
        System.out.println("ConstSpec.NORMAL = " + ConstSpec.NORMAL.doSomething());
        System.out.println("ConstSpec.SPECIFIC = " + ConstSpec.SPECIFIC.doSomething());
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

enum ConstSpec {

    NORMAL,
    SPECIFIC {
        @Override
        String doSomething() {
            return "something special";
        }
    }
    ;
    String doSomething() {
        return "something";
    }
}