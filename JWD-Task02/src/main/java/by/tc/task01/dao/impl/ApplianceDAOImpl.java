package by.tc.task01.dao.impl;

import by.tc.task01.StoreFactory.ApplianceStore;
import by.tc.task01.StoreFactory.Store;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		String deviceParameters = readFile(criteria);
		Appliance appliance = findAppliance(deviceParameters, criteria);
		return appliance;
	}

	private Appliance findAppliance(String objectSpecification, Criteria criteria) {
		if (objectSpecification == null) {
			return null;
		} else {
			HashMap<String, Object> resultMap = createResMap(objectSpecification, criteria);
			Store store = new ApplianceStore();
			return store.orderElectronics(criteria.getGroupSearchName(), resultMap);
		}
	}

	private String readFile(Criteria criteria) throws IOException {
		boolean isFind;

		File objectsList = new File("resources/appliances_db.txt");
		FileReader fileReader = new FileReader(objectsList);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String specification = "";
		String mainPatternSpecification;
		String patternSpecification = "";

		while ((specification = bufferedReader.readLine()) != null) {
			isFind = true;
			if (specification.contains(criteria.getGroupSearchName())) {
				for (String required : criteria.keySet()) {
					mainPatternSpecification = required + "=" + criteria.getValue(required) + ",";
					patternSpecification = "" + criteria.getValue(required);
					if (!specification.contains(mainPatternSpecification)
							& !patternSpecification.equals(specification.substring(specification.length() - patternSpecification.length()).trim())) {
						isFind = false;
						break;
					}
				}

			} else {
				isFind = false;
			}
			if (isFind) {
				bufferedReader.close();
				return specification;
			}
		}

		bufferedReader.close();
		return null;
	}

	private HashMap<String, Object> createResMap(String objectSpecification, Criteria criteria) {
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		objectSpecification = "," + objectSpecification;
		String objectSpecs[] = objectSpecification.split(",[^=]*=");
		switch (criteria.getGroupSearchName()) {
			case "Laptop":
				parameters.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), Double.parseDouble(objectSpecs[1]));
				parameters.put(SearchCriteria.Laptop.OS.toString(), objectSpecs[2]);
				parameters.put(SearchCriteria.Laptop.MEMORY_ROM.toString(), Integer.parseInt(objectSpecs[3]));
				parameters.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), Integer.parseInt(objectSpecs[4]));
				parameters.put(SearchCriteria.Laptop.CPU.toString(), Double.parseDouble(objectSpecs[5]));
				parameters.put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(), Integer.parseInt(objectSpecs[6]));
				return parameters;
			case "Oven":
				parameters.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), Integer.parseInt(objectSpecs[1]));
				parameters.put(SearchCriteria.Oven.WEIGHT.toString(), Integer.parseInt(objectSpecs[2]));
				parameters.put(SearchCriteria.Oven.CAPACITY.toString(), Integer.parseInt(objectSpecs[3]));
				parameters.put(SearchCriteria.Oven.DEPTH.toString(), Integer.parseInt(objectSpecs[4]));
				parameters.put(SearchCriteria.Oven.HEIGHT.toString(), Double.parseDouble(objectSpecs[5]));
				parameters.put(SearchCriteria.Oven.WIDTH.toString(), Double.parseDouble(objectSpecs[6]));
				return parameters;
			case "Refrigerator":
				parameters.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), Integer.parseInt(objectSpecs[1]));
				parameters.put(SearchCriteria.Refrigerator.WEIGHT.toString(), Integer.parseInt(objectSpecs[2]));
				parameters.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), Double.parseDouble(objectSpecs[3]));
				parameters.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), Integer.parseInt(objectSpecs[4]));
				parameters.put(SearchCriteria.Refrigerator.HEIGHT.toString(), Integer.parseInt(objectSpecs[5]));
				parameters.put(SearchCriteria.Refrigerator.WIDTH.toString(), Integer.parseInt(objectSpecs[6]));
				return parameters;
			case "Speakers":
				parameters.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), Integer.parseInt(objectSpecs[1]));
				parameters.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), Integer.parseInt(objectSpecs[2]));
				parameters.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), objectSpecs[3]);
				parameters.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), Integer.parseInt(objectSpecs[4]));
				return parameters;
			case "TabletPC":
				parameters.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), Integer.parseInt(objectSpecs[1]));
				parameters.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), Integer.parseInt(objectSpecs[2]));
				parameters.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), Integer.parseInt(objectSpecs[3]));
				parameters.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), Integer.parseInt(objectSpecs[4]));
				parameters.put(SearchCriteria.TabletPC.COLOR.toString(), objectSpecs[5]);
				return parameters;
			case "VacuumCleaner":
				parameters.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), Integer.parseInt(objectSpecs[1]));
				parameters.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), objectSpecs[2]);
				parameters.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), objectSpecs[3]);
				parameters.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), objectSpecs[4]);
				parameters.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), Integer.parseInt(objectSpecs[5]));
				parameters.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), Integer.parseInt(objectSpecs[6]));
				return parameters;
			default:
				return null;
		}

	}
}


//you may add your own new classes