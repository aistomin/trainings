package com.github.aistomin.modifiers.nonaccess;

//public final abstract class FinalAbstractClass { final + abstract is impossible.

final class FinalClass {

//    abstract void abs(); impossible, class must be defined as abstract.
}

abstract class AbstractClass {

    void concrete() {
    }

    abstract void abstracto();
}
