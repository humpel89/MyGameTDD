package world.items;

public abstract class Item {

	
	private String itemName;
	
	public Item(){
		
	}
	
	public String getItemName(){
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
