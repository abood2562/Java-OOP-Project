package project1;
import java.util.*;
public class Main {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
RegistrationSystem reg = new RegistrationSystem(sc);
while (true) {
System.out.println("\n1. Enter Student Details\n2. Enter Marks\n3. Display Marks Info\n4. Display Student Details\n5. Modify Marks\n6. Exit");
int choice = Integer.parseInt(sc.nextLine());
switch (choice) {
case 1:
reg.addStudent();
break;
case 2:
reg.enterMarks();
break;
case 3:
reg.displayMarksInfo();
break;
case 4:
reg.displayStudentDetails();
break;
case 5:
reg.modifyMarks();
break;
case 6:
System.out.println("Exiting... Goodbye!");
return;
default:
System.out.println("Invalid choice! Try again.");
}
System.out.println();
}
}
}
}