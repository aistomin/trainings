package com.github.aistomin;

import static com.github.aistomin.Test.test;
import static com.github.aistomin.Test.CONST;
import static com.github.aistomin.Test.stat;
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
