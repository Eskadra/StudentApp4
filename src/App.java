import java.util.ArrayList;
import java.util.List;

import Controllers.AccountController;
import Domain.Student;
import Domain.Teacher;
import Domain.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        /*Students*/
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 21);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        /*Teachers*/
        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");
        Teacher t3 = new Teacher("Николай", 34, "Docent");
        Teacher t4 = new Teacher("Василий", 38, "Docent");
        Teacher t5 = new Teacher("Анастасия", 60, "Docent");
        Teacher t6 = new Teacher("Дмитрий", 65, "Docent");

        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t1);
        listTeach.add(t2);
        listTeach.add(t3);
        listTeach.add(t4);
        listTeach.add(t5);
        listTeach.add(t6);       
        
        /*Employee*/
        Employee e1 = new Employee("Михаил", 20, "");
        Employee e2 = new Employee("Сергей", 31, "");
        Employee e3 = new Employee("Николай", 38, "");
        Employee e4 = new Employee("Алексей", 39, "");
        Employee e5 = new Employee("Антон", 50, "");
        Employee e6 = new Employee("Александр", 41, "");

        List<Employee> listEmp = new ArrayList<Employee>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);
        listEmp.add(e5);
        listEmp.add(e6);  

        //System.out.println(": " + AccountController.averageAge(listTeach));
        System.out.println("Средний возраст студентов: " + AccountController.averageAge(listStud));
        System.out.println("Средний возраст учителей: " + AccountController.averageAge(listTeach));
        System.out.println("Средний возраст работников: " + AccountController.averageAge(listEmp));

    }
}
