package org.pygmy.rpg.item.weapon.concrete;

import org.pygmy.rpg.item.weapon.Weapon;

public class IronSword extends Weapon{
    
    private IronSword(String name, int pointOfAttack) {
        super(name, pointOfAttack);
    }
    
    public static IronSword create() {
        return new IronSword(IronSword.class.getSimpleName(), 10);
    }
    
}
