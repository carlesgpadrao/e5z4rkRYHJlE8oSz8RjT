package com.javierdearcos.challenge.java8.episode1;

/**
 * A WeaponException represents an error using a weapon.
 */
public class WeaponException extends Exception {

    /**
     * Constructor.
     * @param message meaningful description of the weapon error.
     */
    public WeaponException(String message) {
        super(message);
    }
}
