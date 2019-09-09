package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;
    public Manager(String name, String nINo, double salary, String deptName) {

        super(name, nINo, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
