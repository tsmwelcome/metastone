package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.naxxramas;

import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.tokens.naxxramas.Nerubian;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.SummonSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.desc.SpellDesc;

public class NerubianEgg extends MinionCard {

	public NerubianEgg() {
		super("Nerubian Egg", 0, 2, Rarity.RARE, HeroClass.ANY, 2);
		setDescription("Deathrattle: Summon a 4/4 Nerubian.");
	}

	@Override
	public int getTypeId() {
		return 394;
	}

	@Override
	public Minion summon() {
		Minion nerubianEgg = createMinion();
		SpellDesc deathrattle = SummonSpell.create(new Nerubian());
		nerubianEgg.addDeathrattle(deathrattle);
		return nerubianEgg;
	}
}