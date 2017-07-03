package org.pygmy.rpg.item;

import org.pygmy.rpg.character.Character;

public abstract class Item {
    
    String name;

    protected Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public Item useTo(Character target) {
        return this;
    }
    
    public boolean isUsedup() {
        return false;
    }
    
}
