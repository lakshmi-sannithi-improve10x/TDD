package com.improve10x.fibonacci.templerungame;

public class Coin extends Obstacle {
    private int value;

    public Coin(int value) throws InvalidObstacleDamageException {
        super("Coin",0);
        if (value < 0 || value > 100) {
            throw new InvalidCoinValueException();
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public class InvalidCoinValueException extends RuntimeException {
    }
}
