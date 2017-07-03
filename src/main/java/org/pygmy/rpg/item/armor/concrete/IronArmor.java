package org.pygmy.rpg.item.armor.concrete;

import org.pygmy.rpg.item.armor.Armor;

public class IronArmor extends Armor {
    
    private IronArmor(String name, int pointOfDefence) {
        super(name, pointOfDefence);
    }
    
    public static IronArmor create() {
        return new IronArmor(IronArmor.class.getSimpleName(), 10);
    }
}
