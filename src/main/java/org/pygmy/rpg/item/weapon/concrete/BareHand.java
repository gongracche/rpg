package org.pygmy.rpg.item.weapon.concrete;

import org.pygmy.rpg.item.weapon.Weapon;

public class BareHand extends Weapon{

    public BareHand(String name, int pointOfAttack) {
        super(name, pointOfAttack);
    }
    
    public static BareHand create() {
        return new BareHand(BareHand.class.getSimpleName(), 0);
    }
}
