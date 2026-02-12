class Emp {
    String name;
    int eid;
    double basic;

    public Emp(String name, int eid, double basic) {
        this.name = name;
        this.basic = basic;
        this.eid = eid;
    }

    double calSal() {
        return basic / 12;
    }
}

class Manager extends Emp {
    double bonus = 5000.0;

    public Manager(String name, int eid, double basic) {
        super(name, eid, basic);
    }

    @Override
    double calSal() {
        return (basic / 12) + bonus;
    }
}

class Clerk extends Emp {
    double overtimeAllowance = 2000.0;

    public Clerk(String name, int eid, double basic) {
        super(name, eid, basic);
    }

    @Override
    double calSal() {
        return (basic / 12) + overtimeAllowance;
    }
}

public class Emppay {
    public static void main(String[] args) {
        Emp e1 = new Manager("Jack", 101, 120000);
        Emp e2 = new Clerk("Jill", 102, 60000);
        System.out.println("--- Employee Payroll ---");
        System.out.println("Manager Jack Salary: $ " + e1.calSal());
        System.out.println("Clerk Jill Salary: $ " + e2.calSal());
    }
}