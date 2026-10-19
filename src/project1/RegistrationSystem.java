package project1;
import java.util.*;
public class RegistrationSystem {
private final ArrayList<Student> students = new ArrayList<>();
private final Scanner sc;
public RegistrationSystem(Scanner sc) { this.sc = sc; }
public void addStudent() {
System.out.print("Enter KKU ID (9 digits, starts with 4): ");
String id = sc.nextLine().trim();
if (!id.matches("4\\d{8}")) {
System.out.println("Invalid ID format!");
return;
}
System.out.print("Enter student name: ");
String name = sc.nextLine().trim();
System.out.print("Number of last semester courses (1-5): ");
int count = Integer.parseInt(sc.nextLine());
System.out.print("Graduate (G) or Undergraduate (U)? ");
String type = sc.nextLine().trim();
Student student;
if (type.equalsIgnoreCase("G")) {
student = new GradStudent(name, id, count);
} else {
student = new UndergradStudenT(name, id, count);
}
students.add(student);
System.out.println("Student added successfully!");
}
private Student selectStudent() {
if (students.isEmpty()) {
System.out.println("No students available.");
return null;
}
for (int i = 0; i < students.size(); i++) System.out.println((i + 1) + ". " + students.get(i).getName());
System.out.print("Select student number: ");
int index = Integer.parseInt(sc.nextLine()) - 1;
if (index >= 0 && index < students.size()) return students.get(index);
System.out.println("Invalid student!");
return null;
}
public void enterMarks() {
Student student = selectStudent();
if (student == null) return;
int[] marks = student.getMarks();
for (int i = 0; i < marks.length; i++) {
System.out.print("Enter mark for course " + (i + 1) + " (0-100): ");
marks[i] = Integer.parseInt(sc.nextLine());
}
student.setMarks(marks);
System.out.println("Marks saved!");
}
public void modifyMarks() {
Student student = selectStudent();
if (student == null) return;
int[] marks = student.getMarks();
for (int i = 0; i < marks.length; i++) {
System.out.println("Course " + (i + 1) + " current mark: " + marks[i]);
System.out.print("Enter new mark (-1 to keep): ");
int mark = Integer.parseInt(sc.nextLine());
if (mark >= 0 && mark <= 100) {
marks[i] = mark;
}
}
student.setMarks(marks);
System.out.println("Marks saved!");
}
public void displayStudentDetails() {
Student student = selectStudent();
if (student != null) student.displayDetails();
}
public void displayMarksInfo() {
Student student = selectStudent();
if (student != null) student.displayMarks();
}
}