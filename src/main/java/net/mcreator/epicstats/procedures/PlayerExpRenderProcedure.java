package net.mcreator.epicstats.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.epicstats.network.EpicStatsModVariables;

public class PlayerExpRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##/##").format((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl) + ""
				+ new java.text.DecimalFormat("##").format((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl_max);
	}
}
