package com.matcracker.MCPE_AddOnAPI.entities;

public enum EntityType {
	ARROW("arrow.skeleton"),
	BAT("bat"),
	BLAZE("blaze"),
	BOAT("boat"),
	CAVE_SPIDER("cavespider"),
	CHICKEN("chicken"),
	COW("cow"),
	CREEPER("creeper"),
	DONKEY("donkey"),
	ENDERMAN("enderman"),
	FIREBALL("fireball.large"),
	FIREBALL_SMALL("fireball.small"),
	FISHING_HOOK("fishinghook"),
	GHAST("ghast"),
	GUARDIAN("guardian"),
	GUARDIAN_ELDER("guardian.elder"),
	HORSE("horse"),
	IRON_GOLEM("irongolem"),
	LIGHTNING_OLT("lightningbolt"),
	MAGMA_CUBE("magmacube"),
	MINECART("minecart"),
	MINECART_CHEST("minecartchest"),
	MINECART_HOPPER("minecarthopper"),
	MINECART_TNT("minecarttnt"),
	//@TODO Add more entities
	PLAYER("player"),
	SKELETON("skeleton"),
	ZOMBIE("zombie"),
	ZOMBIE_HORSE("zombiehorse"),
	ZOMBIE_HUSK("husk"),
	ZOMBIE_PIGMAN("pig_zombie"),
	ZOMBIE_VILLAGER("zombie_villager");



	private String identifier;

	private EntityType(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return "minecraft:" + identifier;
	}
}
