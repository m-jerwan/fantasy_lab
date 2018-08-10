package Player.Mage;

import Spell.ISpell;

public class Warlock extends Mage {
    int defend;

    public Warlock(String name, int mana, int baseDefend, ISpell spell) {
        super(name, mana, spell);
        this.defend = baseDefend;
    }

    @Override
    public int defend() {
        return this.defend;
    }
}