package week1;

public class StudentManagement {

	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp
	// Student (max. 100)

	public boolean sameGroup(Student s1, Student s2) {
		// TODO:
		return s1.getGroup() == s2.getGroup();
	}

	void studentsByGroup() {
		// TODO:
	}

	void removeStudent(String id) {
		// TODO:
	}

	public static void main(String[] args) {
		// TODO:
		Student goodStudent = new Student();
		Student badStudent = new Student();

		Student nguyen = new Student();
		nguyen.setName("Nguyen");
		nguyen.setGroup("INT2204 4");
		nguyen.setId("17020936");
		nguyen.setEmail("ngokhoaisan1999@gmail.com");

		System.out.println(nguyen.getName());

		nguyen.getInfo();

		Student phat = new Student();
		Student tester = new Student("Phat", "11122223333", "111222333@vnu.edu.vn");
		Student nguyenCopy = new Student(nguyen);
		phat.getInfo();
	}
}
