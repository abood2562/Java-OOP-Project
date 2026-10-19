package project1;
import java.util.Arrays;
public abstract class Student implements Displayable {
private String name;
private String kkuId;
private int[] marks;
public Student(String name, String kkuId, int numCourses) {
this.name = name;
this.kkuId = kkuId;
this.marks = new int[numCourses];
}
public String getName() { return name; }
public String getKkuId() { return kkuId; }
public int[] getMarks() { return marks.clone(); }
public void setMarks(int[] marks) { this.marks = marks.clone(); }
public abstract double getPassingMark();
public double getAverage() {
int sum = 0;
for (int i = 0; i < marks.length; i++) {
sum = sum + marks[i];
}
if (marks.length == 0) return 0;
return (double) sum / marks.length;
}
public int getMax() {
int max = -1;
for (int i = 0; i < marks.length; i++) {
if (marks[i] > max) {
max = marks[i];
}
}
return max;
}
public int getMin() {
int min = 101;
for (int i = 0; i < marks.length; i++) {
if (marks[i] < min) {
min = marks[i];
}
}
return min;
}
public boolean isPass() { return getAverage() >= getPassingMark(); }
public void displayMarks() {
System.out.println("---- Marks Information ----");
System.out.println("Marks: " + Arrays.toString(marks));
System.out.printf("Average: %.2f\n", getAverage());
System.out.println("Maximum: " + getMax());
System.out.println("Minimum: " + getMin());
if (isPass()) {
System.out.println("Pass");
} else {
System.out.println("Fail");
}
System.out.println();
}
public void displayDetails() {
System.out.println("Name: " + name);
System.out.println("KKU ID: " + kkuId);
System.out.println("Number of Courses: " + marks.length);
}
}