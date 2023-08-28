package net.mcreator.epicstats.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.epicstats.network.EpicStatsModVariables;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class ExpManageProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player && entity instanceof Monster) {
			{
				double _setval = (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl + Mth.nextInt(new Random(), 5, 10);
				sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EXP_lvl = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if ((sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).player_lvl < 200) {
			if ((sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl >= (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl_max) {
				{
					double _setval = (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).SP + 1;
					sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SP = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl_max
							+ (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).EXP_lvl + Mth.nextInt(new Random(), 30, 60);
					sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EXP_lvl_max = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).player_lvl + 1;
					sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.player_lvl = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent((new TranslatableComponent("chat.text.lvlup").getString())), (false));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.toast.challenge_complete")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				{
					double _setval = (sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicStatsModVariables.PlayerVariables())).total_sp + 1;
					sourceentity.getCapability(EpicStatsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.total_sp = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
