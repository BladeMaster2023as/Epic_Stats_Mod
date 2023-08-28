
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epicstats.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.epicstats.network.KeyMenuMessage;
import net.mcreator.epicstats.EpicStatsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EpicStatsModKeyMappings {
	public static final KeyMapping KEY_MENU = new KeyMapping("key.epic_stats.key_menu", GLFW.GLFW_KEY_M, "key.categories.misc");
	private static long KEY_MENU_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(KEY_MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == KEY_MENU.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						KEY_MENU_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - KEY_MENU_LASTPRESS);
						EpicStatsMod.PACKET_HANDLER.sendToServer(new KeyMenuMessage(1, dt));
						KeyMenuMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
