package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person1 {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	

}
public class MangTest1 {
	
	public static void main(String[] args) {
		
		
		List<Map<Object,Person>> pList = new ArrayList<>();
		Map<Object,Person> mMap = new HashMap<>();
		
		
		for(int i =0 ; i<4 ; i++) {
			Map mm = new HashMap();
			
			
			
		}
		
		Person1 ps1 = new Person1();
		ps1.setName("김망고센세");
		ps1.setAge(29);
		
		Person1 ps2 = new Person1();
		ps2.setName("조민서");
		ps2.setAge(32);
		
		Person1 ps3 = new Person1();
		ps3.setName("신송희");
		ps3.setAge(30);
		
		Person1 ps4 = new Person1();
		ps4.setName("장동진");
		ps4.setAge(27);
		
		
		
		
		
		
		
	}



}