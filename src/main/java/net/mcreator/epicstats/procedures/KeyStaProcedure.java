package net.mcreator.epicstats.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.epicstats.network.EpicStatsModVariables;

public class KeyStaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).SP > 0 == (entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl < 30) {
			{
				double _setval = (entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl + 1;
				entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sta_lvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).SP - 1;
				entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SP = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			SetPlayerAttributesProcedure.execute(entity);
		}
	}
}
