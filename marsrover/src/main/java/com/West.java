package com;

public class West implements IDirection{

    @Override
    public Direction turnLeft() {
        return new Direction('S', new South());
    }

    @Override
    public Direction turnRight() {
        return new Direction('N', new North());
    }
}
