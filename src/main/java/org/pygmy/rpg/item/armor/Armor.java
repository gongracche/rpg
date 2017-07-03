package org.pygmy.rpg.item.armor;

import org.pygmy.rpg.item.Item;

public abstract class Armor  extends Item {
    
    int pointOfDefence;

    protected Armor(String name) {
        super(name);
        this.pointOfDefence = 0;
    }

    public Armor(String name, int pointOfDefence) {
        super(name);
        this.pointOfDefence = pointOfDefence;
    }

    public int getPointOfDefence() {
        return pointOfDefence;
    }
    
}
