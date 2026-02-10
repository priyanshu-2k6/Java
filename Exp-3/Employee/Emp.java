import java.util.*;

class Employee {

    private int eid;
    private String name, dob;
    private long phone;

    public void Set_EmployeeInfo(int eid, String name, String dob, long phone) {
        this.name = name;
        this.dob = dob;
        this.eid = eid;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void View_Profile() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Phone No: " + phone);
    }

    public static void Sort_Employee(Employee[] s) {
        Employee temp;

        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] != null && s[j] != null) {
                    if (s[i].getName().compareToIgnoreCase(s[j].getName()) > 0) {
                        temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }
    }

}

public class Emp {
    public static void main(String[] args) {
        String N, d;
        int e;
        long p;
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[20];
        System.out.print("Enter no of Employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.print("Enter Employee Id: ");
            e = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            N = sc.nextLine();
            System.out.print("Enter DOB: ");
            d = sc.nextLine();
            System.out.print("Enter Phone No: ");
            p = sc.nextLong();

            emp[i].Set_EmployeeInfo(e, N, d, p);
        }
        Employee.Sort_Employee(emp);
        System.out.println();
        System.out.println("--- Sorted Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].View_Profile();
        }
        sc.close();
    }
}