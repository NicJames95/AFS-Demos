package demoOOP;

import java.util.Objects;

public class Employee {
	private String name;
	private Integer age;
	public Employee(String name, Integer age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	// In order to ensure that we can compare values of employee or compare two employees we have hashCode and equals method 
	// HashCode will get the unique object id and equals will compare two objects depending on what we get out of HashCode 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if(age == null) {
			if(other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
			return true;
		}
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}

}
