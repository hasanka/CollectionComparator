package util;

public class Dog {

	private int age;
	private String name;
	private String type;

	private Dog() {
	}

	public Dog(String name, String type, int age) {
		this();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", type=" + type + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
