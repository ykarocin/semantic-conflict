package org.example;

public class Main {
    static Example x = new Example();
    public static void main(String[] args) {

        System.out.println("divider");
        x.plus_b(); // right
        int z = x.a + x.b;
        System.out.println(z);
    }
}