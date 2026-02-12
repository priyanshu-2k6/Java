import java.util.*;

class Employee {

    private int eid;
    private String name;
    private int day, month, year;
    private long phone;

    public void Set_EmployeeInfo(Scanner input) {
        System.out.print("Enter Employee ID: ");
        this.eid = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        this.name = input.nextLine();

        System.out.print("Enter Birth Day: ");
        this.day = input.nextInt();

        System.out.print("Enter Birth Month: ");
        this.month = input.nextInt();

        System.out.print("Enter Birth Year: ");
        this.year = input.nextInt();

        System.out.print("Enter Phone: ");
        this.phone = input.nextLong();
    }


    public void View_Profile() {
        System.out.println("\nEmployee ID: " + eid);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + day + "/" + month + "/" + year);
        System.out.println("Phone: " + phone);
    }


    public int getRetirementYear() {
        return year + 58;
    }

    public String getName() {
        return name;
    }


    public static void View_RetirementInfo(Employee s[], int n) {
        System.out.println("\nEmployees retiring after 2030:\n");
        for (int i = 0; i < n; i++) {
            if (s[i].getRetirementYear() > 2030) {
                System.out.println(s[i].getName() + 
                    " -> Retirement Year: " + s[i].getRetirementYear());
            }
        }
    }
}

public class Emp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Employee[] e = new Employee[20];

        System.out.print("Enter number of employees: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            System.out.println("\nEnter details for Employee " + (i + 1));
            e[i].Set_EmployeeInfo(in);
        }

 
        System.out.println("\n--- Employee Profiles ---");
        for (int i = 0; i < n; i++) {
            e[i].View_Profile();
        }


        Employee.View_RetirementInfo(e, n);

        in.close();
    }
}
