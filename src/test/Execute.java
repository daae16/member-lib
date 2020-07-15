package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execute {
	
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person("동혁",22,80));
		pList.add(new Person("상화",31,96));
		pList.add(new Person("인혁",32,90));
	    Collections.sort(pList);
	    System.out.print(pList);
	}

}
