package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        y = AddOne.AddOne(y); //right
        int z = x + y;
        System.out.println(z);
    }
}