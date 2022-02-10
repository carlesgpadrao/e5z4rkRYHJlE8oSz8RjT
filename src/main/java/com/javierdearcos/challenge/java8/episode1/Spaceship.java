package com.javierdearcos.challenge.java8.episode1;

/**
 * A Spaceship represents a vehicle or machine designed to fly in outer space and fight in a battle.
 */
public interface Spaceship {

    /**
     * Attack another spaceship causing damage. The damage depends on the spaceship attack power and can fail depending
     * on the precision of the weapons.
     * @param spaceship Spaceship to attack to.
     * @return <code>true</code> if the attack has been successful, otherwise <code>false</code>.
     * @throws WeaponException Exception executing the attack.
     */
    boolean attack(Spaceship spaceship) throws WeaponException;

    /**
     * Receives a hit that cause damage.
     * @param damage The damage caused with the hit.
     */
    void hit(int damage);

    /**
     * Returns true if, and only if, the spaceship is destroyed.
     * @return <code>true</code> if the spaceship is destroyed, otherwise <code>false</code>.
     */
    boolean isDestroyed();
}
