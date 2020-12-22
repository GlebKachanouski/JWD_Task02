package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;

public abstract class ApplianceService {

	public abstract Appliance find(Criteria criteria) throws IOException;

}
