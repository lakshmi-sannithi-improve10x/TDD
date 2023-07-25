package com.improve10x.fibonacci.templerungame;

public class Obstacle {
    protected String name;
    protected int damage;

    public Obstacle(String name, int damage) throws InvalidObstacleDamageException {
        this.name = name == null ? "" : name.trim();
        if (damage < 0 || damage > 100) {
            throw new InvalidObstacleDamageException();
        }
        this.damage = damage;
    }

    public void collide(Player player) {
        System.out.println(name + "has collide with" + player.getName() + "and caused" + damage + "damage.");
        player.reduceHealth(damage);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public class InvalidObstacleDamageException extends Exception {
    }
}
