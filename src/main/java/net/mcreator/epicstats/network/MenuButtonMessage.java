
package net.mcreator.epicstats.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.epicstats.world.inventory.MenuMenu;
import net.mcreator.epicstats.procedures.KeyVitProcedure;
import net.mcreator.epicstats.procedures.KeyStrProcedure;
import net.mcreator.epicstats.procedures.KeyStaProcedure;
import net.mcreator.epicstats.procedures.KeyResProcedure;
import net.mcreator.epicstats.procedures.KeyMagProcedure;
import net.mcreator.epicstats.procedures.KeyLuckProcedure;
import net.mcreator.epicstats.procedures.KeyIntProcedure;
import net.mcreator.epicstats.procedures.KeyDexProcedure;
import net.mcreator.epicstats.EpicStatsMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MenuButtonMessage {
	private final int buttonID, x, y, z;

	public MenuButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MenuButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MenuButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MenuButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MenuMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			KeyStrProcedure.execute(entity);
		}
		if (buttonID == 1) {

			KeyResProcedure.execute(entity);
		}
		if (buttonID == 2) {

			KeyVitProcedure.execute(entity);
		}
		if (buttonID == 3) {

			KeyIntProcedure.execute(entity);
		}
		if (buttonID == 4) {

			KeyMagProcedure.execute(entity);
		}
		if (buttonID == 5) {

			KeyDexProcedure.execute(entity);
		}
		if (buttonID == 6) {

			KeyStaProcedure.execute(entity);
		}
		if (buttonID == 7) {

			KeyLuckProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EpicStatsMod.addNetworkMessage(MenuButtonMessage.class, MenuButtonMessage::buffer, MenuButtonMessage::new, MenuButtonMessage::handler);
	}
}
