package org.pygmy.rpg.item.concrete;

import org.pygmy.rpg.character.Character;
import org.pygmy.rpg.item.Item;

public class Portion extends Item {

    private Portion(String name) {
        super(name);
    }
    
    public static Portion create() {
        return new Portion(Portion.class.getSimpleName());
    }

    @Override
    public Item useTo(Character target) {
       target.giveLife(30);
       return this;
    }

}
