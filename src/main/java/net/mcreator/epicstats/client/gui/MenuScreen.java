
package net.mcreator.epicstats.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.epicstats.world.inventory.MenuMenu;
import net.mcreator.epicstats.procedures.VitRenderProcedure;
import net.mcreator.epicstats.procedures.StrRendererProcedure;
import net.mcreator.epicstats.procedures.StaRenderProcedure;
import net.mcreator.epicstats.procedures.SpRenderProcedure;
import net.mcreator.epicstats.procedures.ResRenderProcedure;
import net.mcreator.epicstats.procedures.PlayerRenderProcedure;
import net.mcreator.epicstats.procedures.PlayerNameRenderProcedure;
import net.mcreator.epicstats.procedures.PlayerExpRenderProcedure;
import net.mcreator.epicstats.procedures.MagRenderProcedure;
import net.mcreator.epicstats.procedures.LuckRenderProcedure;
import net.mcreator.epicstats.procedures.LevelRenderProcedure;
import net.mcreator.epicstats.procedures.IntRenderProcedure;
import net.mcreator.epicstats.procedures.DexRenderProcedure;
import net.mcreator.epicstats.network.MenuButtonMessage;
import net.mcreator.epicstats.EpicStatsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MenuScreen extends AbstractContainerScreen<MenuMenu> {
	private final static HashMap<String, Object> guistate = MenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;
	Button button_empty5;
	Button button_empty6;
	Button button_empty7;

	public MenuScreen(MenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (PlayerRenderProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventory(this.leftPos + -123, this.topPos + 68, 60, (float) Math.atan((this.leftPos + -123 - mouseX) / 40.0), (float) Math.atan((this.topPos + 18 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("epic_stats:textures/screens/menu_1.png"));
		this.blit(ms, this.leftPos + -212, this.topPos + -120, 0, 0, 432, 256, 432, 256);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_str"), -55, -74, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_res"), -55, -52, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_vit"), -55, -32, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_int"), -55, -11, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_mag"), -55, 9, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_dex"), -55, 31, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_sta"), -55, 52, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_luck"), -55, 73, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_exp"), -164, 93, -1);
		this.font.draw(poseStack,

				PlayerExpRenderProcedure.execute(entity), -137, 93, -1);
		this.font.draw(poseStack,

				PlayerNameRenderProcedure.execute(entity), -165, -89, -1);
		this.font.draw(poseStack,

				StrRendererProcedure.execute(entity), 87, -73, -1);
		this.font.draw(poseStack,

				ResRenderProcedure.execute(entity), 88, -52, -1);
		this.font.draw(poseStack,

				VitRenderProcedure.execute(entity), 88, -31, -1);
		this.font.draw(poseStack,

				IntRenderProcedure.execute(entity), 87, -10, -1);
		this.font.draw(poseStack,

				MagRenderProcedure.execute(entity), 87, 11, -1);
		this.font.draw(poseStack,

				DexRenderProcedure.execute(entity), 87, 32, -1);
		this.font.draw(poseStack,

				StaRenderProcedure.execute(entity), 87, 53, -1);
		this.font.draw(poseStack,

				LuckRenderProcedure.execute(entity), 86, 74, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_points"), -22, -98, -1);
		this.font.draw(poseStack,

				SpRenderProcedure.execute(entity), 87, -98, -1);
		this.font.draw(poseStack, new TranslatableComponent("gui.epic_stats.menu.label_level"), -165, -70, -1);
		this.font.draw(poseStack,

				LevelRenderProcedure.execute(entity), -132, -70, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_empty = new Button(this.leftPos + 115, this.topPos + -79, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(0, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 115, this.topPos + -58, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty1"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(1, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + 115, this.topPos + -37, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty2"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(2, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + 115, this.topPos + -16, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty3"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(3, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new Button(this.leftPos + 115, this.topPos + 5, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty4"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(4, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
		button_empty5 = new Button(this.leftPos + 115, this.topPos + 26, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty5"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(5, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_empty5", button_empty5);
		this.addRenderableWidget(button_empty5);
		button_empty6 = new Button(this.leftPos + 115, this.topPos + 47, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty6"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(6, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_empty6", button_empty6);
		this.addRenderableWidget(button_empty6);
		button_empty7 = new Button(this.leftPos + 115, this.topPos + 68, 30, 20, new TranslatableComponent("gui.epic_stats.menu.button_empty7"), e -> {
			if (true) {
				EpicStatsMod.PACKET_HANDLER.sendToServer(new MenuButtonMessage(7, x, y, z));
				MenuButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_empty7", button_empty7);
		this.addRenderableWidget(button_empty7);
	}
}
