package com.javierdearcos.challenge.java8.episode1.internal;

import com.javierdearcos.challenge.java8.episode1.DeathStar;
import com.javierdearcos.challenge.java8.episode1.Planet;
import com.javierdearcos.challenge.java8.episode1.Spaceship;
import com.javierdearcos.challenge.java8.episode1.WeaponException;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * First Death Star has a great power attack and high number of hit points. Requires significant time to fully recharge
 * its superlaser.
 *
 * It has a bug in an exhaust port which, when hit with a precise shot, triggers a chain reaction throughout the
 * station's entire infrastructure. Hopefully, the Rebel Alliance will never find out.
 */
public class FirstDeathStar implements DeathStar {

    private static final int CHARGE_TIME = 10;
    private static final int INITIAL_HIT_POINTS = 1000;
    private static final int ATTACK_POWER = 1000;
    private static final double HIT_EXHAUST_PORT_PROBABILITY = 0.01;

    private boolean charged = false;
    private int hitPoints = INITIAL_HIT_POINTS;

    @Override
    public void chargeSuperLaser() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(
                runnable -> {
                    Thread thread = Executors.defaultThreadFactory().newThread(runnable);
                    thread.setDaemon(true);
                    return thread;
                });

        scheduledExecutorService.schedule(() -> charged = true, CHARGE_TIME, TimeUnit.SECONDS);
    }

    @Override
    public boolean isCharged() {
        return charged;
    }

    @Override
    public void destroyPlanet(Planet planet) {
        planet.destroy();
    }

    @Override
    public boolean attack(Spaceship spaceship) throws WeaponException {
        if (!charged) {
            throw new WeaponException("Superlaser is not charged");
        }

        spaceship.hit(ATTACK_POWER);
        charged = false;

        return true;
    }

    @Override
    public void hit(int damage) {
        if (Math.random() <= HIT_EXHAUST_PORT_PROBABILITY) {
            hitPoints = 0;
        }
        else {
            hitPoints -= damage;
        }
    }

    @Override
    public boolean isDestroyed() {
        return hitPoints <= 0;
    }
}
