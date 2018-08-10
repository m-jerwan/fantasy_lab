package Player.Mage;

import Spell.ISpell;

public class Wizard extends Mage {
    int defend;

    public Wizard(String name, int mana, int baseDefend, ISpell spell) {
        super(name, mana, spell);
        this.defend = baseDefend;
    }

    @Override
    public int defend() {
        return this.defend;
    }
}
