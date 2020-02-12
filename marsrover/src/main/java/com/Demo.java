package com;

public class Demo {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        Direction direction = new Direction('E');
        System.out.println(direction);
        direction = direction.turnLeft();
        System.out.println(direction);
        direction = direction.turnRight();
        direction = direction.turnRight();
        System.out.println(direction);
    }
}
