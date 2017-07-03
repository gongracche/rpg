package org.pygmy.rpg.item.concrete;

import org.pygmy.rpg.character.Character;
import org.pygmy.rpg.item.Item;

public class Portion extends Item {

    int quantity;
    
    private Portion(String name) {
        super(name);
        this.quantity = 30;
    }
    
    public static Portion create() {
        return new Portion(Portion.class.getSimpleName());
    }

    @Override
    public Item useTo(Character target) {
       target.giveLife(this.quantity);
       this.quantity -= this.quantity;
       return this;
    }

    @Override
    public boolean isUsedup() {
        return this.quantity <= 0;
    }

    
}
