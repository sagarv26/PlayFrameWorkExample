package controllers;

import java.util.Comparator;

import models.District;
import models.Places;

class DistrictComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		District d1=(District)o1;
		District d2=(District)o2;
		return d1.district_name.compareTo(d2.district_name);
	}
	
	
}
