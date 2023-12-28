package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public void delete(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Teacher> getAll() {
        return teachers;
    }

    public List<Teacher> getTeachersSortedByAge() {
        PersonComparator<Teacher> comparator = new PersonComparator<>();
        List<Teacher> sortedTeachers = new ArrayList<>(teachers);
        Collections.sort(sortedTeachers, comparator);
        return sortedTeachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, name);
        teachers.add(teacher);
        return;
    }
}
