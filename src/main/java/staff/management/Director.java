package staff.management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String nINo, double salary, String deptName, double budget){
        super(name, nINo, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
