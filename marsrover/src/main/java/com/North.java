package com;

public class North implements IDirection{

    @Override
    public Direction turnLeft() {
        return new Direction('W', new West());
    }

    @Override
    public Direction turnRight() {
        return new Direction('E', new East());
    }
}
