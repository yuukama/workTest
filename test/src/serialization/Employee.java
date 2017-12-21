package serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	
	
	private String name;
	private String id;
	private transient String salary;
    private String password;
	
	public Employee(String name, String id, String salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return "Employee{name="+name+",id="+id+",salary="+salary+"} test for git hub";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}