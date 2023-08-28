package net.mcreator.epicstats.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.epicstats.network.EpicStatsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetPlayerAttributesProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 0.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 1.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 2.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 3.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 4.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 5.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 6.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 7.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 8.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 9.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 10");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 10.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 11");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 11.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 12");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 12.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 13");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 13.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 14");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 14.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).str_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_damage base set 15");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_knockback base set 0.6");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 0");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 0.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 1.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 2.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 3.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 4.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 5.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 6.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 7.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 8.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 9.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 10");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 10.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 11");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 11.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 12");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 12.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 13");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 13.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 14");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).res_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor base set 15");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.armor_toughness base set 2");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 20");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 21");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 22");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 23");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 24");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 25");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 26");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 27");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 28");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 29");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 30");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 31");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 32");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 33");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 34");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 35");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 36");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 37");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 38");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 39");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 40");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 41");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 42");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 43");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 44");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 45");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 46");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 47");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 48");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).vit_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.max_health base set 50");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s iron_spellbooks:cast_time_reduction base set 1.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 1.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 2.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cast_time_reduction base set 3");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 1.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).int_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:cooldown_reduction base set 2");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_power base set 1.5");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 100");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 110");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 120");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 130");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 140");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 150");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 160");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 170");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 180");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 190");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 200");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 210");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 220");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 230");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 240");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 250");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 260");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 270");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 280");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 290");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:max_mana base set 300");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 1.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).mag_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s irons_spellbooks:spell_resist base set 2");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.10");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.11");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.12");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.13");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.14");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.15");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.16");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.17");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.18");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.19");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.20");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.21");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.22");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.23");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.24");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.25");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.26");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.27");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.28");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 4.50");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).dex_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.attack_speed base set 5");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 0");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 15");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 50");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 16");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 100");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 17");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 150");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 18");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 200");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 19");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 250");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 20");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 300");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 21");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 350");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 22");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 400");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 23");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 450");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 24");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 500");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 25");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 550");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 26");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 600");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 27");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 650");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 28");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 700");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 29");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 750");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 30");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 800");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 31");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 850");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 32");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 900");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 33");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 950");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 34");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1000");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 35");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1050");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 36");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1100");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 37");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1150");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 38");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1200");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 39");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1250");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 40");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1300");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 41");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1350");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 42");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1400");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 43");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).sta_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s paraglider:max_stamina base set 1500");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s epicfight:staminar base set 44");
				}
			}
			if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 1) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 2) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 3) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 4) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 5) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 6) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 7) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 8) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 9) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 10) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 0.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 11) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 12) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 13) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 14) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 15) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 16) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 17) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 18) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 19) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 20) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 1.9");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 21) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 22) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.1");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 23) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.2");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 24) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.3");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 25) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.4");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 26) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.5");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 27) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.6");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 28) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.7");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 29) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.8");
				}
			} else if ((entity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).luck_lvl == 30) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "attribute @s minecraft:generic.luck base set 2.9");
				}
			}
		}
	}
}
