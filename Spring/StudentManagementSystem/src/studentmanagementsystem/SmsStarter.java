package studentmanagementsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

	public static void main(String[] args) {
            
                ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("./spring-context.xml");
                context.start();
		StudentManagementSystem sms=new StudentManagementSystem();
                Student s1=new Student("abc", "Perera", 1234, "katunayaka") ;
                Student s2=new Student("def", "silva", 2345, "Colombo") ;
		//load the bean from spring
		sms.listAllStudents();
		sms.registerStudent(s1);
                sms.registerStudent(s2);
		sms.listAllStudents();
	}
}
