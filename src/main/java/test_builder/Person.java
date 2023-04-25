package test_builder;

public class Person {
	
	protected final String name;
	protected final String surname;
	protected int age;
	protected String address;
	
	
	public Person(String name, String surname, int age, String address) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	
	public void happyBirthday() {
		new PersonBuilder().setAge(age++);
	}
	
	public boolean hasAge() {
		return age >= 0;
	}
	
	public boolean hasAddress() {
		return address == null;
	}
	
	public PersonBuilder newChildBuilder() {
		PersonBuilder person = new PersonBuilder();
		person.setAge(0);
		person.setSurname(surname);
		person.setAddress(address);
		return person;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" ");
		sb.append(surname);
		if (hasAge()) {
			sb.append(" ");
			sb.append(age);
		}
		if (hasAddress()) {
			sb.append(" ");
			sb.append(address);
		}
		
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + surname.hashCode();
	}
	
}
