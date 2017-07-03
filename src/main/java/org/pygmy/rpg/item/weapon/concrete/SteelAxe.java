package org.pygmy.rpg.item.weapon.concrete;

import org.pygmy.rpg.item.weapon.Weapon;

public class SteelAxe extends Weapon {

    private SteelAxe(String name, int pointOfAttack) {
        super(name, pointOfAttack);
    }

    public static SteelAxe create() {
        return new SteelAxe(SteelAxe.class.getSimpleName(), 30);
    }

}
