package me.sirrus86.nbtedit.nbt;

public class NBTCommandStats extends NBTData {
	
	public NBTCommandStats(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Fake player name about how many blocks were modified in the last command
	 */
	public String getAffectedBlocksName() {
		return compound.getString("AffectedBlocksName");
	}
	
	/**
	 * Objective's name about how many blocks were modified in the last command (will be an int)
	 */
	public String getAffectedBlocksObjective() {
		return compound.getString("AffectedBlocksObjective");
	}
	
	/**
	 * Fake player name about how many entities were altered in the last command
	 */
	public String getAffectedEntitiesName() {
		return compound.getString("AffectedEntitiesName");
	}
	
	/**
	 * Objective's name about how many entities were altered in the last command (will be an int)
	 */
	public String getAffectedEntitiesObjective() {
		return compound.getString("AffectedEntitiesObjective");
	}
	
	/**
	 * Fake player name about how many items were altered in the last command
	 */
	public String getAffectedItemsName() {
		return compound.getString("AffectedItemsName");
	}
	
	/**
	 * Objective's name about how many items were altered in the last command (will be an int)
	 */
	public String getAffectedItemsObjective() {
		return compound.getString("AffectedItemsObjective");
	}
	
	/**
	 * Fake player name about the query result of the last command
	 */
	public String getQueryResultName() {
		return compound.getString("QueryResultName");
	}
	
	/**
	 * Objective's name about the query result of the last command
	 */
	public String getQueryResultObjective() {
		return compound.getString("QueryResultObjective");
	}
	
	/**
	 * Fake player name about the number of successes of the last command
	 */
	public String getSuccessCountName() {
		return compound.getString("SuccessCountName");
	}
	
	/**
	 * Objective's name about the number of successes of the last command (will be an int)
	 */
	public String getSuccessCountObjective() {
		return compound.getString("SuccessCountObjective");
	}
	
}
