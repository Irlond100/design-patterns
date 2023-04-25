package test_builder;

public class PersonBuilder {
	
	protected String name;
	protected String surname;
	protected int age =-1;
	protected String address;
	
	public PersonBuilder setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Нет имени");
		} else {
			this.name = name;
		}
		return this;
	}
	
	public PersonBuilder setSurname(String surname) {
		if (surname == null || surname.isEmpty()) {
			throw new IllegalArgumentException("Нет фамилии ");
		} else {
			this.surname = surname;
		}
		return this;
	}
	
	public PersonBuilder setAge(int age) {
		if (age < 0 || age > 120) {
			throw new IllegalArgumentException("Неправильный возраст");
		} else {
			this.age = age;
		}
		return this;
		
	}
	
	public PersonBuilder setAddress(String address) {
		
		this.address = address;
		
		return this;
		
	}
	
	public Person build() {
		
		if (name == null || surname == null) {
			throw new IllegalStateException("Ошибка в имени или фамилии");
		}
		return new Person(name, surname, age, address);
		
	}
	
}
