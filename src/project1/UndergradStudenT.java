package project1;
public class UndergradStudenT extends Student {
public UndergradStudenT(String name, String kkuId, int numCourses) {
super(name, kkuId, numCourses);
}
@Override
public double getPassingMark() { return 60.0; }
@Override
public void displayDetails() {
System.out.println("\nUndergraduate Student:");
super.displayDetails();
}
}