class Student {
    private String name; // Private field

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe"); // Set the name using setter
        System.out.println("Student Name: " + student.getName()); // Get the name using getter
    }
}
