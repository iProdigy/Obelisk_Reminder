package com.Obelisk_Reminder;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;


@Slf4j
@PluginDescriptor(
	name = "Obelisk Reminder"
)
public class Obelisk_ReminderPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private Obelisk_ReminderConfig config;

	@Inject Obelisk_ReminderOverlay overlay;

	@Override
	protected void startUp() throws Exception
	{

	}

	@Override
	protected void shutDown() throws Exception
	{

	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			
		}
	}

	@Provides
	Obelisk_ReminderConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(Obelisk_ReminderConfig.class);
	}
}
