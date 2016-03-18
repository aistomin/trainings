package com.github.aistomin.declaration;

public class VarArgs {

    void method(String... args) {
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
    }

    void method(String a, String... args) {
        System.out.println("a = " + a);
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
    }

//    void method(String a, String... args, String b) { // var-args must be the last parameter.
//        System.out.println("args = " + args);
//    }

    public static void main(String[] args) {
        final VarArgs test = new VarArgs();
        test.method(new String[]{"a", "b", "c", "d"});
        test.method("a", new String[]{"b", "c", "d"});
    }
}
