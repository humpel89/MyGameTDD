package world.creators;

import java.util.Random;

import world.items.resources.ArmorType;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class ItemNameTool {

	private Random random = new Random();

	private final String[] equipmentEndingName = {"Frog", "Duck", "Troll", "Moose", "Swan", "Eagle", "Bear", "Horse"};
	private final String[] foodNames = {"Bird Stew", "Bear Steak", "Lentil's Soup", "Blueberry Pie"};
	private final String[] beverageNames = {"Batwing Tea", "Fresh Water", "Elven Coffee", "Lingonberry Juice"};

	public String constructRandomWeaponName(Quality quality, WeaponType type){
		return createEquipmentName(quality.toString(), type.toString(), randomNameFrom(equipmentEndingName));
	}

	public String constructRandomArmorName(Quality quality, ArmorType type){
		return createEquipmentName(quality.toString(), type.toString(), randomNameFrom(equipmentEndingName));
	}

	private String createEquipmentName(String quality, String type, String endingName){
		String name = trimToStartWithCapital(quality) + " " + trimToStartWithCapital(type);
		if(quality.matches(Quality.COMMON.toString()))
			return name;
		name += " Of The " + endingName;
		return name;
	}
	
	private String randomNameFrom(String[] nameList) {
		int randomInteger = random.nextInt(nameList.length);
		return nameList[randomInteger];
	}
	
	public String getRandomFoodName(){
		return randomNameFrom(foodNames);
	}

	public String getRandomBeverageName(){
		return randomNameFrom(beverageNames);
	}



	public String trimToStartWithCapital(String name){
		String trimmed = name.toString().substring(0, 1).toUpperCase();
		trimmed += name.toString().substring(1).toLowerCase();
		return trimmed;
	}
}
