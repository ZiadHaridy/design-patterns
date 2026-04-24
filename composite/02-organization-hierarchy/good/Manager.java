import java.util.ArrayList;
import java.util.List;

/**
 * Composite — a manager with reports.
 * Each report is itself an OrgUnit, so it can be an Employee or another Manager.
 */
public class Manager extends OrgUnit {

    private final List<OrgUnit> reports = new ArrayList<>();

    public Manager(String name, String title, double salary) {
        super(name, title, salary);
    }

    public Manager add(OrgUnit report) {
        reports.add(report);
        return this;
    }

    @Override
    public double totalSalary() {
        double total = salary;
        for (OrgUnit report : reports) {
            total += report.totalSalary();
        }
        return total;
    }

    @Override
    public void printOrgChart(String indent) {
        System.out.println(indent + "+ " + name + " (" + title + ")");
        for (OrgUnit report : reports) {
            report.printOrgChart(indent + "  ");
        }
    }
}
