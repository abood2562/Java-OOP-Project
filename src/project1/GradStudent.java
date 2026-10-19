package project1;
public class GradStudent extends Student {
public GradStudent(String name, String kkuId, int numCourses) {
super(name, kkuId, numCourses);
}
@Override
public double getPassingMark() { return 80.0; }
@Override
public void displayDetails() {
System.out.println("\nGraduate Student:");
super.displayDetails();
}
}