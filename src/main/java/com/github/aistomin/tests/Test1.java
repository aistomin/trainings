package com.github.aistomin.tests;

enum Animals {
    DOG("woof"),
    CAT("meow"),
    FISH("burble");
    String sound;
    Animals(String s) {
        this.sound = s;
    }
}

class TestEnum {
    static Animals a;

    public static void main(String[] args) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}

interface Device {
    public void doIt();
}

class Electronic implements Device {
    public void doIt() {
//        long [] x [5];
        Boolean []ba[];
    }
}

class Phone3 extends Electronic implements Device {

}