package org.pygmy.rpg.item.concrete;

import org.pygmy.rpg.item.Item;

public class Nothing extends Item {

    private final static Nothing INSTANCE = new Nothing(Nothing.class.getSimpleName());
    
    private Nothing(String name) {
        super(name);
    }
    
    public static Nothing create() {
        return INSTANCE;
    }
}
