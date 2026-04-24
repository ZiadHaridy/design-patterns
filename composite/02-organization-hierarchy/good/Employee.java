/**
 * Leaf — an individual contributor with no reports.
 */
public class Employee extends OrgUnit {

    public Employee(String name, String title, double salary) {
        super(name, title, salary);
    }

    @Override
    public double totalSalary() {
        return salary;
    }

    @Override
    public void printOrgChart(String indent) {
        System.out.println(indent + "- " + name + " (" + title + ")");
    }
}
