package org.pygmy.rpg.item.armor.concrete;

import org.pygmy.rpg.item.armor.Armor;

public class NakedBody extends Armor{

    public NakedBody(String name, int pointOfDefence) {
        super(name, pointOfDefence);
    }
    
    public static NakedBody create() {
        return new NakedBody(NakedBody.class.getSimpleName(), 0);
    }
}
