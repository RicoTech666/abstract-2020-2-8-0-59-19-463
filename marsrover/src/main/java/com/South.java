package com;

public class South implements IDirection{

    @Override
    public Direction turnLeft() {
        return new Direction('E', new East());
    }

    @Override
    public Direction turnRight() {
        return new Direction('W', new West());
    }
}
