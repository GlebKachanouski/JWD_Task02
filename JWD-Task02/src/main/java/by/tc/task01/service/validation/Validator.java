package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		if(criteria.containsValue(null)) {
			return false;
		}
		switch (criteria.getGroupSearchName()) {
			case "Laptop":
				return checkLaptop(criteria);
			case "Oven":
				return checkOven(criteria);
			case "Refrigerator":
				return checkRefrigerator(criteria);
			case "Speakers":
				return checkSpeakers(criteria);
			case "TabletPC":
				return checkTabletPC(criteria);
			case "VacuumCleaner":
				return checkVacuumCleaner(criteria);
			default:
				return false;
		}
	}

	private static boolean checkLaptop(Criteria criteria) {
		if (criteria.containsKey("BATTERY_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("BATTERY_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("BATTERY_CAPACITY").toString()) >= 10000) {
				return false;
			}
		}
		if (criteria.containsKey("MEMORY_ROM")) {
			if (Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) >= 100000) {
				return false;
			}
		}
		if (criteria.containsKey("SYSTEM_MEMORY")) {
			if (Integer.parseInt(criteria.getValue("SYSTEM_MEMORY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("SYSTEM_MEMORY").toString()) >= 10000) {
				return false;
			}
		}
		if (criteria.containsKey("CPU")) {
			if (Double.parseDouble(criteria.getValue("CPU").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("CPU").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("DISPLAY_INCHS")) {
			if (Integer.parseInt(criteria.getValue("DISPLAY_INCHS").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("DISPLAY_INCHS").toString()) >= 100) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkOven(Criteria criteria) {
		if (criteria.containsKey("WEIGHT")) {
			if (Integer.parseInt(criteria.getValue("WEIGHT").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("WEIGHT").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("CAPACITY").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 100000) {
				return false;
			}
		}
		if (criteria.containsKey("DEPTH")) {
			if (Double.parseDouble(criteria.getValue("DEPTH").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("DEPTH").toString()) >= 200) {
				return false;
			}
		}
		if (criteria.containsKey("HEIGHT")) {
			if (Double.parseDouble(criteria.getValue("HEIGHT").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("HEIGHT").toString()) >= 200) {
				return false;
			}
		}
		if (criteria.containsKey("WIDTH")) {
			if (Double.parseDouble(criteria.getValue("WIDTH").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("WIDTH").toString()) >= 200) {
				return false;
			}
		}

		return true;
	}

	private static boolean checkRefrigerator(Criteria criteria) {
		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 10000) {
				return false;
			}
		}
		if (criteria.containsKey("HEIGHT")) {
			if (Double.parseDouble(criteria.getValue("HEIGHT").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("HEIGHT").toString()) >= 400) {
				return false;
			}
		}
		if (criteria.containsKey("WIDTH")) {
			if (Double.parseDouble(criteria.getValue("WIDTH").toString()) <= 0
					|| Double.parseDouble(criteria.getValue("WIDTH").toString()) >= 200) {
				return false;
			}
		}
		if (criteria.containsKey("WEIGHT")) {
			if (Integer.parseInt(criteria.getValue("WEIGHT").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("WEIGHT").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("FREEZER_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("FREEZER_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("FREEZER_CAPACITY").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("OVERALL_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("OVERALL_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("OVERALL_CAPACITY").toString()) >= 1000) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkSpeakers(Criteria criteria) {
		if (criteria.containsKey("NUMBER_OF_SPEAKERS")) {
			if (Integer.parseInt(criteria.getValue("NUMBER_OF_SPEAKERS").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("NUMBER_OF_SPEAKERS").toString()) >= 50) {
				return false;
			}
		}
		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("CORD_LENGTH")) {
			if (Integer.parseInt(criteria.getValue("CORD_LENGTH").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("CORD_LENGTH").toString()) >= 50) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkTabletPC(Criteria criteria) {
		if (criteria.containsKey("MEMORY_ROM")) {
			if (Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("MEMORY_ROM").toString()) >= 1000000) {
				return false;
			}
		}
		if (criteria.containsKey("BATTERY_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("BATTERY_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("BATTERY_CAPACITY").toString()) >= 100) {
				return false;
			}
		}
		if (criteria.containsKey("FLASH_MEMORY_CAPACITY")) {
			if (Integer.parseInt(criteria.getValue("FLASH_MEMORY_CAPACITY").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("FLASH_MEMORY_CAPACITY").toString()) >= 1000) {
				return false;
			}
		}
		if (criteria.containsKey("DISPLAY_INCHES")) {
			if (Integer.parseInt(criteria.getValue("DISPLAY_INCHES").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("DISPLAY_INCHES").toString()) >= 100) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkVacuumCleaner(Criteria criteria) {
		if (criteria.containsKey("CLEANING_WIDTH")) {
			if (Integer.parseInt(criteria.getValue("CLEANING_WIDTH").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("CLEANING_WIDTH").toString()) >= 200) {
				return false;
			}
		}
		if (criteria.containsKey("MOTOR_SPEED_REGULATION")) {
			if (Integer.parseInt(criteria.getValue("MOTOR_SPEED_REGULATION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("MOTOR_SPEED_REGULATION").toString()) >= 100000) {
				return false;
			}
		}
		if (criteria.containsKey("POWER_CONSUMPTION")) {
			if (Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) <= 0
					|| Integer.parseInt(criteria.getValue("POWER_CONSUMPTION").toString()) >= 100000) {
				return false;
			}
		}
		return true;
	}


}

//you may add your own new classes