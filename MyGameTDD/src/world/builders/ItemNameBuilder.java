package world.builders;

import java.util.Random;

import world.items.resources.ArmorType;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class ItemNameBuilder {

	private static Random random = new Random();

	private static final String[] equipmentEndingName = {"Frog", "Duck", "Troll", "Moose", "Swan", "Eagle", "Bear", "Horse"};
	private static final String[] foodNames = {"Bird Stew", "Bear Steak", "Lentil's Soup", "Blueberry Pie"};
	private static final String[] beverageNames = {"Batwing Tea", "Fresh Water", "Elven Coffee", "Lingonberry Juice"};

	public static String constructRandomWeaponName(Quality quality, WeaponType type){
		return createEquipmentName(quality.toString(), type.toString(), randomNameFrom(equipmentEndingName));
	}

	public static String constructRandomArmorName(Quality quality, ArmorType type){
		return createEquipmentName(quality.toString(), type.toString(), randomNameFrom(equipmentEndingName));
	}

	private static String createEquipmentName(String quality, String type, String endingName){
		String name = trimToStartWithCapital(quality) + " " + trimToStartWithCapital(type);
		if(quality.matches(Quality.COMMON.toString()))
			return name;
		name += " Of The " + endingName;
		return name;
	}
	
	private static String randomNameFrom(String[] nameList) {
		int randomInteger = random.nextInt(nameList.length);
		return nameList[randomInteger];
	}
	
	public static String getRandomFoodName(){
		return randomNameFrom(foodNames);
	}

	public static String getRandomBeverageName(){
		return randomNameFrom(beverageNames);
	}

	private static String trimToStartWithCapital(String name){
		String trimmed = name.toString().substring(0, 1).toUpperCase();
		trimmed += name.toString().substring(1).toLowerCase();
		return trimmed;
	}
}
