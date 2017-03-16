package com.github.aistomin.equals;

/**
 * Created by aistomin on 16/03/2017.
 */
public class EgualsAndCompare implements Comparable<EgualsAndCompare> {

    private final String name;

    public EgualsAndCompare(final String name) {
        this.name = name;
    }

    public int compareTo(EgualsAndCompare o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        final EgualsAndCompare first = new EgualsAndCompare("test");
        final EgualsAndCompare second = new EgualsAndCompare("test");
        assert !first.equals(second);
    }
}
