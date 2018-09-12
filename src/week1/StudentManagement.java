package week1;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp
    ArrayList<Student>  students = new ArrayList<Student>();
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
		for (int i = 0; i < this.students.size(); i++) {
			if (this.students.get(i).getId() == id) {
				this.students.remove(i);
                i--;
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

//		nguyen.getName();
//
//      nguyen.getInfo();

		Student phat = new Student();
		Student tester = new Student("Phat", "11122223333", "111222333@vnu.edu.vn");
		Student nguyenCopy = new Student(nguyen);
//		phat.getInfo();

		Student thayHoang = new Student();
		Student thayHung = new Student();
		Student thayQuang = new Student();
		thayQuang.setGroup("INT22042");
//
//		System.out.println(sameGroup(thayHung, thayHoang));
//		System.out.println(sameGroup(thayQuang, thayHoang));


        StudentManagement studentManagement = new StudentManagement();
        studentManagement.students.add(thayHoang);
        studentManagement.students.add(thayHung);
        studentManagement.students.add(thayQuang);
        studentManagement.students.add(tester);
        studentManagement.removeStudent("000");
        for (Student student : studentManagement.students){
            student.getInfo();
        }
	}
}
