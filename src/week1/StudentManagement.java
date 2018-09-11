package week1;

public class StudentManagement {

	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp
	public Student[] students = new Student[100];
	// Student (max. 100)

	public static boolean sameGroup(Student s1, Student s2) {
		// TODO:
		return s1.getGroup() == s2.getGroup();
	}

	void studentsByGroup() {
		// TODO:
	}

	void removeStudent(String id) {
		// TODO:
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].getId() == id) {
				for (int j = i; j < this.students.length; j++) {
					this.students[j] = this.students[j + 1];
				}
				this.students[this.students.length] = null;
			}

		}
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

		System.out.println(nguyen.getInfo());

		Student phat = new Student();
		Student tester = new Student("Phat", "11122223333", "111222333@vnu.edu.vn");
		Student nguyenCopy = new Student(nguyen);
		System.out.println(phat.getInfo());

		Student thayHoang = new Student();
		Student thayHung = new Student();
		Student thayQuang = new Student();
		thayQuang.setGroup("INT22042");

		System.out.println(sameGroup(thayHung, thayHoang));
		System.out.println(sameGroup(thayQuang, thayHoang));

	}
}
