package Prudhvi;

// Contributed by Prudhvi: Core Data Model
public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double gpa;
    
    // Constructor
    public Student(int id, String name, int age, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }
    
    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getGpa() { return gpa; }
    
    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    
    // Display method
    public void displayInfo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("  Student ID: " + id);
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Course: " + course);
        System.out.println("  GPA: " + gpa);
        System.out.println("╚════════════════════════════════════════╝");
    }
}