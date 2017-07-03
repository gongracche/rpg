package org.pygmy.rpg;

import org.pygmy.rpg.character.Character;
import org.pygmy.rpg.item.Item;
import org.pygmy.rpg.item.armor.concrete.IronArmor;
import org.pygmy.rpg.item.concrete.Portion;
import org.pygmy.rpg.item.weapon.concrete.IronSword;
import org.pygmy.rpg.item.weapon.concrete.SteelAxe;

public class Main {

    public static void main(String[] args) {

        // プレーヤーと敵を作成
        Character player = new Character("player", 100, 10, 10);
        Character enemy = new Character("enemy", 100, 10, 10);

        // プレーヤーにポーションを持たせる
        System.out.println("アイテム：ポーションを持たせる");
        dumpCountOfItems(player);
        player.giveItem(Portion.create());
        dumpCountOfItems(player);

        // 攻撃
        System.out.println("攻撃");
        dumpPointOfLife(player);
        enemy.attackTo(player);
        dumpPointOfLife(player);

        // 武器と防具を装備
        player.equip(IronSword.create());
        player.equip(IronArmor.create());
        
        enemy.equip(SteelAxe.create());
        
        // 攻撃（装備後）
        System.out.println("攻撃（装備後）");
        dumpPointOfLife(player);
        enemy.attackTo(player);
        dumpPointOfLife(player);

        // プレーヤーのポーションを使う
        // 1) ポーションを取り出して…
        System.out.println("アイテム：ポーションを取り出して…");
        dumpCountOfItems(player);
        Item item = player.takeItem(Portion.class);
        dumpCountOfItems(player);
        // 2) 使う
        System.out.println("アイテム：使う");
        dumpPointOfLife(player);
        item.useTo(player);
        dumpPointOfLife(player);
    }

    private static void dumpPointOfLife(Character character) {
        System.out.println(character.getName() + " -> Point of Life = " + character.getPointOfLife());
    }
    
    private static void dumpCountOfItems(Character character) {
        System.out.println(character.getName() + " -> Count of Items = " + character.getCountOfItems());
    }
}
