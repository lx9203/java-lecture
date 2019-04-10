package ExerciseOC02;

import java.time.*;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String position;
	private LocalDate joined;
	
	public Employee(int id, String name, String position, LocalDate joined) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.joined = joined;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public LocalDate getJoined() {
		return joined;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setJoined(LocalDate joined) {
		this.joined = joined;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joined=" + joined + "]";
	}

	@Override
	public int compareTo(Employee o) {
		Position thisPos = Position.valueOf(position);
		Position oPos = Position.valueOf(o.getPosition());
		
		if (thisPos.compareTo(oPos) > 0) return 1;
		if (thisPos.compareTo(oPos) < 0) return -1;
		if (joined.compareTo(o.getJoined()) > 0) return 1;
		if (joined.compareTo(o.getJoined()) < 0) return -1;
		return name.compareTo(o.getName());
	}
	
}
