public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }

    public boolean isPassing() {
        return grade >= 10;
    }
}