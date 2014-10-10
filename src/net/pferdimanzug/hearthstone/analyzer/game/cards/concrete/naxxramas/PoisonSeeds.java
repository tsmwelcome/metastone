package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.naxxramas;

import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SpellCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.tokens.druid.Treant;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.spells.DestroySpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.MetaSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.SummonSpell;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.EntityReference;
import net.pferdimanzug.hearthstone.analyzer.game.targeting.TargetSelection;

public class PoisonSeeds extends SpellCard {

	public PoisonSeeds() {
		super("Poison Seeds", Rarity.COMMON, HeroClass.DRUID, 4);
		setDescription("Destroy all minions and summon 2/2 treants to replace them");

		setSpell(MetaSpell.create(DestroySpell.create(), SummonSpell.create(new Treant())));
		setTargetRequirement(TargetSelection.NONE);
		setPredefinedTarget(EntityReference.ALL_MINIONS);
	}

	@Override
	public int getTypeId() {
		return 395;
	}

}