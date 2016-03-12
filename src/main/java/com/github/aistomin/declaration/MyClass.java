package com.github.aistomin.declaration;

import static com.github.aistomin.declaration.Test.test;
import static com.github.aistomin.declaration.Test.CONST;
import static com.github.aistomin.declaration.Test.stat;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        final List list = Arrays.asList(args);
        final String test = test(list);
        System.out.println("CONST = " + CONST);
        System.out.println("stat = " + stat);
        System.out.println("test = " + test);
    }
}
