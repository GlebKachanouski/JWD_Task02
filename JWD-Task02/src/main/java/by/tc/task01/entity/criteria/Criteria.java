package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object getValue(String searchCriteria) {
		return criteria.get(searchCriteria);
	}

	public Set<String> keySet() {
		return criteria.keySet();
	}

	public boolean containsKey(String key) {
		if (criteria.containsKey(key)) {
			return true;
		}
		return false;
	}

	public boolean containsValue(Object value) {
		if(criteria.containsValue(value)) {
			return true;
		}else {
			return false;
		}
	}

}
