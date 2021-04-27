package bai2;

public class Student extends Person{
    private  double gpa;

    public Student() {
    }

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String display() {
        return super.display() + " Gpa :" + gpa;
    }
}
