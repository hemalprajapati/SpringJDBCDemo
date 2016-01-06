/**
 * 
 */
package main.java.demo;

/**
 * @author hemal.prajapati
 *
 */
public class Student {
	
	private int id;
	
	private String first_Name;
	
	private String last_Name;
	
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((first_Name == null) ? 0 : first_Name.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((last_Name == null) ? 0 : last_Name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
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
		Student other = (Student) obj;
		if (first_Name == null) {
			if (other.first_Name != null)
				return false;
		} else if (!first_Name.equals(other.first_Name))
			return false;
		if (id != other.id)
			return false;
		if (last_Name == null) {
			if (other.last_Name != null)
				return false;
		} else if (!last_Name.equals(other.last_Name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", first_Name=" + first_Name
				+ ", last_Name=" + last_Name + ", salary=" + salary + "]";
	}
	
	

}
