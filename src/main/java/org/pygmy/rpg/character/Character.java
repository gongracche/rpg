package org.pygmy.rpg.character;

import java.util.LinkedList;
import java.util.List;
import org.pygmy.rpg.item.Item;
import org.pygmy.rpg.item.armor.Armor;
import org.pygmy.rpg.item.armor.concrete.NakedBody;
import org.pygmy.rpg.item.concrete.Nothing;
import org.pygmy.rpg.item.weapon.Weapon;
import org.pygmy.rpg.item.weapon.concrete.BareHand;

public class Character {

    String name;
    int pointOfLife;
    int pointOfStrength;
    int pointOfEndurance;

    List<Item> items;

    Weapon weapon;
    Armor armer;

    public Character(String name, int pointOfLife, int pointOfStrength, int pointOfEndurance) {
        this.name = name;
        this.pointOfLife = pointOfLife;
        this.pointOfStrength = pointOfStrength;
        this.pointOfEndurance = pointOfEndurance;
        this.items = new LinkedList<>();
        this.weapon = BareHand.create();
        this.armer = NakedBody.create();
    }

    public void equip(Weapon weapon) {
        this.weapon = weapon;
        if (this.weapon == null) {
            this.weapon = BareHand.create();
        }
    }

    public void equip(Armor armer) {
        this.armer = armer;
        if (this.armer == null) {
            this.armer = NakedBody.create();
        }
    }

    public String getName() {
        return name;
    }

    public int getPointOfLife() {
        return pointOfLife;
    }

    public int getPointOfAttack() {
        return this.pointOfStrength + this.weapon.getPointOfAttack();
    }

    public void giveDamage(int pointOfDamage) {
        this.pointOfLife -= pointOfDamage - (this.armer.getPointOfDefence() * (1 + (this.pointOfEndurance / 100)));
    }

    public void attackTo(Character target) {
        target.giveDamage(this.getPointOfAttack());
    }
    
    public void giveLife(int pointOfLife) {
        this.pointOfLife += pointOfLife;
    }

    public void giveItem(Item item) {
        this.items.add(item);
    }

    public Item takeItem(Class clazz) {
        Item item = Nothing.create();
        for (Item i : this.items) {
            if (i.getClass().equals(clazz)) {
                item = i;
                this.items.remove(i);
                break;
            }
        }
        return item;
    }

    public int getCountOfItems() {
        return this.items.size();
    }
    
}
