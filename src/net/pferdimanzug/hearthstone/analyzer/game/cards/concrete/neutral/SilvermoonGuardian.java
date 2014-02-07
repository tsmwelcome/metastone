package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.neutral;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class SilvermoonGuardian extends MinionCard {

	public SilvermoonGuardian() {
		super("Silvermoon Guardian", Rarity.COMMON, HeroClass.ANY, 4);
	}

	@Override
	public Minion summon() {
		return createMinion(3, 3, GameTag.DIVINE_SHIELD);
	}

}