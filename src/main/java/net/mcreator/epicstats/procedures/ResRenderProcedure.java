package net.mcreator.epicstats.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.epicstats.network.EpicStatsModVariables;

public class ResRenderProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + new java.text.DecimalFormat("##").format((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl);
	}
}
