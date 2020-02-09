package com;

public class East implements IDirection {

    @Override
    public Direction turnLeft() {
        return new Direction('N', new North());
    }

    @Override
    public Direction turnRight() {
        return new Direction('S', new South());
    }
}
