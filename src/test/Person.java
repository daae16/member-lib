package test;

public class Person implements Comparable<Person> {
	
	public String name;
	public int age;
	public int point;

	public Person(String name, int age, int point) {
		super();
		this.name = name;
		this.age = age;
		this.point = point;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(point>o.point) return -1;
		if(point<o.point) return 1;   
		return 0; // return point-o.point; (위 두 열을 지우고 사용 가능)
	}

	

}
