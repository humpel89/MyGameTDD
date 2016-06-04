package world.items;

public abstract class Item {

	private int itemLevel;
	private String itemName;
	
	public int getItemLevel(){
		return this.itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	
	public String getItemName(){
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
