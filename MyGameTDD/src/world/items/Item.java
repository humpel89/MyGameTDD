package world.items;

public abstract class Item {

	private int itemLevel = 1;
	
	public int getItemLevel(){
		return itemLevel;
	}

	public void setItemLevel(int itemLevel) {
		this.itemLevel = itemLevel;
	}
	
}
