package exam14;

public class Student extends Person {
	public static void main(String[] args) {
		Student student1 = new Student(1988,"자바",20);
		Student student2 = new Student(1988,"자바",20);
		System.out.println(student1);
		System.out.println(student2);
	}
	
	// 필드
	private int id;
	private String name;
	private int score;

	// 생성자
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	// 메소드
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public int hashCode() {
		return id+name.hashCode();
	}
}
