package me.ryanhamshire.GriefPrevention.events;

import me.ryanhamshire.GriefPrevention.Claim;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClaimBeforeCreateEvent extends Event implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	
	private boolean cancelled = false;
	private Claim claim;

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public ClaimBeforeCreateEvent(Claim claim) {
		this.claim = claim;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean isCancelled) {
		this.cancelled = isCancelled;
	}
	
	public Claim getClaim() {
		return claim;
	}
}