package bai2;

import bai1.Employee;

public class demo {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        Teacher teacher[] = new Teacher[5];

        student[0] = new Student("a", 18, "Da Nang", 10);
        student[1] = new Student("b", 15, "Da Nang", 9);
        student[2] = new Student("c", 16, "Da Nang", 8);
        student[3] = new Student("d", 10, "Da Nang", 10);
        student[4] = new Student("e", 20, "Da Nang", 9);
        showStudent(student);

        teacher[0] = new Teacher("a", 25, "Da Nang", 1000);
        teacher[1] = new Teacher("b", 25, "Da Nang", 2000);
        teacher[2] = new Teacher("c", 25, "Da Nang", 1400);
        teacher[3] = new Teacher("d", 25, "Da Nang", 1200);
        teacher[4] = new Teacher("e", 25, "Da Nang", 1500);
        showTeacher(teacher);

        System.out.println("Salary of teacher :");
        salaryTe(teacher);

        System.out.println("Age of Student :");
        ageSt(student);
    }

    public static void showStudent(Student student[]) {
        for (Student st : student) {
            System.out.println(st.display());
        }
    }

    public static void showTeacher(Teacher teacher[]) {
        for (Teacher te : teacher) {
            System.out.println(te.display());
        }
    }

    public static void salaryTe(Teacher teacher[]) {
        Teacher temp = teacher[0];
        for (int i = 0; i < teacher.length - 1; i++) {
            for (int j = i + 1; j < teacher.length; j++) {
                if (teacher[i].getSalary() < teacher[j].getSalary()) {
                    temp = teacher[j];
                    teacher[j] = teacher[i];
                    teacher[i] = temp;
                }
            }
        }
        for(int i = 0;i<3 ;i++){
            System.out.println(teacher[i].display());
        }
    }

    public static void ageSt(Student student[]) {
        Student temp = student[0];
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getAge() > student[j].getAge()) {
                    temp = student[j];
                    student[j] = student[i];
                    student[i] = temp;
                }
            }
        }
        for(int i=0;i<1;i++){
            System.out.println(student[i].display());
        }
    }
}
