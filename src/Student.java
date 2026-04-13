public class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);   // Person handles name and age
        this.grade = grade; // Student handles grade
    }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    @Override
    public void displayInfo() {
        super.displayInfo(); // calls Person's displayInfo
        System.out.println("Grade: " + grade);
    }

    public boolean isPassing() {
        return grade >= 10;
    }
}