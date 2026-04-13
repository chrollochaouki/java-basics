public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Chaouki", 20, 15.5);
        Student s2 = new Student("Youssef", 22, 14.0);
        Student s3 = new Student("Sara", 21, 18.5);
        Student s4 = new Student("Karim", 23, 11.0);
        Person p = new Student("Test", 19, 12.0);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        System.out.println(s1.getName() + " passing: " + s1.isPassing());
        System.out.println(s2.getName() + " passing: " + s2.isPassing());
        System.out.println(s3.getName() + " passing: " + s3.isPassing());
        System.out.println(s4.getName() + " passing: " + s4.isPassing());
        p.displayInfo();
    }
}