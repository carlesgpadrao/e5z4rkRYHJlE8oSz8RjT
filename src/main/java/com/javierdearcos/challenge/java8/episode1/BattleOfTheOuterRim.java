package com.javierdearcos.challenge.java8.episode1;

import com.javierdearcos.challenge.java8.episode1.internal.DefaultPlanet;
import com.javierdearcos.challenge.java8.episode1.internal.FirstDeathStar;
import com.javierdearcos.challenge.java8.episode1.internal.RebelAllianceCommander;

/**
 * The Battle of the Outer Rim, where the Empire will test its new weapon, codename "Death Star", and the rebels forces
 * will try to stop it.
 */
public class BattleOfTheOuterRim {

    public static void main(String[] args) throws Exception {
        Planet tatooine = new DefaultPlanet("Tatooine", "Outer Rim", "Desert", true);
        DeathStar deathStar = new FirstDeathStar();
        Commander rebelAllianceCommander = new RebelAllianceCommander(100);

        deathStar.chargeSuperLaser();
        while (!deathStar.isCharged()) {
            Spaceship spaceship = rebelAllianceCommander.requestSpaceship();
            boolean hit = spaceship.attack(deathStar);

            if (hit && deathStar.isDestroyed()) {
                System.out.println("¡The Rebel Alliance has saved the galaxy!");
                return;
            }
        }
        deathStar.destroyPlanet(tatooine);

        if (tatooine.isDestroyed()) {
            System.out.println("The Empire will rule the galaxy...");
        }
    }
}
