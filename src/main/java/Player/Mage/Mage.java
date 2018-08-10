package Player.Mage;

import Enemy.Defend.IDefend;
import Player.Player;
import Spell.ISpell;

public abstract class Mage extends Player implements IDefend {
    private int mana;
    ISpell spell;

    public Mage(String name, int mana, ISpell spell) {
        super(name);
        this.mana = mana;
        this.spell = spell;
    }

    public int getMana() {
        return mana;
    }

    public ISpell getSpell() {
        return spell;
    }
}
