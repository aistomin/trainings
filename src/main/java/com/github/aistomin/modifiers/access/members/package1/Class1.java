package com.github.aistomin.modifiers.access.members.package1;

import com.github.aistomin.modifiers.access.members.package2.Class2;

public class Class1 extends Class2 {

    public Class1() {
//        final int i = 0; // impossible: super(); must be the first line.
        super();
    }

    @Override
    protected void prot1() {
        int i = 0;
        super.prot1();
        i++;
    }

    @Override
    public void prot2() { // in Class2 protected in Class1 public.
        int i = 0;
        super.prot1();
        i++;
    }

//    @Override
//    private void prot3() { } // weaker access is impossible.

//    @Override // it's not an overriden Class2.def() it's just accident.
    public void def() {
        int i = 0;
        super.prot1();
        i++;
    }

    void testAccessProtectedMethodAsInstanceMethod() {
//        new Class2().prot1(); // impossible, only through inheritance.
    }
}
