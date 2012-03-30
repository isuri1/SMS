package studentmanagementsystem;

public class StudentManagementSystem {

	private StudentRepository repo;

	public void listAllStudents() {
		//Get all the students from repository and print them in the screen
            System.out.println(repo.findAllStudents());
	}

	public void registerStudent(Student stu){
		//Save the new student using repository
            repo.saveStudent(stu);
	}
}
