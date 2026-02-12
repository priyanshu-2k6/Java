import java.util.*;

class student {
  String regNumber;
  String Name;
  String city;
  public void set_profile(Scanner input) {
    System.out.print("Enter your regNumber: ");
    this.regNumber = input.next();
    System.out.print("Enter your Name: ");
    this.Name = input.next();
    System.out.print("Enter your City: ");
    this.city = input.next();
  }
  public void view_profile() {
    System.out.println(this.Name+" " + this.regNumber+" " + this.city);
  }
  public static void search(student t[], String inputName) {
    boolean found = false;
    for (int i = 0; i < t.length; i++) {
      if (t[i].Name.equals(inputName)) {
        System.out.println(t[i].regNumber +" "+ t[i].city);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("No such student in the array !");
    }
  }
}
public class Stud {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    student[] java = new student[3];
    for (int i = 0; i < java.length; i++) {
      java[i] = new student();
    }
    for (int i = 0; i < java.length; i++) {
      java[i].set_profile(input);
      java[i].view_profile();
    }
    System.out.print("Enter the name to search: ");
    String searchName = input.next();
    student.search(java, searchName);

    input.close();
  }
}