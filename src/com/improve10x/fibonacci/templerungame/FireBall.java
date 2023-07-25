package com.improve10x.fibonacci.templerungame;

public class FireBall extends Obstacle{
    private int speed;
    public FireBall(int speed) throws InvalidObstacleDamageException {
        super("Fireball",30);
        if (speed < 0 || speed > 100){
            throw new InvalidFireBallSpeedException();
        }
        this.speed = speed;
    }

    public void roll() {
        System.out.println("FireBall is rolled with " + speed + " kmh speed!");
    }

    public class InvalidFireBallSpeedException extends RuntimeException{
    }
}
