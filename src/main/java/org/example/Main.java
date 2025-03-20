package org.example;

public class Main {
    static Foo a = new Foo();
    static Foo b = new Foo();
    public static void main(String[] args) {
        PlusOne.AddOne(b); //right
        int z = a.x + b.x;
        System.out.println(z);
    }
}