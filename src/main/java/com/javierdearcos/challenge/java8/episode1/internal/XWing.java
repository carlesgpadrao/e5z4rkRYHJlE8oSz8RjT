package com.javierdearcos.challenge.java8.episode1.internal;

import com.javierdearcos.challenge.java8.episode1.Spaceship;

/**
 * Named for the distinctive shape made when its wings are in attack position, the X-wing was a class of spaceship used
 * by the Rebel Alliance in their conflict with the Galactic Empire.
 *
 * It has a moderate attack power and accuracy but are very weak when they are hit.
 */
public class XWing implements Spaceship {

    private static final double ACCURACY = 0.3;
    private static final int ATTACK_POWER = 7;
    private static final int INITIAL_HIT_POINTS = 1;

    private int hitPoints = INITIAL_HIT_POINTS;

    @Override
    public boolean attack(Spaceship spaceship) {
        if (Math.random() > ACCURACY) {
            spaceship.hit(ATTACK_POWER);
            return true;
        }

        return false;
    }

    @Override
    public void hit(int damage) {
        hitPoints -= damage;
    }

    @Override
    public boolean isDestroyed() {
        return hitPoints <= 0;
    }
}
