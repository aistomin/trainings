package com.github.aistomin.interfaces;

public interface MyInterface {

    String IMPLICIT = "implicit";

    public static final String EXPLICIT = "explicit";

//    protected static final String WRONG = "wrong";
//    private static final String WRONG = "wrong";

    void implicit();

    public abstract void explicit();

    abstract interface Explicit {}

    class Clazz {
        public void doSomething() {
            System.out.println("Something was done.");
        }
    }
}
