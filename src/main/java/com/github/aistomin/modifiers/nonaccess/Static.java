package com.github.aistomin.modifiers.nonaccess;

public class Static {

    class Nested {
        public final static String TEST = "test";
//        public static String test; // impossible
//        static void test() { // impossible.
//
//        }
    }

    class NestedStatic {
        public final static String TEST = "test";
//        public static String test; // impossible
//        static void test() { // impossible
//
//        }
    }
}
