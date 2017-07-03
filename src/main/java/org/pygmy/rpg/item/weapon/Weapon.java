package org.pygmy.rpg.item.weapon;

import org.pygmy.rpg.item.Item;

public abstract class Weapon extends Item {
    
    int pointOfAttack;
    
    protected Weapon(String name) {
        super(name);
        this.pointOfAttack = 0;
    }

    public Weapon(String name, int pointOfAttack) {
        super(name);
        this.pointOfAttack = pointOfAttack;
    }

    public int getPointOfAttack() {
        return pointOfAttack;
    }
    
}
