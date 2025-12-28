import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Has kids (true/false): ");
        boolean hasKids = scanner.nextBoolean();

        Student student = new Student(age, name, hasKids, "Math", 80f);
        student.setAttendance(75f);

        Employee employee = new Employee(35, "Arman", false, "Teacher", 10f);

        System.out.println("\nStudent info:");
        student.introduce();
        System.out.println("Role: " + student.getRole());
        System.out.println("Major: " + student.getMajor());
        System.out.println("Attendance: " + student.getAttendance());

        System.out.println("\nEmployee info:");
        employee.introduce();
        System.out.println("Role: " + employee.getRole());
        System.out.println("Profession: " + employee.getProfession());
        System.out.println("Experience: " + employee.getExperience());

        System.out.println("\nEmployees count: " + Employee.employeeCount);

        scanner.close();
    }
}
